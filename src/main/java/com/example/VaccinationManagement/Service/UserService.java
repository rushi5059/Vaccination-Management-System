package com.example.VaccinationManagement.Service;

import com.example.VaccinationManagement.Model.User;
import com.example.VaccinationManagement.dto.RequestDTO.UserRequestDto;
import com.example.VaccinationManagement.dto.ResponceDTO.FindByEmailDto;
import com.example.VaccinationManagement.dto.ResponceDTO.UserResponseDto;
import org.springframework.stereotype.Service;


public interface UserService {
    public UserResponseDto addUser(UserRequestDto userRequestDto);

    UserResponseDto getUserByEmailId(UserRequestDto userRequestDto);

    FindByEmailDto findByEmailId(String emailId);
}
