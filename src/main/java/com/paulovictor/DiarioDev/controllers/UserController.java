package com.paulovictor.DiarioDev.controllers;


import com.paulovictor.DiarioDev.Services.UserService;
import com.paulovictor.DiarioDev.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/save")
    private @ResponseBody User save(@RequestBody User user){
        return userService.save(user);
    }
}
