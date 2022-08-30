package fr.eni.projet.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import fr.eni.projet.modele.Article;
import fr.eni.projet.modele.Utilisateur;

public interface ArticlesRepository extends MongoRepository<Article, String>{

}
