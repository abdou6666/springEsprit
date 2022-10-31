package com.example.demo.repository;

import com.example.demo.entity.DetailEquipe;
import com.example.demo.entity.Equipe;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DetailEquipeRepository extends JpaRepository<DetailEquipe,Long> {
    public List<DetailEquipe> findByThematique(String thematique);

}
