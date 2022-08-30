package fr.eni.projet.modele;

import javax.annotation.Generated;

import org.springframework.data.annotation.Id;

public class Article {

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@Id
	private String id;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	private String nom;
	
}
