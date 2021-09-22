package com.example.cinema;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.cinema.repositories.FilmRepository;
import com.example.cinema.repositories.SeanceRepository;
import com.example.cinema.services.FilmService;
import com.example.cinema.services.FilmServiceImpl;
import com.example.cinema.services.SeanceService;
import com.example.cinema.services.SeanceServiceImpl;


@Configuration
public class AppConfig {
    @Bean
    public FilmService filmService(FilmRepository filmrepository){
        return new FilmServiceImpl(filmrepository);
    }

    @Bean
    public SeanceService seanceService(SeanceRepository seanceRepository, FilmRepository filmrepository){
        return new SeanceServiceImpl(seanceRepository, filmrepository);
    }

}