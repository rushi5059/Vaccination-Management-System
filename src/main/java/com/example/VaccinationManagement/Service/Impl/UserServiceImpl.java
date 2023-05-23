package com.example.VaccinationManagement.Service.Impl;

import com.example.VaccinationManagement.Model.User;
import com.example.VaccinationManagement.Repository.UserRepository;
import com.example.VaccinationManagement.Service.UserService;
import com.example.VaccinationManagement.Transformer.UserTransformer;
import com.example.VaccinationManagement.dto.RequestDTO.UserRequestDto;
import com.example.VaccinationManagement.dto.ResponceDTO.FindByEmailDto;
import com.example.VaccinationManagement.dto.ResponceDTO.UserResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public UserResponseDto addUser(UserRequestDto userRequestDto) {
                //Convert RequestDTO into Entity
            /*  User user = new User();
                user.setName(userRequestDto.getName());
                user.setAge(userRequestDto.getAge());
                user.setEmailId(userRequestDto.getEmailId());
                user.setGender(userRequestDto.getGender());
                user.setMobNo(userRequestDto.getMobNo());
             */
        //User object using @Builder
        User user = UserTransformer.UserRequestDtoToUser(userRequestDto);

        //Save the object in DB
        User savedUser = userRepository.save(user);

        //Entity to ResponseDTO
        /*      UserResponseDto userResponseDto = new UserResponseDto();
                userResponseDto.setName(savedUser.getName());
                userResponseDto.setMessage("Congrats!! You have registered on Dosify");
                return userResponseDto;

         */

        //Using Builder
        UserResponseDto userResponseDto = UserTransformer.UserToUserResponceDto(savedUser);
        return userResponseDto;
    }

    @Override
    public UserResponseDto getUserByEmailId(UserRequestDto userRequestDto) {
        return null;
    }

    @Override
    public FindByEmailDto findByEmailId(String emailId) {

        User user = userRepository.findByEmailId(emailId);

        FindByEmailDto findByEmailDto = new FindByEmailDto();

        findByEmailDto.setName(user.getName());
        findByEmailDto.setAge(user.getAge());
        findByEmailDto.setMobNo(user.getMobNo());
        findByEmailDto.setGender(user.getGender());
        findByEmailDto.setDose2Taken(user.isDose2Taken());
        findByEmailDto.setDose1Taken(user.isDose1Taken());

        return findByEmailDto;
    }


}
