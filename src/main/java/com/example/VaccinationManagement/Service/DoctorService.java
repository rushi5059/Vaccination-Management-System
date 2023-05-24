package com.example.VaccinationManagement.Service;

import com.example.VaccinationManagement.Exceptions.CenterNotPresentException;
import com.example.VaccinationManagement.dto.RequestDTO.DoctorRequestDto;
import com.example.VaccinationManagement.dto.ResponceDTO.DoctorResponseDto;
import org.springframework.stereotype.Service;


public interface DoctorService {
    public DoctorResponseDto addDoctor(DoctorRequestDto doctorRequestDto) throws CenterNotPresentException;
}
