package com.example.HospitalSystem.Services;
import com.example.HospitalSystem.GPA.DoctorGpa;
import com.example.HospitalSystem.objects.Doctors;
import com.example.HospitalSystem.Services.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Scanner;

@Service
public class DoctorServiceImplement implements DoctorService {

    @Autowired
    private DoctorGpa DoctorGpa;
    Scanner scan = new Scanner(System.in);

    @Override
    public void createDoctors() {
        System.out.println("Enter the name");
        String name = scan.next();
        System.out.println("Enter the email");
        String email = scan.next();
        Doctors doctors = new Doctors(name, email);
        DoctorGpa.save(doctors );

    }
    @Override
    public boolean exist(String name) {
        return DoctorGpa.existsByName(name );
    }

    @Override
    public List<Doctors> findAll() {
        return DoctorGpa.findAll();
    }
}
