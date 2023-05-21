package com.example.VaccinationManagement.Service.Impl;

import com.example.VaccinationManagement.Model.User;
import com.example.VaccinationManagement.Repository.UserRepository;
import com.example.VaccinationManagement.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public User addUser(User user) {
        user.setDose1Taken(false);
        user.setDose2Taken(false);

        User savedUser = userRepository.save(user);
        return savedUser;

    }
}
