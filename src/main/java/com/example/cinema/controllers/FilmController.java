package com.example.cinema.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.cinema.models.Film;
import com.example.cinema.services.FilmService;



@RestController
@CrossOrigin
@RequestMapping("super-hero")
public class FilmController {
    private FilmService filmService ;

    public FilmController(FilmService filmService) {
        this.filmService = filmService;
    }

    @GetMapping
    public List<Film> findAll(){
        return this.filmService.findAll();
    }

    @PostMapping
    public Film save(@RequestBody Film film) {
        return this.filmService.save(film);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable String id) {
        this.filmService.delete(id);
    }

    @PutMapping
    public Film putFilm(@RequestBody Film film){
        return this.filmService.putFilm(film);
    }

    @GetMapping("{nom}")
    public Film findByNom(@PathVariable String nom){
        return this.filmService.findByNom(nom);
    }
}
