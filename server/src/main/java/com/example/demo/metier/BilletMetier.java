package com.example.demo.metier;

import java.util.List;

import com.example.demo.entities.Billet;
import com.example.demo.entities.Event;


public interface BilletMetier {
    public Billet saveBillet(Billet A);

    public List<Billet> listBillet();

	Event getBillet(Long id);

	boolean supprimBillet(Long id);
}
