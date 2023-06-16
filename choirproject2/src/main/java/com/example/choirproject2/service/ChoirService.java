package com.example.choirproject2.service;

import com.example.choirproject2.model.Chorister;
import com.example.choirproject2.repository.ChoirRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChoirService {

    @Autowired
    private ChoirRepository choirRepository;
    public Chorister getChoristerDetails(){

       return choirRepository.getChoristerDetails();



    }

    public Chorister saveChorister(Chorister chorister) {
        return choirRepository.saveChorister(chorister);
    }

    public List<Chorister> getALlChoristers() {
        return choirRepository.getAllChoristers();
    }

    public Chorister getChoristerById(int choristerId) {
        return choirRepository.getChoristerById(choristerId);
    }

    public Chorister updateChorister(int choristerId,Chorister chorister) {
        return choirRepository.updateChorister(choristerId,chorister);
    }

    public Chorister deleteChorister(int choristerId) {
        return choirRepository.deleteChorister(choristerId);

    }
}
