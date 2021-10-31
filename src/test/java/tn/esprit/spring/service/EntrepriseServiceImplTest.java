package tn.esprit.spring.service;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import tn.esprit.spring.entities.Entreprise;
import tn.esprit.spring.services.IEntrepriseService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EntrepriseServiceImplTest {
	
	@Autowired
	IEntrepriseService en;
	
	private static final Logger l = LogManager.getLogger(EntrepriseServiceImplTest.class);
	
	
	@Test
	public void testAddEntreprise() throws ParseException {
		
		Entreprise e = new Entreprise ("j","j");
		Entreprise entrepriseAdded=en.addEntreprise(e);
		Assert.assertEquals(e.getName(), entrepriseAdded.getName());
	}
	
	
	/*@Test
	public void testModifyEntreprise() throws ParseException   {
		
		Entreprise e = new Entreprise("5", "E1"); 
		Entreprise entrepriseUpdated  = en.updateEntreprise(e); 
		Assert.assertEquals(e.getName(), entrepriseUpdated.getName());
	}
	
	@Test
	public void testDeleteEntreprise() {
		en.deleteEntreprise(6);
		Assert.assertNotNull(en.retrieveEntreprise(2));
	}
	
	
	
	
	@Test
     public void testRetrieveAllEntreprises() {
		List<Entreprise> listEntreprises = en.retrieveAllEntreprises(); 
		// if there are 7 users in DB : 
		Assert.assertEquals(2, listEntreprises.size());
		l.info("retrive     :   " + listEntreprises.size());
	}
	
	
	*/

}
