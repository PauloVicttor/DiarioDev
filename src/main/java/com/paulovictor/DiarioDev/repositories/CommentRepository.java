package com.paulovictor.DiarioDev.repositories;

import com.paulovictor.DiarioDev.models.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
}