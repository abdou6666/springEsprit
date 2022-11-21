package tn.esprit.projet.services;


import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.projet.entities.Contrat;
import tn.esprit.projet.entities.Etudiant;
import tn.esprit.projet.entities.Specialite;
import tn.esprit.projet.repository.ContratRepository;

import java.util.Date;
import java.util.List;

@Service
@AllArgsConstructor
public class ContratServiceIMPL implements  IContratService{


    ContratRepository contratRepository;

    @Override
    public List<Contrat> getAllContrat() {
        return contratRepository.findAll();
    }

    @Override
    public Contrat addContrat(Contrat E) {
        return contratRepository.save(E);
    }

    @Override
    public Contrat updateContrat(Contrat E) {
        return contratRepository.save(E);
    }

    @Override
    public void deleteContrat(long id) {
        contratRepository.deleteById(id);
    }

    @Override
    public Contrat getContratbyid(long id) {

        return contratRepository.findById(id).orElse(null);
    }

    @Override
    public Integer nbContratsValides(Date startDate, Date endDate) {
        return contratRepository.findNbContratByDatesAndArchives(startDate,endDate);
    }

    @Override
    public float getChiffreAffaireEntreDeuxDate(Date startDate, Date endDate) {
        float ca=0;
        List< Contrat> contrat= contratRepository.findContratByDates(startDate,endDate);

            contrat.stream().forEach((c) -> {
            if(c.getSpecialite().equals(Specialite.IA)){
                ca += 300;
            }
           if(c.getSpecialite().equals(Specialite.RESEAUX)){
                ca += 350;
            }
            if(c.getSpecialite().equals(Specialite.CLOUD)){
                ca += 400;
            }
            if(c.getSpecialite().equals(Specialite.SECURITE)){
                ca += 450;
            }
        } );
        return ca;
    }
}
