package com.MSPRSecuServeur.MsprSecuServeur.model;

import javax.persistence.Entity;

@Entity
public class Email {
    private String toEmail;
    private String subject = "Mail de vérification";
    private String body;

    public Email(String toEmail, String body) {
        this.toEmail = toEmail;
        this.subject = "Mail de vérification";
        this.body = body;
    }

    public String getToEmail() {
        return toEmail;
    }

    public void setToEmail(String toEmail) {
        this.toEmail = toEmail;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
