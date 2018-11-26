package com.example.demo.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("MA")
public class Match extends Event {


    @Column(nullable = false)
    private String equipe1;

    @Column(nullable = false)
    private String equipe2;

    private String competition;

    private String resultat;


    public Match() {
        super();
    }

    public Match(String nom, String description, Double prix, Date date_debut, Date date_fin, List<Billet> billets, String equipe1, String equipe2, String competition, String resultat) {
        super(nom, description, prix, date_debut, date_fin, billets);
        this.equipe1 = equipe1;
        this.equipe2 = equipe2;
        this.competition = competition;
        this.resultat = resultat;
    }

    public String getEquipe1() {
        return equipe1;
    }


    public void setEquipe1(String equipe1) {
        this.equipe1 = equipe1;
    }


    public String getEquipe2() {
        return equipe2;
    }


    public void setEquipe2(String equipe2) {
        this.equipe2 = equipe2;
    }


    public String getCompetition() {
        return competition;
    }


    public void setCompetition(String competition) {
        this.competition = competition;
    }


    public String getResultat() {
        return resultat;
    }


    public void setResultat(String resultat) {
        this.resultat = resultat;
    }


}
