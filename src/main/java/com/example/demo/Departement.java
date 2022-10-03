package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Departement {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String nomDepart;

    @Override
    public String toString() {
        return "Departement{" +
                "id=" + id +
                ", nomDepart='" + nomDepart + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomDepart() {
        return nomDepart;
    }

    public void setNomDepart(String nomDepart) {
        this.nomDepart = nomDepart;
    }
}
