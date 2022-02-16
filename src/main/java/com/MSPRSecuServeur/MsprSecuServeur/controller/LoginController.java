package com.MsprSecuServeur.msprSecuServeur.controller;

import com.MsprSecuServeur.msprSecuServeur.model.Utilisateur;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:8081")
public class LoginController{

    @GetMapping
    public ResponseEntity getLogin(@RequestBody Utilisateur user){
        System.out.println(user.toString());
        return ResponseEntity.ok(HttpStatus.OK);
    }


}
