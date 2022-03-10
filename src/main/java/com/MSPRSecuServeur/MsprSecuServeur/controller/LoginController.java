package com.MSPRSecuServeur.MsprSecuServeur.controller;

import com.MSPRSecuServeur.MsprSecuServeur.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @GetMapping
    public User getLogin(){
        return new User(1, "charly", "privat");
    }
}
