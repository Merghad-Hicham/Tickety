package com.example.demo.metier;

import java.util.List;

import com.example.demo.entities.Administrateur;


public interface AdminMetier {
    public Administrateur saveAdmin(Administrateur A);

    public List<Administrateur> listAdmin();

}
