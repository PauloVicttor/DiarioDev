package com.paulovictor.DiarioDev.Services;

import com.paulovictor.DiarioDev.models.User;

import java.util.List;

public interface UserService {
    User save(User user);

    List<User> getAll();

    User update(Long id, User user);

    void delete(Long id);

    User get(Long id);
}
