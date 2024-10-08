package com.hits.todo.API.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class NewTodoDto {
    private Long creator_id;
    private String title;
}
