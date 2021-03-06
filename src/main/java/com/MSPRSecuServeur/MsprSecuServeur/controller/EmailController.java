package com.MSPRSecuServeur.MsprSecuServeur.controller;

import com.MSPRSecuServeur.MsprSecuServeur.model.User;
import com.MSPRSecuServeur.MsprSecuServeur.services.EmailSenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Email")
public class EmailController {

    @Autowired
    EmailSenderService emailSenderService;



    @PostMapping("/Send")
    public Boolean postEmail(@RequestBody User user){
        emailSenderService.sendEmail(user);
        return true;
    }

    @PostMapping("/CompareCode")
    public Boolean getEmailCode(@RequestBody Integer code){
        return true /*user.compareCode(code)*/;
    }
}
