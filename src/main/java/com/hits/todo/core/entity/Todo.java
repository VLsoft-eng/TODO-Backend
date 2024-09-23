package com.hits.todo.core.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "todos")
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title" )
    private String title;

    @Column(name = "isdone")
    private Boolean isdone;
}
