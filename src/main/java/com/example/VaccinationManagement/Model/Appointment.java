package com.example.VaccinationManagement.Model;

import com.example.VaccinationManagement.Enum.DoseNo;
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
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @Column(name = "appointment_number")
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
    String appointmentNumber;

    @Column(name = "date_of_appointment")
    @CreationTimestamp
    Date dateOfAppointment;

    @Column(name = "dose_no")
    @Enumerated(EnumType.STRING)
    DoseNo doseNo;

    // child to parent (many-to-one relation)
    @ManyToOne
    @JoinColumn
    User user;

    @ManyToOne
    @JoinColumn
    Doctor doctor;

    @ManyToOne
    @JoinColumn
    VaccinationCenter vaccinationCenter;





}
