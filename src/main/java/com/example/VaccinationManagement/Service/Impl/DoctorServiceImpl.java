package com.example.VaccinationManagement.Service.Impl;

import com.example.VaccinationManagement.Exceptions.CenterNotPresentException;
import com.example.VaccinationManagement.Model.Doctor;
import com.example.VaccinationManagement.Model.VaccinationCenter;
import com.example.VaccinationManagement.Repository.CenterRepository;
import com.example.VaccinationManagement.Repository.DoctorRepository;
import com.example.VaccinationManagement.Service.DoctorService;
import com.example.VaccinationManagement.Transformer.CenterTransformer;
import com.example.VaccinationManagement.Transformer.DoctorTransformer;
import com.example.VaccinationManagement.dto.RequestDTO.DoctorRequestDto;
import com.example.VaccinationManagement.dto.ResponceDTO.CenterResponseDto;
import com.example.VaccinationManagement.dto.ResponceDTO.DoctorResponseDto;
import org.apache.catalina.mbeans.SparseUserDatabaseMBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DoctorServiceImpl implements DoctorService {

    @Autowired
    CenterRepository centerRepository;


    @Override
    public DoctorResponseDto addDoctor(DoctorRequestDto doctorRequestDto) throws CenterNotPresentException {

        Optional<VaccinationCenter> optionalCenter = centerRepository.findById(doctorRequestDto.getCenterId());
        // it may or may not return an object so we convert it into optional
        if(!optionalCenter.isPresent()){
            throw new CenterNotPresentException("Invalid center Id!!");
        }
        VaccinationCenter center = optionalCenter.get();

        //DTO -> Entity
        Doctor doctor = DoctorTransformer.DoctorRequestDtoToDoctor(doctorRequestDto);
        doctor.setVaccinationCenter(center);

        //add doctor to current list of doctors at that center
        center.getDoctorList().add(doctor);

        //Save the Doctor inside DoctorRepository
        VaccinationCenter savedCenter = centerRepository.save(center);  //saves both doctor and center

        //Prepare responseDto
        return DoctorTransformer.DoctorToDoctorResponseDto(doctor);

    }
}
