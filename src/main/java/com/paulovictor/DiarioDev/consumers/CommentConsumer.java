package com.paulovictor.DiarioDev.consumers;

import com.paulovictor.DiarioDev.models.Comment;
import com.paulovictor.DiarioDev.models.User;
import com.paulovictor.DiarioDev.repositories.CommentRepository;
import com.paulovictor.DiarioDev.repositories.UserRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CommentConsumer {

    @Autowired
    private CommentRepository commentRepository;

    @Autowired
    private UserRepository userRepository;

    @RabbitListener(queues = "${DiarioDev.rabbitmq.queue}")
    public void receivedMessage(Comment comment) {

        User user = userRepository.findById(comment.getUser().getUserId()).orElseThrow(() -> new EntityNotFoundException("User not found"));
        comment.setUser(user);

        System.out.println("Received Message From RabbitMQ: " + comment);

        commentRepository.save(comment);
    }
}