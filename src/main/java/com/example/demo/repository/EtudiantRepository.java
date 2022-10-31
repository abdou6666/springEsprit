package com.example.demo.repository;

import com.example.demo.entity.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EtudiantRepository extends JpaRepository<Etudiant, Long> {
    public Etudiant findByPrenomE(String prenom);
}
