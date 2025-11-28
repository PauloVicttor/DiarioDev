package com.paulovictor.DiarioDev.controllers;

import com.paulovictor.DiarioDev.Services.CommentService;
import com.paulovictor.DiarioDev.models.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/comments")
public class CommentController {
    @Autowired
    CommentService commentService;

    @PostMapping(path = "/save")
    private @ResponseBody Comment save(@RequestBody Comment comment) {
        return commentService.send(comment);
    }
}
