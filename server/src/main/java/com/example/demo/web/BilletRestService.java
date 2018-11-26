package com.example.demo.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Billet;
import com.example.demo.entities.Event;
import com.example.demo.metier.BilletMetier;

@RestController
public class BilletRestService {
    @Autowired
    private BilletMetier billetMetier;

    @RequestMapping(value = "/Billet", method = RequestMethod.POST)
    public Billet saveBillet(@RequestBody Billet A) {
        return billetMetier.saveBillet(A);
    }

    @RequestMapping(value = "/Billet", method = RequestMethod.GET)
    public List<Billet> listBillet() {
        return billetMetier.listBillet();
    }

    @RequestMapping(value = "/Billet/{id}", method = RequestMethod.GET)
 	public Event getEvent(@PathVariable Long id) {
 		return billetMetier.getBillet(id);
 	}
     @RequestMapping(value = "/Billet/{id}", method = RequestMethod.DELETE)
 	public boolean supprimEvent(@PathVariable Long id) {
 		return billetMetier.supprimBillet(id);
 	}
}
