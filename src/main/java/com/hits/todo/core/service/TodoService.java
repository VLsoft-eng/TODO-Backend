package com.hits.todo.core.service;

import com.hits.todo.API.dto.NewTodoDto;
import com.hits.todo.core.entity.Todo;
import com.hits.todo.core.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoService {
    TodoRepository todoRepository;

    @Autowired
    public void setTodoRepository(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public void save(NewTodoDto newTodoDto) {
        Todo todo = Todo.builder()
                .creator_id(newTodoDto.getCreator_id())
                .title(newTodoDto.getTitle())
                .build();

        todoRepository.save(todo);
    }
}
