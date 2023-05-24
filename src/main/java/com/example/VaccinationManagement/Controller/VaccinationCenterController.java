package com.example.VaccinationManagement.Controller;

import com.example.VaccinationManagement.Model.VaccinationCenter;
import com.example.VaccinationManagement.Service.CenterService;
import com.example.VaccinationManagement.dto.RequestDTO.CenterRequestDto;
import com.example.VaccinationManagement.dto.ResponceDTO.CenterResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/center")
public class VaccinationCenterController {
    @Autowired
    CenterService centerService;
    @PostMapping("/add")
    public ResponseEntity addVaccinationCenter(@RequestBody CenterRequestDto centerRequestDto){
        CenterResponseDto centerResponseDto = centerService.addCenter(centerRequestDto);
        return new ResponseEntity(centerResponseDto, HttpStatus.CREATED);
    }


}
