package com.example.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table( name = " Etudiant")
        public class Etudiant implements Serializable {
        @Id
        @GeneratedValue (strategy = GenerationType.IDENTITY)
        @Column(name="idEtudiant")
        private Long idEtudiant; // Clé primaire
        private String prenomE;
        private String nomE;

// Constructeur et accesseurs (getters) et mutateurs (setters)
        }
