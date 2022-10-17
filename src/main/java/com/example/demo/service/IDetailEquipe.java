package com.example.demo.service;

import com.example.demo.entity.DetailEquipe;

import java.util.List;

public interface IDetailEquipe {
    List<DetailEquipe> getDetailsEquipe();
    DetailEquipe addDetailEquipe(DetailEquipe detailEquipe);
    DetailEquipe updateDetailEquipe(DetailEquipe updateDetailEquipe);
    void deleteDetailEquipe(long id);
    DetailEquipe getDetailEquipeById(long id);
}
