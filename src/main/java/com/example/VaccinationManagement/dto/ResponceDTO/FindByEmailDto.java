package com.example.VaccinationManagement.dto.ResponceDTO;

import com.example.VaccinationManagement.Enum.Gender;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
public class FindByEmailDto {

    String name;

    int age;

    String mobNo;

    Gender gender;

    boolean isDose1Taken;

    boolean isDose2Taken;
}
