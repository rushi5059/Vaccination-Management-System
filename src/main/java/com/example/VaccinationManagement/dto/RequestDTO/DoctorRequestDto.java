package com.example.VaccinationManagement.dto.RequestDTO;

import com.example.VaccinationManagement.Enum.Gender;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE) // make all variables private inside an Entity
@Builder
public class DoctorRequestDto {
    int centerId;

    String name;

    int age;

    String emailId;

    String mobNo;

    Gender gender;
}

// Plane Old Java Objects
// they called POJO's