package com.example.Doctor.controller;

import com.example.Doctor.model.Doctor;
import com.example.Doctor.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DoctorController {

    @Autowired
    DoctorService service;

    @PostMapping(value="/doctor")
    public Doctor saveDoctor(@RequestBody Doctor doctor){
        return service.saveDoctor(doctor);
    }

    @GetMapping(value="/doctor")
    public List<Doctor> getDoctor(){
        return service.getDoctor();
    }

    @GetMapping(value = "/doctorById")
    public Doctor getDoctorById(@RequestParam String doctorId){
        return service.getDoctorById(doctorId);
    }
}
