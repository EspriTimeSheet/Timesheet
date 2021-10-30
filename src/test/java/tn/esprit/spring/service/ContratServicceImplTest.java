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
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import tn.esprit.spring.entities.Contrat;
import tn.esprit.spring.services.IContratService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ContratServicceImplTest {
	@Autowired
	IContratService cs; 
	private static final Logger l = LogManager.getLogger(ContratServicceImplTest.class);
	
//	@Test
//	public void testRetrieveAllContrats() {
//		List<Contrat> listContrats = cs.retrieveAllContrats(); 
//		// if there are 7 users in DB : 
//		Assert.assertEquals(4, listContrats.size());
//		l.info("retrive     :   " + listContrats.size());
//	}
//	
	
//	@Test
//	public void testAddContrat() throws ParseException {
//		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
//		Date d = dateFormat.parse("2015-03-23");
//		Contrat c = new Contrat(d,  180 , "Cvp" ); 
//		Contrat contratAdded = cs.addContrat(c); 
//		
//	}
 
//	@Test
//	public void testModifyContrat() throws ParseException   {
//		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
//		Date d = dateFormat.parse("2020-07-13");
//		
//		Contrat c  = cs.retrieveContrat(4).get() ;
//		c.setDateDebut(d);
//		c.setSalaire(1800);
//		cs.updateContrat(c);
//    	l.info("retrive     :   " + c.getSalaire());
//	}
//
//	@Test
//	public void testRetrieveUser() {
//		User userRetrieved = us.retrieveUser("1"); 
//		Assert.assertEquals(1L, userRetrieved.getId().longValue());
//	}
//	
	@Test
	public void testDeleteUser() {
		cs.deleteContrat(2);
		Assert.assertNotNull(cs.retrieveContrat(2));
	}
	
}
