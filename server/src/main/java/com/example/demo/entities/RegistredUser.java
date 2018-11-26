package com.example.demo.entities;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.util.List;

@Entity
@DiscriminatorValue("1")
public class RegistredUser extends User {


    @Column(nullable = false)
    private String password;
    private int points;

    public RegistredUser() {
        super();
        // TODO Auto-generated constructor stub
    }

    public RegistredUser(String nom, String email, List<Billet> billets, String password, int points) {
        super(nom, email, billets);
        this.password = password;
        this.points = points;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }


}
