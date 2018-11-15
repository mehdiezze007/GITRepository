package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.IProduitRep;
import com.example.demo.entities.Produit;

@RestController
public class ProduitService {

	@Autowired
	private IProduitRep ipr;
	
	@RequestMapping("/all")
	public List<Produit> getAll(){
		return ipr.findAll();
	}
	
	
	
	
	
}
