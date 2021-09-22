package com.example.cinema.repositories;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.cinema.models.Seance;

import java.util.List;

public interface SeanceRepository extends MongoRepository<Seance, String>{
    public Seance findFirstBySalle(String salle);
}

