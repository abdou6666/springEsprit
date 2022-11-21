package tn.esprit.projet.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.projet.entities.*;
import tn.esprit.projet.repository.ContratRepository;
import tn.esprit.projet.repository.DepartementRepository;
import tn.esprit.projet.repository.EquipeRepository;
import tn.esprit.projet.repository.EtudiantRepository;

import java.util.HashSet;
import java.util.List;


@Service
@AllArgsConstructor
public class EtudiantServiceIMPL implements IEtudiantService{

    EtudiantRepository etudiantRepository;
    DepartementRepository departementRepository;

    ContratRepository contratRepository;

    EquipeRepository equipeRepository;

    @Override
    public List<Etudiant> getAllEtudiant() {
        return etudiantRepository.findAll();
    }

    @Override
    public Etudiant addEtudiant(Etudiant E) {
        return etudiantRepository.save(E);
    }

    @Override
    public Etudiant updateEtudiant(Etudiant E) {
        return etudiantRepository.save(E);
    }

    @Override
    public void deleteEtudiant(long id) {
        etudiantRepository.deleteById(id);
    }

    @Override
    public Etudiant getEtudiantbyid(long id) {

        return etudiantRepository.findById(id).orElse(null);
    }

    @Override
    public Etudiant findEtudiantByprenom(String prenom) {
        return etudiantRepository.findByPrenom(prenom);
    }

    @Override
    public void updateEtudiantByOption(Option op, Long idEtudiant) {
        etudiantRepository.updateEtudiantByOption(op,idEtudiant);
    }

    @Override
    public List<Etudiant> retrieveEtudiantByEquipeThematique(String thematique) {
       return etudiantRepository.retrieveEtudiantByEquipeThematique(thematique);
    }

    @Override
    public void AssignEtudtoDepartement(Long idEtudiant, Long idDepart) {
        Etudiant etd=etudiantRepository.findById(idEtudiant).orElse(null);
        Departement dep=departementRepository.findById(idDepart).orElse(null);
        etd.setDepartement(dep);
        etudiantRepository.save(etd);
    }

    @Override
    public Etudiant addAndAssignEtudiantToEquipeAndContract(Etudiant e, long idContrat, long idEquipe) {
        Contrat contrat = contratRepository.findById(idContrat).orElse(null);
        Equipe equipe = equipeRepository.findById(idEquipe).orElse(null);
        e.setContrats(new HashSet<Contrat>());
        e.setEquipes(new HashSet<Equipe>());

        e.getContrats().add(contrat);
        e.getEquipes().add(equipe);
        return etudiantRepository.save(e);
    }

    @Override
    public Contrat affectContratToEtudiant(Contrat ce, String nomE, String prenomE) {

        Etudiant etudiant = etudiantRepository.findByPrenom(prenomE);


        if(etudiant.getNom().equals(nomE) && etudiant.getContrats().stream().count() <= 5){
            //Contrat c = contratRepository.save(ce);
            ce.setEtudiant(etudiant);
            etudiant.getContrats().add(ce);
            etudiantRepository.save(etudiant);
            return ce;
        }


        return null;
    }


}
