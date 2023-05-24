package com.example.VaccinationManagement.dto.ResponceDTO;

import com.example.VaccinationManagement.Enum.CenterType;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE) // make all variables private inside an Entity
@Builder
public class CenterResponseDto {
    String name;

    String message;

    String location;

    CenterType centerType;
}
