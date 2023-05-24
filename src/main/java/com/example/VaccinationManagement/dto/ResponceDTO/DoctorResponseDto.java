package com.example.VaccinationManagement.dto.ResponceDTO;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE) // make all variables private inside an Entity
@Builder
public class DoctorResponseDto {
    String name;

    String emailId;

    String mobNo;

    CenterResponseDto centerResponseDto;

}
