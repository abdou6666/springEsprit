package tn.esprit.projet.services;

import org.springframework.data.repository.query.Param;
import tn.esprit.projet.entities.Contrat;
import tn.esprit.projet.entities.Equipe;
import tn.esprit.projet.entities.Etudiant;
import tn.esprit.projet.entities.Option;

import java.util.List;

public interface IEtudiantService {

    List<Etudiant> getAllEtudiant();
    Etudiant addEtudiant(Etudiant E);
    Etudiant updateEtudiant(Etudiant E);
    void deleteEtudiant(long id);
    Etudiant getEtudiantbyid(long id);

    Etudiant findEtudiantByprenom(String prenom);

    void updateEtudiantByOption(Option op , Long idEtudiant);

    List<Etudiant> retrieveEtudiantByEquipeThematique (  String thematique);
    public  void AssignEtudtoDepartement(Long idEtudiant, Long idDepart);

    Etudiant addAndAssignEtudiantToEquipeAndContract(Etudiant e, long idContrat,long idEquipe);

    Contrat affectContratToEtudiant (Contrat ce, String nomE, String prenomE);

}
