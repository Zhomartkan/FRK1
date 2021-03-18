package com.example.HospitalSystem.Services;
import com.example.HospitalSystem.objects.Doctors;

import java.util.List;

public interface DoctorService {
    void createDoctors();
    List<Doctors> findAll();
    boolean exist(String name);

}
