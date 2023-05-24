package com.example.VaccinationManagement.Service;

import com.example.VaccinationManagement.dto.RequestDTO.CenterRequestDto;
import com.example.VaccinationManagement.dto.ResponceDTO.CenterResponseDto;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


public interface CenterService {
    CenterResponseDto addCenter(CenterRequestDto centerRequestDto);
}
