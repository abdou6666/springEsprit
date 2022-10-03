package com.example.demo;

import javax.persistence.*;

enum Niveau{
    JUNIOR,
    SENIOR,
    EXPERT
}
@Entity
public class Equipe {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idEquipe;
    private String nomEquipe;
    private Niveau niveau;

    @Override
    public String toString() {
        return "Equipe{" +
                "idEquipe=" + idEquipe +
                ", nomEquipe='" + nomEquipe + '\'' +
                ", niveau=" + niveau +
                '}';
    }

    public long getIdEquipe() {
        return idEquipe;
    }

    public void setIdEquipe(long idEquipe) {
        this.idEquipe = idEquipe;
    }

    public String getNomEquipe() {
        return nomEquipe;
    }

    public void setNomEquipe(String nomEquipe) {
        this.nomEquipe = nomEquipe;
    }

    @Enumerated(EnumType.STRING)
    public Niveau getNiveau() {
        return niveau;
    }

    @Enumerated(EnumType.STRING)
    public void setNiveau(Niveau niveau) {
        this.niveau = niveau;
    }
}
