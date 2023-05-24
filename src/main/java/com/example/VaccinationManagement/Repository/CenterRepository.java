package com.example.VaccinationManagement.Repository;

import com.example.VaccinationManagement.Model.VaccinationCenter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface CenterRepository extends JpaRepository<VaccinationCenter, Integer> {

}
