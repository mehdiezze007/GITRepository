package com.example.demo.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.entities.Produit;

public interface IProduitRep extends MongoRepository<Produit, Integer> {

}
