package com.example.VaccinationManagement.Transformer;

import com.example.VaccinationManagement.Model.VaccinationCenter;
import com.example.VaccinationManagement.dto.RequestDTO.CenterRequestDto;
import com.example.VaccinationManagement.dto.ResponceDTO.CenterResponseDto;
import lombok.experimental.UtilityClass;

@UtilityClass
public class CenterTransformer {
    public static VaccinationCenter CenterRequestDtoToCenter(CenterRequestDto centerRequestDto){
        return VaccinationCenter.builder()
                .name(centerRequestDto.getName())
                .location(centerRequestDto.getLocation())
                .centerType(centerRequestDto.getCenterType())
                .build();
    }

    public static CenterResponseDto CenterToCenterResponseDto(VaccinationCenter center){
        return CenterResponseDto.builder()
                .name(center.getName())
                .location(center.getLocation())
                .centerType(center.getCenterType())
                .build();
    }
}
