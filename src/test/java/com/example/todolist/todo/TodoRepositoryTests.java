package com.example.todolist.todo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@DataJpaTest
public class TodoRepositoryTests {

    @Autowired
    private TodoRepository todoRepository;

    @Test
    public void Todo_저장하고_가져오기_테스트() {
        todoRepository.save(
            Todo.builder()
                .title("제목")
                .contents("내용")
                .build());

        Todo todo = todoRepository.findById(1L)
            .orElseThrow(NullPointerException::new);

        assertThat(todo.getTitle()).isEqualTo("제목");
        assertThat(todo.getContents()).isEqualTo("내용");
    }
}
