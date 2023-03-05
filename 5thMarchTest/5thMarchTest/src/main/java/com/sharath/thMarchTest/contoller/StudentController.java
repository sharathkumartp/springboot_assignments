package com.sharath.thMarchTest.contoller;


import com.sharath.thMarchTest.model.Student;
import com.sharath.thMarchTest.service.StudentService;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.Nullable;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;
import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/student")
public class StudentController {
    @Autowired
    StudentService studentService;
    @PostMapping(value = "/create")
    public ResponseEntity<String> saveStudent(@RequestBody String newStudent){
        Student studentObj=setStudent(newStudent);
        int studentId=studentService.saveStudent(studentObj);
        return new ResponseEntity<>("Student saved, user id- "+studentId, HttpStatus.CREATED);
    }

    private Student setStudent(String newStudent) {
        JSONObject json=new JSONObject(newStudent);

        Student student=new Student();

        student.setFirstName(json.getString("firstName"));
        student.setLastName(json.getString("lastName"));
        student.setAge(json.getInt("age"));
        student.setActive(json.getBoolean("active"));
        Timestamp createTime=new  Timestamp(System.currentTimeMillis());
        student.setAdmissionDate(createTime);
        return student;
    }

    @GetMapping(value = "/get")
    public ResponseEntity<String> getStudent(@Nullable @RequestParam String studentId){
        List<Student> studentList=studentService.getStudent(studentId);
        return new ResponseEntity<>(studentList.toString(),HttpStatus.OK);
    }
    @GetMapping(value = "/getByFirstName")
    public ResponseEntity<String> getStudentByFirstName(@RequestParam String firstName){
        List<Student> studentList=studentService.getStudentByFirstName(firstName);
        return new ResponseEntity<>(studentList.toString(), HttpStatus.OK);
    }


    @GetMapping(value = "/getByLastName")
    public ResponseEntity<String> getStudentByLastName(@RequestParam String lastName){
        List<Student> studentList=studentService.getStudentByLastName(lastName);
        return new ResponseEntity<>(studentList.toString(),HttpStatus.OK);
    }

    @GetMapping(value = "/getByAge")
    public ResponseEntity<String> getByAge(@RequestParam String age){
        List<Student> studentList=studentService.getStudentByAge(age);
        return new ResponseEntity<>(studentList.toString(),HttpStatus.OK);
    }
    @GetMapping(value = "/getByAgeGreater")
    public ResponseEntity<String> getByAgeGreater(@RequestParam String age){
        List<Student> studentList=studentService.getStudentByAgeGreater(age);
        return new ResponseEntity<>(studentList.toString(),HttpStatus.OK);
    }
    @GetMapping(value = "/getByName")
    public ResponseEntity<String> getByName(@Nullable @RequestParam String firstName,@Nullable @RequestParam String lastName){
        List<Student> studentList=studentService.getStudentByName(firstName,lastName);
        return new ResponseEntity<>(studentList.toString(),HttpStatus.OK);
    }

}