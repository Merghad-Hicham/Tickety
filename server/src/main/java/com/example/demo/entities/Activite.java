package com.example.demo.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@DiscriminatorValue("AV")
public class Activite extends Event{

    private String theme;

    public Activite() {
        super();
    }

    public Activite(String nom, String description, Double prix, Date date_debut, Date date_fin, List<Billet> billets, String theme) {
        super(nom, description, prix, date_debut, date_fin, billets);
        this.theme = theme;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }
}
