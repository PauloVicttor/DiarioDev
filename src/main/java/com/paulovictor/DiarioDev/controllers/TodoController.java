package com.paulovictor.DiarioDev.controllers;

import com.paulovictor.DiarioDev.client.TodosServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TodoController {
    @Autowired
    TodosServiceClient todosServiceClient;

    @GetMapping("/getFakeApiData")
    public @ResponseBody List<Object> getAll(){
        return List.of(todosServiceClient.getAllTodos());
    }
}
