package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.entities.Billet;
import com.example.demo.entities.Event;


public interface BilletRepository extends JpaRepository<Billet, Long> {
	@Query("select e from Event e where e.id like :x")
	public Event chercher(@Param("x")Long e);
}
