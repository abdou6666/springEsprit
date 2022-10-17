package com.example.demo.service;

import com.example.demo.entity.Departement;
import com.example.demo.repository.DepartementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartementServiceImpl implements IDepartement{
    @Autowired
    DepartementRepository departementRepository;
    @Override
    public List<com.example.demo.entity.Departement> getAllDepartement() {
        return departementRepository.findAll();
    }

    @Override
    public com.example.demo.entity.Departement addDepartement(Departement departement) {
        return departementRepository.save(departement);
    }

    @Override
    public com.example.demo.entity.Departement updateDepartement(com.example.demo.entity.Departement updateDepartement) {
        return departementRepository.save(updateDepartement);
    }

    @Override
    public void deleteDepartement(int id) {
        departementRepository.deleteById(id);
    }

    @Override
    public com.example.demo.entity.Departement getDepartementById(int id) {
        return departementRepository.findById(id).get();
    }
}
