package com.example.demo.metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.AdministrateurRepository;
import com.example.demo.entities.Administrateur;

@Service
public class AdminMetierImpl implements AdminMetier {
    @Autowired
    private AdministrateurRepository administateurRepositoy;

    @Override
    public Administrateur saveAdmin(Administrateur A) {

        return administateurRepositoy.save(A);
    }

    @Override
    public List<Administrateur> listAdmin() {
        // TODO Auto-generated method stub
        return administateurRepositoy.findAll();
    }

}
