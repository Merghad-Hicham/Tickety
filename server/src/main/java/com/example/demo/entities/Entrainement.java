package com.example.demo.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("EV")
public class Entrainement extends Event {


    @Column(nullable = false)
    private String equipe;

    public Entrainement() {
        super();
    }

    public Entrainement(String nom, String description, Double prix, Date date_debut, Date date_fin, List<Billet> billets, String equipe) {
        super(nom, description, prix, date_debut, date_fin, billets);
        this.equipe = equipe;
    }

    public String getEquipe() {
        return equipe;
    }

    public void setEquipe(String equipe) {
        this.equipe = equipe;
    }


}
