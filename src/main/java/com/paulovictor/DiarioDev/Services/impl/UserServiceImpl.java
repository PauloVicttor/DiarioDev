package com.paulovictor.DiarioDev.Services.impl;

import com.paulovictor.DiarioDev.Services.UserService;
import com.paulovictor.DiarioDev.models.User;
import com.paulovictor.DiarioDev.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> getAll() {
        return userRepository.findAll();
    }

    @Override
    public User save(final User user){
        User existingUser = userRepository.findByUsername(user.getName());
        if (Objects.nonNull(existingUser)){
            throw new RuntimeException("Existing User");
        }
        User entity = new User(user.getUserId(), user.getName(), user.getEmail(), user.getPassword(), user.getRole());
        User newUser = userRepository.save(entity);
        return new User(newUser.getUserId(), newUser.getName(), newUser.getEmail(), newUser.getPassword(), newUser.getRole());
    }
}