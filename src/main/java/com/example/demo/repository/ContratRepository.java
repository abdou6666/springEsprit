package com.example.demo.repository;

import com.example.demo.entity.Contrat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ContratRepository extends JpaRepository<Contrat,Long> {

}
