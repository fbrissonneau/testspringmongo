package fr.eni.projet.controleurs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import fr.eni.projet.modele.Article;
import fr.eni.projet.modele.Utilisateur;
import fr.eni.projet.repositories.ArticlesRepository;
import fr.eni.projet.repositories.UtilisateursRepository;

@Controller

public class UtilisateursControleur {

	
	@Autowired 
	private UtilisateursRepository utilisateurs;
	
	@Autowired 
	private ArticlesRepository articles;
	
	@GetMapping("/")
	public String listeUtilisateurs(Model modele) {
		
		var bidon = new Utilisateur();
		bidon.setNom("Fabien");
		bidon.setPassword("xxxx");
		bidon.setRole("admin");
		
		var art = new Article();
		art.setNom("vélo");
		bidon.ajoute(art);
		articles.insert(art);
		
		utilisateurs.insert(bidon);
		
		var listeUsers = utilisateurs.findAll();
		 
		modele.addAttribute("utilisateurs", listeUsers);
		
		return "listeutilisateurs";
	}
	
	@GetMapping("/articles")
	public String listeArticles(Model modele) {
		
		var listeArticles = articles.findAll();
		 
		modele.addAttribute("articles", listeArticles);
		
		return "listearticles";
	}
}
