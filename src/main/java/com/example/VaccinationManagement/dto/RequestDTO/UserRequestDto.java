package com.example.VaccinationManagement.dto.RequestDTO;

import com.example.VaccinationManagement.Enum.Gender;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE) // make all variables private inside an Entity
public class UserRequestDto {
    String name;
    int age;
    String emailId;
    String mobNo;
    Gender gender;
}
