package tn.esprit.spring.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import tn.esprit.spring.entities.Employe;
import tn.esprit.spring.entities.Role;
import tn.esprit.spring.services.IEmployeService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeServiceImplTest {
    @Autowired
    IEmployeService es;

    private static final Logger l = LogManager.getLogger(EmployeServiceImplTest.class);


  @Test
  public void testAddEmploye() throws ParseException {
      Employe e = new Employe("test", "test", "test123@gmail.com", "123456789",false , Role.INGENIEUR);
      Employe contratAdded = es.addEmploye(e);
  }

//  @Test
//  public void testModifyEmploye() throws ParseException   {
//      SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
//      Date d = dateFormat.parse("2020-07-13");
//      Employe e  = es.retrieveEmploye(1).get() ;
//      e.setEmail("test@gmail.com");
//      e.setNom("test");
//      e.setPrenom("test");
//      e.setPassword("testtestqsdqsdqsdqsd");
//      es.updateEmploye(e);
//      l.info("retrive     :   " + e.getPrenom());
//  }
//	@Test
//	public void testRetrieveAllEmployes() {
//	List<Employe> listEmployes = es.retrieveAllEmployes();
//  Assert.assertEquals(1, listEmployes.size());
//      listEmployes.forEach( cl -> {l.info("retrieveClient : "+ (cl.getNom()));});
//	}

//  @Test
//  public void testRetrieveEmploye() {
//      Optional<Employe> employeRetrieved = es.retrieveEmploye(3);
//
//      l.info("retrive   :  "+ employeRetrieved.get().getPrenom());
//  }
//
//
//  @Test
//  public void testDeleteEmploye() {
//      es.deleteEmploye(1);
//      Assert.assertNotNull(es.retrieveEmploye(1));
//  }


}
