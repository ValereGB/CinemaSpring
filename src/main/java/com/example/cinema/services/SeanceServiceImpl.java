package com.example.cinema.services;


import java.util.List;

import com.example.cinema.models.Film;
import com.example.cinema.models.Seance;
import com.example.cinema.repositories.FilmRepository;
import com.example.cinema.repositories.SeanceRepository;


public class SeanceServiceImpl implements SeanceService{

    private SeanceRepository seanceRepository;
    private FilmRepository filmRepository;

    public SeanceServiceImpl(SeanceRepository seanceRepository,FilmRepository filmRepository){
        this.seanceRepository = seanceRepository;
        this.filmRepository = filmRepository;
    }

    @Override
    public List<Seance> findAll() {
        return this.seanceRepository.findAll();
    }

    @Override
    public Seance save(Seance seance) {
        return this.seanceRepository.save(seance);
    }

    @Override
    public void delete(String id) {
        this.seanceRepository.deleteById(id);
    }

    @Override
    public Seance putSeance(Seance seance) {
        return this.seanceRepository.save(seance);
    }

    @Override
    public Seance findBySalle(String salle) {
    	Seance seance = this.seanceRepository.findFirstBySalle(salle);
    	seance.setSalle(seance.getSalle().toUpperCase());
        return seance;
    }
    
    @Override
    public List<Film> findFilmBySeanceSalle(String salle) {
        return this.findBySalle(salle).getFilm();
    }
}
