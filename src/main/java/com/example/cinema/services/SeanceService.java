package com.example.cinema.services;

import java.util.List;

import com.example.cinema.models.Film;
import com.example.cinema.models.Seance;

public interface SeanceService {

	public List<Seance> findAll();

	public Seance save(Seance seance);

	public void delete(String id);

	Seance putSeance(Seance seance);

	Seance findBySalle(String salle);

	List<Film> findFilmBySeanceSalle(String salle);


}
