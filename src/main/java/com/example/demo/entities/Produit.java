package com.example.demo.entities;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Produit {
	
	private Integer id;
	private String designation;
	private String prix;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Produit(Integer id, String designation, String prix) {
		super();
		this.id = id;
		this.designation = designation;
		this.prix = prix;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getPrix() {
		return prix;
	}
	public void setPrix(String prix) {
		this.prix = prix;
	}

}
