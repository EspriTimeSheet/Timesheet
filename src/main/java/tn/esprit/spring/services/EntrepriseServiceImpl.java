package tn.esprit.spring.services;

import java.util.List;
import java.util.Optional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entities.Entreprise;
import tn.esprit.spring.repository.EntrepriseRepository;
@Service
public class EntrepriseServiceImpl implements IEntrepriseService{
	

	@Autowired
	EntrepriseRepository entrepriseRrepository;
	
	
	private static final Logger l = LogManager.getLogger(EntrepriseServiceImpl.class);
	
	

	@Override
	public List<Entreprise> retrieveAllEntreprises() {
		// TODO Auto-generated method stub
		List<Entreprise> entreprises = null; 
		try {
	
			l.info("In retrieveAllEntreprises() : ");
			entreprises = (List<Entreprise>) entrepriseRrepository.findAll();  
			for (Entreprise entreprise  : entreprises) {
				l.debug("entreprise +++ : " + entreprise);
			} 
			l.info("Out of retrieveAllEntreprises() : ");
		}catch (Exception e) {
			l.error("Error in retrieveAllEntreprises() : " + e);
		}

		return entreprises;
	}
	

	@Override
	public Entreprise addEntreprise(Entreprise e) {
		// TODO Auto-generated method stub
		return entrepriseRrepository.save(e);
	}

	@Override
	public Entreprise updateEntreprise(Entreprise e) {
		// TODO Auto-generated method stub
		return entrepriseRrepository.save(e);
	}

	@Override
	public Optional<Entreprise> retrieveEntreprise(Integer id) {
		// TODO Auto-generated method stub
		
		l.info("in  retrieveEntreprise id = " + id);
		//Entreprise e =  entrepriseRepository.findById(Long.parseLong(id)).orElse(null);
		//int i = 1/0; 
		
		return entrepriseRrepository.findById(id); 
	}

	@Override
	public void deleteEntreprise(int id) {
		// TODO Auto-generated method stub
		entrepriseRrepository.deleteById(id);
		
	}

}
