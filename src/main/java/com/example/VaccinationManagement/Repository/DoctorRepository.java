package com.example.VaccinationManagement.Repository;

import com.example.VaccinationManagement.Model.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<Doctor, Integer> {
}
