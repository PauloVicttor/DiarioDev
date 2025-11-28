package com.paulovictor.DiarioDev.Services.impl;

import com.paulovictor.DiarioDev.Services.CommentService;
import com.paulovictor.DiarioDev.Services.UserService;
import com.paulovictor.DiarioDev.models.Comment;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    private AmqpTemplate amqpTemplate;

    @Autowired
    private UserService userService;

    @Value("${DiarioDev.rabbitmq.exchange}")
    private String exchange;

    @Value("${DiarioDev.rabbitmq.routingkey}")
    private String routingkey;

    public Comment send(Comment comment) {
        comment.setUser(userService.get(comment.getUser().getUserId()));

        amqpTemplate.convertAndSend(exchange, routingkey, comment);
        System.out.println("Send msg = " + comment);
        return comment;
    }
}