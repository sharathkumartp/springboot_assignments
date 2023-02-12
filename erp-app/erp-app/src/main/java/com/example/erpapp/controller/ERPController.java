package com.example.erpapp.controller;

import com.example.erpapp.dto.StudentPercentageDTO;
import com.example.erpapp.model.Student;
import com.example.erpapp.service.ERPService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/erp-app")
public class ERPController {
    //CRUD
    //topper
    //Least score
    //Percentage

    @Autowired
    private ERPService erpService;//Dependency Injection

    @GetMapping("find-all-students")
    public List<Student> findAllStudents(){
        return erpService.findAll();
    }

    @GetMapping("find-student/rollNo/{rollNo}")
    public Student findStudentById(@PathVariable int rollNo){
        return erpService.findById(rollNo);
    }

    @GetMapping("topper")
    public Student findTopper(){
        return erpService.findTopper();
    }

    @GetMapping("all-percentage")
    public List<StudentPercentageDTO> findPercentage(){
        List<StudentPercentageDTO> result=erpService.findAllPercentage();
        return result;
    }
}
