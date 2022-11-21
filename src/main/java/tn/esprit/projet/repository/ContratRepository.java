package tn.esprit.projet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import tn.esprit.projet.entities.Contrat;

import java.util.Date;
import java.util.List;


public interface ContratRepository extends JpaRepository<Contrat,Long> {

    @Query(nativeQuery = true,value = "select COUNT(*) from contrat c where c.DateDebutContrat >= :dateDebut and " +
            "c.DateFinContrat <= :dateFin and" +
            " c.archive = true")
    Integer findNbContratByDatesAndArchives(@Param("dateDebut") Date dateDebut,@Param("dateFin") Date dateFin);

    @Query(nativeQuery = true,value = "select * from contrat c where c.DateDebutContrat >= :dateDebut and " +
            "c.DateFinContrat <= :dateFin")
    List<Contrat> findContratByDates(@Param("dateDebut") Date dateDebut, @Param("dateFin") Date dateFin);
}
