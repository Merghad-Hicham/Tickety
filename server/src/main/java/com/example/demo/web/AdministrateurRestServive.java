package com.example.demo.web;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Administrateur;
import com.example.demo.metier.AdminMetier;

@RestController
public class AdministrateurRestServive {
    @Autowired
    private AdminMetier adminMetier;

    @RequestMapping(value = "/Adminstrateur", method = RequestMethod.POST,consumes = {MediaType.ALL_VALUE})
    public Administrateur saveAdmin(@RequestBody Administrateur A) {
        return adminMetier.saveAdmin(A);
    }

    @RequestMapping(value = "/Adminstrateur", method = RequestMethod.GET)
    public List<Administrateur> listAdmin() {
        return adminMetier.listAdmin();
    }


}
