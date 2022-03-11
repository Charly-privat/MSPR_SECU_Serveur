package com.MSPRSecuServeur.MsprSecuServeur.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class User {

    @Id
    private long id;

    private String login;

    private String password;

    public User(){}

    public User(long id, String login, String password) {
        this.id = id;
        this.login = login;
        this.password = password;
    }
}
