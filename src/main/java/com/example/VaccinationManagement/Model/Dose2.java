package com.example.VaccinationManagement.Model;

import com.example.VaccinationManagement.Enum.VaccineType;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;

import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE) // make all variables private inside an Entity
public class Dose2 {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;

    @Column(name = "dose1_id")
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
    String dose1Id;

    @Column(name = "vaccine_type")
    @Enumerated(EnumType.STRING)
    VaccineType vaccineType;

    @Column(name = "vaccination_date")
    @CreationTimestamp
    Date VaccinationDate;

    @OneToOne
    @JoinColumn
    User user;
}
