package com.MSPRSecuServeur.MsprSecuServeur.controller;

import com.MSPRSecuServeur.MsprSecuServeur.model.User;
import org.springframework.web.bind.annotation.*;

@RestController()
@RequestMapping("/login")
public class LoginController {

    @GetMapping("/")
    public User getLogin(){
        return new User(1, "charly", "privat", "charly74cp00@gmail.com");
    }

    @PostMapping("/")
    public Boolean postLogin(@RequestBody User user){
        return true;
    }
}