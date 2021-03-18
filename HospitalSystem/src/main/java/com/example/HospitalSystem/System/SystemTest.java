package com.example.HospitalSystem.System;

import com.example.HospitalSystem.Services.DoctorService;
import com.example.HospitalSystem.Services.PatientService;
import com.example.HospitalSystem.objects.Doctors;
import com.example.HospitalSystem.objects.Patients;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.annotation.PostConstruct;
import java.util.Scanner;

@Controller
public class SystemTest {
    @Autowired
    private DoctorService doctorService;
    @Autowired
    private PatientService patientService;

    Scanner s = new Scanner(System.in);

    @PostConstruct
    void menu() {
        System.out.println("\n\tChoose one");
        System.out.println("1.Add Doctor ");
        System.out.println("2. Add Patient");
        System.out.println("3. show doctors");
        System.out.println("4. show patients");
        System.out.println("5. Exit");
        int c;
        c = s.nextInt();
        while (c != 5) {

            switch (c) {
                case 1: {
                    doctorService.createDoctors();
                    menu();
                    break;
                }
                case 2: {
                    patientService.createPatients();
                    menu();
                    break;
                }
                case 3: {
                    System.out.println("List of doctors");
                    for (Doctors doctor : doctorService.findAll()) {
                        System.out.println(doctor.getId() + ": Name - " + doctor.getName() +
                                ", email - " + doctor.getEmail());
                    }

                     menu();
                    break;
                }
                case 4: {
                    System.out.println("List of patients");
                    for (Patients patient : patientService.findAll()) {
                        System.out.println(patient.getId() + ": Name - " + patient.getName() +
                                ", diagnose - " + patient.getDiagnose());
                    }
                    menu();
                    break;

                }
                case 5: {
                    System.out.println("Good Bye!");

                break;
            }
                default:
                {
                    System.out.println("Wrong input.");
                    menu();
                    break;
                }
            }
        }
    }
}
