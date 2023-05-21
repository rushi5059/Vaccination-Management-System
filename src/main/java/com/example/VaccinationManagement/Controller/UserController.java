package com.example.VaccinationManagement.Controller;

import com.example.VaccinationManagement.Model.User;
import com.example.VaccinationManagement.Service.UserService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user") // basically adds endpoints for all APIs present in it
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("/add")
    public ResponseEntity addUser(@RequestBody User user){

        User savedUser = userService.addUser(user);
        return new ResponseEntity<>(savedUser, HttpStatus.CREATED);

    }
}
