package com.MSPRSecuServeur.MsprSecuServeur.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class User {

    @Id
    private long id;

    private String nom;

    private String prenom;

    public User(){}

    private int code;

    public User(long id, String nom, String prenom, String email) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.code = 0;
    }

    public void makeEmailCode(){ //Fabrique un code à 5 chiffres
        StringBuilder s = new StringBuilder();

        for (int i=0; i<6; i++){
            s.append(Math.random() * 9);
        }

        this.code = Integer.parseInt(s.toString());
    }

    public boolean compareCode(int code){
        return code == this.code;
    }
}
