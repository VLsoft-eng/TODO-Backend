package com.hits.todo.API.controllers;

import com.hits.todo.API.dto.NewTodoDto;
import com.hits.todo.API.dto.NewTodoRequest;
import com.hits.todo.core.repository.TodoRepository;
import com.hits.todo.core.security.UserDetailsImpl;
import com.hits.todo.core.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/todos")
public class TodoController {
   TodoService todoService;

    @Autowired
    public void setTodoService(TodoService todoService) {
        this.todoService = todoService;
    }

    @PostMapping("/new")
    public void createTodo(@RequestBody NewTodoRequest newtodo, @AuthenticationPrincipal UserDetailsImpl userDetails) {
        Long id = userDetails.getId();
        String title = newtodo.getTitle();
        todoService.save(new NewTodoDto(id, title));
    }



}
