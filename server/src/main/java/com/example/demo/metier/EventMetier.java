package com.example.demo.metier;

import java.util.Date;
import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.entities.Event;

public interface EventMetier {
    public Event saveEvent( Event E);

    public List<Event> listEvent();
   public Event getEvent(Long id);
  public List<Event> chercherparDate(Date s);
   public boolean supprimEvent(Long id);
   public List<Event> getMatch();
   public List<Event> getEntrainement();
   public List<Event> getActivete();
    
}
