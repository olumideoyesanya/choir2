package com.example.choirproject2.repository;

import com.example.choirproject2.model.Chorister;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ChoirRepository {

    List<Chorister> choirList = new ArrayList();

    public  Chorister saveChorister(Chorister chorister) {
        chorister.setChoirId(choirList.size() + 1);
        choirList.add(chorister);
        return chorister;
    }

    public Chorister getChoristerDetails(){
        Chorister chorister = new Chorister();

        return chorister;
    }

    public List<Chorister> getAllChoristers() {

        return choirList;
    }

    public Chorister getChoristerById(int choristerId) {
        for(Chorister chorister:choirList) {
            if(chorister.getChoirId() == choristerId){

                return chorister;
            }
        }
        return null;
    }

    public Chorister updateChorister(int choristerId, Chorister chorister) {

        for(Chorister c:choirList){
            if(c.getChoirId() == choristerId){
                c.setFirstName(chorister.getFirstName());
                c.setLastName(chorister.getLastName());
                c.setEmail(chorister.getEmail());
                c.setAddress(chorister.getAddress());

                return c;

            }
        }
        return null;
    }

    public Chorister deleteChorister(int choristerId) {
        Chorister deletedChorister = null;
        for(Chorister c:choirList){
            if(c.getChoirId() == choristerId){
                deletedChorister = c;
                choirList.remove(c);
                return deletedChorister;
            }
        }
        return deletedChorister;
    }
}
