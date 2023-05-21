package com.example.VaccinationManagement.Model;

import com.example.VaccinationManagement.Enum.Gender;
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
@Table(name = "user")
//indication that this is the name of table
//good practice

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @Column(name = "user_name")
    String name;

    @Column(name = "user_age")
    int age;

    @Column (name = "user_email", unique = true, nullable = false)
    String emailId;

    @Column(name = "mob_no", unique = true, nullable = false)
    String mobNo;

    @Column(name = "gender")
    @Enumerated(EnumType.STRING)
    Gender gender;

    @Column(name = "is_dose_1_taken")
    boolean isDose1Taken;

    @Column(name = "is_dose_2_taken")
    boolean isDose2Taken;

    //  parent to child (one-to-many relation)
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    List<Appointment> appointment = new ArrayList<>();

    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
    Dose1 dose1;

    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
    Dose2 dose2;



}
