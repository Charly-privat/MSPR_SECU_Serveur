package com.MSPRSecuServeur.MsprSecuServeur.controller;

import com.MSPRSecuServeur.MsprSecuServeur.model.User;
import org.springframework.web.bind.annotation.*;

@RestController()
@RequestMapping("/login")
public class LoginController {

    @GetMapping("/")
    public User getLogin(@RequestBody User user){
        return user;
    }

    @PostMapping("/")
    public Boolean postLogin(@RequestBody User user){
        return true;
    }
}