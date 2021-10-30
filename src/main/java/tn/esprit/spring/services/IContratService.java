package tn.esprit.spring.services;

import java.util.List;
import java.util.Optional;

import tn.esprit.spring.entities.Contrat;

public interface IContratService {

	List<Contrat> retrieveAllContrats(); 
	Contrat addContrat(Contrat c);
	void deleteContrat(int reference);
	Contrat updateContrat(Contrat cr);
	Optional<Contrat> retrieveContrat(Integer reference);
}
