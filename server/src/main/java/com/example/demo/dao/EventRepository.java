package com.example.demo.dao;

import java.util.Date;
import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.entities.Event;

public interface EventRepository extends JpaRepository<Event, Long> {

	
	
    @Query("select e from Event e where e.id like :x")
	public Event chercher(@Param("x")Long e);
    
    @Query(value="select e from event e where e.date_debut like :y",nativeQuery=true)
    public List<Event> chercherParDate(@Param("y")Date s);
    
    @Query(value="SELECT * FROM  `event` WHERE  `event_type` like :y",nativeQuery=true)
    public List<Event> getMatch(@Param("y")String s);

}
