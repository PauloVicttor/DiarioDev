package com.paulovictor.DiarioDev.models;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "Post")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long postId;
    private String Title;
    private String Content;
    private Date date;

    @ManyToOne
    private User userId;

    public Post( final Long postId, final String title, final String content, final Date date,
                 final User userId) {
        this.postId = postId;
        Title = title;
        Content = content;
        this.date = date;
        this.userId = userId;
    }

    public Long getPostId() {
        return postId;
    }

    public String getTitle() {
        return Title;
    }

    public String getContent() {
        return Content;
    }

    public Date getDate() {
        return date;
    }

    public User getUserId() {
        return userId;
    }

    public void setPostId(Long postId) {
        this.postId = postId;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public void setContent(String content) {
        Content = content;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setUserId(User userId) {
        this.userId = userId;
    }
}
