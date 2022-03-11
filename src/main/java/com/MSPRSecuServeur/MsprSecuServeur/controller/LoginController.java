package com.MSPRSecuServeur.MsprSecuServeur.controller;

import com.MSPRSecuServeur.MsprSecuServeur.model.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class LoginController {

    @GetMapping
    public User getLogin(){
        return new User(1, "charly", "privat");
    }

    @PostMapping
    public Boolean postLogin(@RequestBody User user){
        System.out.println(user.toString());
        return true;
    }
}
