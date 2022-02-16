package com.MsprSecuServeur.msprSecuServeur.model;

public class Utilisateur {
    private String login, password;

    public Utilisateur(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }
    public String getPassword() {
        return password;
    }
}
