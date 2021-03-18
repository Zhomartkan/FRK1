package com.example.HospitalSystem.Services;

import com.example.HospitalSystem.objects.Patients;

import java.util.List;


public interface PatientService {
        void createPatients();
        List<Patients> findAll();
        boolean exist(String name );
}
