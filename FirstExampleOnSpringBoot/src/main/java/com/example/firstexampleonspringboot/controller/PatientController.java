package com.example.firstexampleonspringboot.controller;

import com.example.firstexampleonspringboot.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("patient")
public class PatientController {

    @Autowired
    public PatientService patientService ;
    @GetMapping("/print")
    public String printName(){
        return patientService.printName();
    }

}
