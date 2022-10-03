package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class DetailEquipe {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int salle;
    private String thematique;

    @Override
    public String toString() {
        return "DetailEquipe{" +
                "salle=" + salle +
                ", thematique='" + thematique + '\'' +
                '}';
    }

    public int getSalle() {
        return salle;
    }

    public void setSalle(int salle) {
        this.salle = salle;
    }

    public String getThematique() {
        return thematique;
    }

    public void setThematique(String thematique) {
        this.thematique = thematique;
    }
}
