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

import com.example.cinema.models.Seance;
import com.example.cinema.services.SeanceService;



@RestController
@CrossOrigin
@RequestMapping("super-hero")
public class SeanceController {
    private SeanceService seanceService ;

    public SeanceController(SeanceService seanceService) {
        this.seanceService = seanceService;
    }

    @GetMapping
    public List<Seance> findAll(){
        return this.seanceService.findAll();
    }

    @PostMapping
    public Seance save(@RequestBody Seance seance) {
        return this.seanceService.save(seance);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable String id) {
        this.seanceService.delete(id);
    }

    @PutMapping
    public Seance putFilm(@RequestBody Seance seance){
        return this.seanceService.putSeance(seance);
    }

    @GetMapping("{nom}")
    public Seance findBySalle(@PathVariable String salle){
        return this.seanceService.findBySalle(salle);
    }
}
