package com.hits.todo.API.controllers;

import com.hits.todo.API.dto.NewTodoDto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/todos")
public class TodoController {
    @PostMapping("/newtodo")
    public void createTodo(@RequestBody NewTodoDto newtodo, @RequestHeader("Authorization") String token) {

    }
}
