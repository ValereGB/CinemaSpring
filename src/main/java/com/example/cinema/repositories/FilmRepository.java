package com.example.cinema.repositories;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.cinema.models.Film;

import java.util.List;

public interface FilmRepository extends MongoRepository<Film, String>{
    public Film findFirstByNom(String nom);
}

