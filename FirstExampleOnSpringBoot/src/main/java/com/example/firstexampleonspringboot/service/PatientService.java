package com.example.firstexampleonspringboot.service;

import com.example.firstexampleonspringboot.model.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatientService {

    @Autowired
    public PatientRepository patientRepository ;

    public String printName() {
        System.out.println("Hello Mohamed Elkholy");
        return patientRepository.printName().toUpperCase();
    }

}
