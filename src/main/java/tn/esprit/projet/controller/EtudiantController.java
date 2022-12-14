package tn.esprit.projet.controller;


import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.projet.entities.Contrat;
import tn.esprit.projet.entities.Equipe;
import tn.esprit.projet.entities.Etudiant;
import tn.esprit.projet.entities.Option;
import tn.esprit.projet.services.ContratServiceIMPL;
import tn.esprit.projet.services.EtudiantServiceIMPL;
import tn.esprit.projet.services.IContratService;
import tn.esprit.projet.services.IEtudiantService;

import java.util.HashSet;
import java.util.List;

@AllArgsConstructor
@RestController
//addAndAssignEtudiantToEquipeAndContract/contrat/1/1
@RequestMapping("/etudiant")
public class EtudiantController {


    IEtudiantService etudiantService;

    @GetMapping("/getone/{idEtudiant}")
    public Etudiant getEtudiantbyid(@PathVariable("idEtudiant") Long id){

        return  etudiantService.getEtudiantbyid(id);
    }
    @GetMapping("/getall")
    public List<Etudiant>GetEtudiant(){

        return  etudiantService.getAllEtudiant();
    }
    @PostMapping("/addetude")
    public void addEtud(@RequestBody Etudiant E){

        etudiantService.addEtudiant(E);
    }
    @PutMapping("/put/{idEtudiant}")
    public void updateEtud(@PathVariable("idEtudiant") Long id, @RequestBody Etudiant E){

        E.setIdEtudiant(id);
        etudiantService.updateEtudiant(E);
    }
    @DeleteMapping("/del/{idEtudiant}")
    public  void deleteEtud(@PathVariable("idEtudiant") Long id){

        etudiantService.deleteEtudiant(id);
    }

    @GetMapping("/find/{prenom}")
    public Etudiant findEtd(@PathVariable("prenom") String prenom){
        return etudiantService.findEtudiantByprenom(prenom);
    }
    @PutMapping("/putq/{option}/{idEtudiant}")
    public void updateEtudq(@PathVariable("option")Option option, @PathVariable("idEtudiant") Long id){

       etudiantService.updateEtudiantByOption(option,id);
    }


    @GetMapping("/findQuery/{thematique}")
    public List<Etudiant> findEtdQuery(@PathVariable("thematique") String th){
        return etudiantService.retrieveEtudiantByEquipeThematique(th);
    }

    @PutMapping("/AsignE/{idEtudiant}/{idDepart}")
    public  void assignEtudtoDep(@PathVariable("idEtudiant") Long idEtudiant,@PathVariable("idDepart") Long idDepart){
        etudiantService.AssignEtudtoDepartement(idEtudiant,idDepart);
    }

    @PostMapping("/addAndAssignEtudiantToEquipeAndContract/contrat/{idContrat}/equipe/{idEquipe}")
    public Etudiant addAndAssignEtudiantToEquipeAndContract(
            @RequestBody Etudiant e,
            @PathVariable("idContrat") long idContrat,
            @PathVariable("idEquipe") long idEquipe
    ){

        return etudiantService.addAndAssignEtudiantToEquipeAndContract(e,idContrat,idEquipe);
    }

    @PutMapping("/affectContratToEtudiant/{nomE}/{prenomE}")
    public Contrat affectContratToEtudiant(@RequestBody Contrat ce,
                                           @PathVariable("nomE") String nomE,
                                           @PathVariable("prenomE") String prenomE
                                           ){
        return etudiantService.affectContratToEtudiant(ce,nomE,prenomE);
    }




}
