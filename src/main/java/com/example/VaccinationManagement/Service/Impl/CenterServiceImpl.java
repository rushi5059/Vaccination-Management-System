package com.example.VaccinationManagement.Service.Impl;

import com.example.VaccinationManagement.Model.VaccinationCenter;
import com.example.VaccinationManagement.Repository.CenterRepository;
import com.example.VaccinationManagement.Service.CenterService;
import com.example.VaccinationManagement.Transformer.CenterTransformer;
import com.example.VaccinationManagement.dto.RequestDTO.CenterRequestDto;
import com.example.VaccinationManagement.dto.ResponceDTO.CenterResponseDto;
import jakarta.persistence.SecondaryTable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class CenterServiceImpl implements CenterService {
    @Autowired
    CenterRepository centerRepository;
    @Override
    public CenterResponseDto addCenter(CenterRequestDto centerRequestDto) {
        //DTO to Entity
        VaccinationCenter vaccinationCenter = CenterTransformer.CenterRequestDtoToCenter(centerRequestDto);

        //save to your DB
        VaccinationCenter savedCenter = centerRepository.save(vaccinationCenter);

        //Entity to ResponseDTO
        return CenterTransformer.CenterToCenterResponseDto(savedCenter);

    }
}
