package com.example.HospitalSystem.GPA;

import com.example.HospitalSystem.objects.Doctors;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

 @Repository
 public interface DoctorGpa extends JpaRepository<Doctors, Long> {
    List<Doctors> findAll();
    boolean existsByName(String name );
}
