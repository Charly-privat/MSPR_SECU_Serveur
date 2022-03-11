package com.MSPRSecuServeur.MsprSecuServeur.controller;

import com.MSPRSecuServeur.MsprSecuServeur.model.Email;
import com.MSPRSecuServeur.MsprSecuServeur.services.EmailSenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Email")
public class EmailController {

    @Autowired
    EmailSenderService emailSenderService;

    @PostMapping("/verification")
    public Boolean postEmail(@RequestBody Email email){
        emailSenderService.sendEmail(email);
        return true;
    }
}
