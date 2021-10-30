package tn.esprit.spring.services;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.spring.entities.Employe;
import tn.esprit.spring.repository.EmployeRepository;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeServiceImpl  implements   IEmployeService{

    @Autowired
    EmployeRepository employeRepository;

    private static final Logger l = LogManager.getLogger(EmployeServiceImpl.class);
    @Override
    public List<Employe> retrieveAllEmployes() {
        List<Employe> employes = null;
        try {

            l.info("In retrieveAllEmployes() : ");
            employes = (List<Employe>) employeRepository.findAll();
            for (Employe employe  : employes) {
                l.debug("employe +++ : " + employe);
            }
            l.info("Out of retrieveAllContrats() : ");
        }catch (Exception e) {
            l.error("Error in retrieveAllContrats() : " + e);
        }

        return employes;
    }


    @Override
    public Employe addEmploye(Employe e) {
        return employeRepository.save(e);
    }

    @Override
    public Employe updateEmploye(Employe e) {
        return employeRepository.save(e);
    }

    @Override
    public void deleteEmploye(Integer id) {
        employeRepository.deleteById(id);
    }

    @Override
    public Optional<Employe> retrieveEmploye(Integer id) {
        l.info("in  retrieveEmploye id = " + id);


        return employeRepository.findById(id);
    }
}
