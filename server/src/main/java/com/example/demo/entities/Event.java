package com.example.demo.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "event_type", discriminatorType = DiscriminatorType.STRING, length = 2)

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({
        @Type(name = "MA", value = Match.class),
        @Type(name = "EN", value = Entrainement.class),
        @Type(name = "AC", value = Activite.class)
})

public abstract class Event implements Serializable {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nom;

    private String description;

    private Double prix;

    @Column(nullable = false)
    private Date date_debut;

    private Date date_fin;

    @OneToMany(
            cascade = CascadeType.ALL,mappedBy = "event"
    )
    private List<Billet> billets = new ArrayList<>();

    public Event() {
        super();
        // TODO Auto-generated constructor stub
    }

    public Event(String nom, String description, Double prix, Date date_debut, Date date_fin, List<Billet> billets) {
        this.nom = nom;
        this.description = description;
        this.prix = prix;
        this.date_debut = date_debut;
        this.date_fin = date_fin;
        this.billets = billets;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrix() {
        return prix;
    }

    public void setPrix(Double prix) {
        this.prix = prix;
    }

    public Date getDate_debut() {
        return date_debut;
    }

    public void setDate_debut(Date date_debut) {
        this.date_debut = date_debut;
    }

    public Date getDate_fin() {
        return date_fin;
    }

    public void setDate_fin(Date date_fin) {
        this.date_fin = date_fin;
    }

    public List<Billet> getBillets() {
        return billets;
    }

    public void setBillets(List<Billet> billets) {
        this.billets = billets;
    }
}
