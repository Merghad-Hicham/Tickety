package com.example.demo.entities;

import javax.persistence.*;

@Entity
public class Billet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private double prix;

    private int numbre;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private User user;

    @ManyToOne(fetch = FetchType.LAZY,optional = false)
    private Event event;


    public Billet() {
        super();
        // TODO Auto-generated constructor stub
    }

    public Billet(double prix, int numbre) {
        super();
        this.prix = prix;
        this.numbre = numbre;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /*public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }
*/
    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public int getNumbre() {
        return numbre;
    }

    public void setNumbre(int numbre) {
        this.numbre = numbre;
    }


}
