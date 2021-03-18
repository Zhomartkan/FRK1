package com.example.HospitalSystem.Services;

import com.example.HospitalSystem.GPA.PatientGpa;
import com.example.HospitalSystem.objects.Patients;
import com.example.HospitalSystem.Services.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Scanner;

@Service
public class PatientServiceImplement implements PatientService {

    @Autowired
    private PatientGpa PatientGpa;
    Scanner scan = new Scanner(System.in);

    @Override
    public void createPatients() {
        System.out.println("Enter the name");
        String name = scan.next();
        System.out.println("Enter the diagnose");
        String diagnose = scan.next();
        Patients resources = new Patients(name, diagnose);
        System.out.println("Resource is created.");
        PatientGpa.save(resources);
    }
    @Override
    public boolean exist(String name) {
        return PatientGpa.existsByName(name );
    }
    @Override
    public List<Patients> findAll() {
        return PatientGpa.findAll();
    }
}
