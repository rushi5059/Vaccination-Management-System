package com.example.VaccinationManagement.Transformer;

import com.example.VaccinationManagement.Model.User;
import com.example.VaccinationManagement.dto.RequestDTO.UserRequestDto;
import com.example.VaccinationManagement.dto.ResponceDTO.UserResponseDto;
import lombok.experimental.UtilityClass;

@UtilityClass
public class UserTransformer {
    public static User UserRequestDtoToUser(UserRequestDto userRequestDto){
        return User.builder()
                .name(userRequestDto.getName())
                .age(userRequestDto.getAge())
                .emailId(userRequestDto.getEmailId())
                .gender(userRequestDto.getGender())
                .mobNo(userRequestDto.getMobNo())
                .build();
    }

    public static  UserResponseDto UserToUserResponceDto(User user){
        return UserResponseDto.builder()
                .name(user.getName())
                .message("Congrats!! You have registered on Dosify")
                .build();
    }
}
