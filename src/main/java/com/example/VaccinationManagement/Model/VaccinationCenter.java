package com.example.VaccinationManagement.Model;

import com.example.VaccinationManagement.Enum.CenterType;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE) // make all variables private inside an Entity
public class VaccinationCenter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @Column(name = "center_name")
    String name;

    @Column(name = "center_location")
    String location;

    @Column(name = "center_type")
    @Enumerated(EnumType.STRING)
    CenterType centerType;

    @OneToMany(mappedBy = "vaccinationCenter", cascade = CascadeType.ALL)
    List<Doctor> doctorList = new ArrayList<>();

}
