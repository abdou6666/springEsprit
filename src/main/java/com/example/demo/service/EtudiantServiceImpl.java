package com.example.demo.service;

import com.example.demo.entity.Departement;
import com.example.demo.entity.Etudiant;
import com.example.demo.repository.DepartementRepository;
import com.example.demo.repository.EtudiantRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class EtudiantServiceImpl implements  IEtudiantService{

    EtudiantRepository etudiantRepository;


    DepartementRepository departementRepository;

    @Override
    public List<Etudiant> getAllEtudiant() {
        return etudiantRepository.findAll();
    }

    @Override
    public Etudiant addEtudiant(Etudiant etudiant) {
        return etudiantRepository.save(etudiant);
    }

    @Override
    public Etudiant updateEtudiant(Etudiant updateEtudiant) {
        return etudiantRepository.save(updateEtudiant);
    }

    @Override
    public void deleteEtudiantById(long id) {
        etudiantRepository.deleteById(id);
    }

    @Override
    public Etudiant getEtudiantById(long id) {
       return etudiantRepository.findById(id).orElse(null);
    }

    @Override
    public Etudiant getEtudiantByPrenom(String name) {
        return etudiantRepository.findByPrenomE(name);
    }

    @Override
    public void assignEtudiantToDepartement(long idEtudiant, int idDepartement) {
        Etudiant etudiant = this.etudiantRepository.findById(idEtudiant).orElse(null);
        Departement departement = this.departementRepository.findById(idDepartement).orElse(null);
        etudiant.setDepartement(departement);
        etudiantRepository.save(etudiant);


    }
}
