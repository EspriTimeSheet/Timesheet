package tn.esprit.spring.services;


import tn.esprit.spring.entities.Employe;

import java.util.List;
import java.util.Optional;

public interface IEmployeService {
    List<Employe> retrieveAllEmployes();
    Employe addEmploye(Employe c);
    void deleteEmploye(Integer id);
    Employe updateEmploye(Employe e);
    Optional<Employe> retrieveEmploye(Integer id);
}
