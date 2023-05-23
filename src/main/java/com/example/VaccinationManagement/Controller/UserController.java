package com.example.VaccinationManagement.Controller;

import com.example.VaccinationManagement.Service.UserService;
import com.example.VaccinationManagement.dto.RequestDTO.UserRequestDto;
import com.example.VaccinationManagement.dto.ResponceDTO.FindByEmailDto;
import com.example.VaccinationManagement.dto.ResponceDTO.UserResponseDto;
import org.apache.catalina.User;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user") // basically adds endpoints for all APIs present in it
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("/add")
    public ResponseEntity addUser(@RequestBody UserRequestDto userRequestDto){
        UserResponseDto userResponseDto = userService.addUser(userRequestDto);
        return new ResponseEntity(userResponseDto, HttpStatus.CREATED);
    }

    @GetMapping("/findByEmailId")
    public ResponseEntity findByEmailId(@RequestParam("emailId") String emailId)
    {
        FindByEmailDto findByEmailDto = userService.findByEmailId(emailId);

        return new ResponseEntity<>(findByEmailDto, HttpStatus.CREATED);
    }


}
