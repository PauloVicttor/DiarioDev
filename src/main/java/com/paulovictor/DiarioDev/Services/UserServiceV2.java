package com.paulovictor.DiarioDev.Services;

import com.paulovictor.DiarioDev.models.User;
import org.springframework.stereotype.Service;

@Service
public class UserServiceV2 {

    public User get(Long id) {

        return new User();


    }

}