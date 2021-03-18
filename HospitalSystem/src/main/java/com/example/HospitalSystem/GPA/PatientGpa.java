package com.example.HospitalSystem.GPA;

import com.example.HospitalSystem.objects.Patients;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface PatientGpa extends JpaRepository<Patients, Long> {

    List<Patients> findAll();
    boolean existsByName(String name);


}
