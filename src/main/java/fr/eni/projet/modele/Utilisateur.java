package fr.eni.projet.modele;

import java.util.ArrayList;
import java.util.List;

public class Utilisateur {

	private String nom;
	private String password;
	private String role;
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	
	private List<Article> mesArticles = new ArrayList<>();
	
	public void ajoute(Article art) {
		mesArticles.add(art);
	}
	public List<Article> getArticles() {
		return mesArticles;
	}
	
}
