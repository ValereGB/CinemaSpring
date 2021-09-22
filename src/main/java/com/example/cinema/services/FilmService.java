package com.example.cinema.services;

import java.util.List;

import com.example.cinema.models.Film;

public interface FilmService {
	public List<Film> findAll();

	public Film save(Film film);

	public void delete(String id);

	Film putFilm(Film film);

	Film findByNom(String nom);

}
