package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Universite {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idDepart;
    private String nomUniv;

    @Override
    public String toString() {
        return "Universite{" +
                "idDepart=" + idDepart +
                ", nomUniv='" + nomUniv + '\'' +
                '}';
    }

    public int getIdDepart() {
        return idDepart;
    }

    public void setIdDepart(int idDepart) {
        this.idDepart = idDepart;
    }

    public String getNomUniv() {
        return nomUniv;
    }

    public void setNomUniv(String nomUniv) {
        this.nomUniv = nomUniv;
    }
}
