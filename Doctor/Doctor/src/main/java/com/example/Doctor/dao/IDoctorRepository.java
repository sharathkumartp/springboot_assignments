package com.example.Doctor.dao;

import com.example.Doctor.model.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IDoctorRepository extends JpaRepository<Doctor,Integer> {

}
