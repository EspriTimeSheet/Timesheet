package tn.esprit.spring.services;

import java.util.List;
import java.util.Optional;

import tn.esprit.spring.entities.Entreprise;

public interface IEntrepriseService {
	
	List<Entreprise> retrieveAllEntreprises(); 
	Entreprise addEntreprise(Entreprise e);
	
	Entreprise updateEntreprise(Entreprise e);
	
	
	Optional<Entreprise> retrieveEntreprise(Integer id);
	
	void deleteEntreprise(int id);

}
