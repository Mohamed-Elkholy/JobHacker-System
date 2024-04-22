package com.example.firstexampleonspringboot.model;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PatientRepository {

    public List<String> names = new ArrayList<>() ;

    public PatientRepository() {
        this.names.add("mohamed");
        this.names.add("ahemd");
        this.names.add("elkholy");
    }

    public String printName() {
        return names.get(2);
    }

}
