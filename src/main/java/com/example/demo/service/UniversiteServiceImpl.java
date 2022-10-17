package com.example.demo.service;

import com.example.demo.repository.UniversiteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UniversiteServiceImpl implements IUniversite{
    @Autowired
    UniversiteRepository universiteRepository;
    @Override
    public List<com.example.demo.entity.Universite> getAllUniversity() {
        return universiteRepository.findAll();
    }

    @Override
    public com.example.demo.entity.Universite addUniversite(com.example.demo.entity.Universite universite) {
        return universiteRepository.save(universite);
    }

    @Override
    public com.example.demo.entity.Universite updateUniversite(com.example.demo.entity.Universite updateUniversite) {
        return universiteRepository.save(updateUniversite);
    }

    @Override
    public void deleteUniversite(int id) {
        universiteRepository.deleteById(id);
    }

    @Override
    public com.example.demo.entity.Universite getUniversiteById(int id) {
        return universiteRepository.findById(id).get();
    }
}
