package com.example.demo.repository;

import com.example.demo.entity.DetailEquipe;
import com.example.demo.entity.Equipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface EquipeRepository extends JpaRepository<Equipe,Long> {
   // public List<Equipe>findEquipeByEtudiantsIdEtudiant(long id);
    //List<Equipe> findByDetailEquipeThematiqueContains (String thematique);

    //public List<Equipe> findAllByEtudiantsContaining(long idEtudiant);
  // public List<Equipe> findEquipesByEtudiant(long id);
    ///public List<Equipe> findByEtudiantsIdEtudiant(long id);
    // og : public List<Equipe> findByEtudiantIdEtudiantAAndDetailEquipeThematiqueNonNull(long id);

    // List<Equipe> findByEtudiantIdEtudiant (Integer idEtudiant);
    // cList<Equipe> findByEtudiantIdEtudiantAndDetailEquipeThematiqueNotNull (Integer idEtudiant);

   // List<Equipe> findEquipeByEtudiantIdEtudiantAndEtudiantDepartementId (long idEtudiant, Integer idDepart);
   //List<Equipe> findByEtudiantIdEtudiantAndEtudiantDepartementId (long idEtudiant, int id);


}
