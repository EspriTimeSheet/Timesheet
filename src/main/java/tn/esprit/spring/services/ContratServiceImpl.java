package tn.esprit.spring.services;

import java.util.List;
import java.util.Optional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entities.Contrat;
import tn.esprit.spring.entities.User;
import tn.esprit.spring.repository.ContratRepository;
import tn.esprit.spring.repository.UserRepository;
@Service
public class ContratServiceImpl implements IContratService {


	@Autowired
	ContratRepository contratRepository;

	private static final Logger l = LogManager.getLogger(ContratServiceImpl.class);



	
	
	@Override
	public List<Contrat> retrieveAllContrats() { 
		List<Contrat> contrats = null; 
		try {
	
			l.info("In retrieveAllContrats() : ");
			contrats = (List<Contrat>) contratRepository.findAll();  
			for (Contrat contrat  : contrats) {
				l.debug("contrat +++ : " + contrat);
			} 
			l.info("Out of retrieveAllContrats() : ");
		}catch (Exception e) {
			l.error("Error in retrieveAllContrats() : " + e);
		}

		return contrats;
	}


	@Override
	public Contrat addContrat(Contrat c) {
		return contratRepository.save(c); 
	}

	@Override 
	public Contrat updateContrat(Contrat cr) { 
		return contratRepository.save(cr);
	}

	@Override
	public void deleteContrat(int id) {
		contratRepository.deleteById(id);
	}

	@Override
	public Optional<Contrat> retrieveContrat(Integer id) {
		l.info("in  retrieveUser id = " + id);
		//User u =  userRepository.findById(Long.parseLong(id)).orElse(null);
		//int i = 1/0; 
	
		return contratRepository.findById(id);
	}

}
