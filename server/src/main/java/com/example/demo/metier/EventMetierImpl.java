package com.example.demo.metier;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.dao.EventRepository;
import com.example.demo.entities.Event;

@Service
public class EventMetierImpl implements EventMetier {
    @Autowired
    private EventRepository eventRepositoy;

    @Override
    public Event saveEvent( Event e) {

        return eventRepositoy.save(e);
    }

    @Override
    public List<Event> listEvent() {

        return eventRepositoy.findAll();
    }

	@Override
	public Event getEvent(Long id) {
		// TODO Auto-generated method stub
		return eventRepositoy.chercher(id);
	}

	@Override
	public boolean supprimEvent(Long id) {
		eventRepositoy.deleteById(id);
		return true;
	}
	/*
	@Override
	public List<Event> getMa(String s) {
		// TODO Auto-generated method stub
		return eventRepositoy.getMatch(s);
	}

	*/

	@Override
	public List<Event> chercherparDate(Date s) {
		
		return eventRepositoy.chercherParDate(s);
	}

	@Override
	public List<Event> getMatch() {
		// TODO Auto-generated method stub
		return eventRepositoy.getMatch();
	}

	@Override
	public List<Event> getEntrainement() {
		// TODO Auto-generated method stub
		return eventRepositoy.getEntrainement();
	}

	@Override
	public List<Event> getActivete() {
		// TODO Auto-generated method stub
		return eventRepositoy.getActivete();
	}

}
