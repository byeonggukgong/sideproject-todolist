package com.example.todolist.todo;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TodoTests {

    @Test
    public void Todo_빌더로_생성하기_테스트() {
        Todo todo = Todo.builder()
            .title("제목")
            .contents("내용")
            .build();

        assertThat(todo.getTitle()).isEqualTo("제목");
        assertThat(todo.getContents()).isEqualTo("내용");
    }
}
