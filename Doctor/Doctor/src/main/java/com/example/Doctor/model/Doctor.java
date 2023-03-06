package com.example.Doctor.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "tbl_doctor")
public class Doctor {

    @Id
    @Column(name="doctor_Id")
    private Integer doctorId;

    @Column(name="doctor_name")
    private String doctorName;

    @Column(name="experience")
    private String experience;

    @Column(name="specialized_in")
    private String specialization;

}
