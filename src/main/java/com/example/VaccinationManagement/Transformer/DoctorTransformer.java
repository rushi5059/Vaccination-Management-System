package com.example.VaccinationManagement.Transformer;

import com.example.VaccinationManagement.Model.Doctor;
import com.example.VaccinationManagement.Model.VaccinationCenter;
import com.example.VaccinationManagement.dto.RequestDTO.DoctorRequestDto;
import com.example.VaccinationManagement.dto.ResponceDTO.CenterResponseDto;
import com.example.VaccinationManagement.dto.ResponceDTO.DoctorResponseDto;
import lombok.experimental.UtilityClass;

@UtilityClass
public class DoctorTransformer {
    public static Doctor DoctorRequestDtoToDoctor(DoctorRequestDto doctorRequestDto){
        return Doctor.builder()
                .name(doctorRequestDto.getName())
                .age(doctorRequestDto.getAge())
                .mobNo(doctorRequestDto.getMobNo())
                .gender(doctorRequestDto.getGender())
                .emailId(doctorRequestDto.getEmailId())
                .build();
    }

    public static DoctorResponseDto DoctorToDoctorResponseDto(Doctor doctor) {

        CenterResponseDto centerResponseDto = CenterTransformer.CenterToCenterResponseDto(doctor.getVaccinationCenter());
        return DoctorResponseDto.builder()
                .name(doctor.getName())
                .emailId(doctor.getEmailId())
                .mobNo(doctor.getMobNo())
                .centerResponseDto(centerResponseDto)
                .build();
    }
}
