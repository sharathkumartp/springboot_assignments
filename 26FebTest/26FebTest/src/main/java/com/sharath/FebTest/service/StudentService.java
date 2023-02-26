package com.sharath.FebTest.service;

import com.sharath.FebTest.dao.StudentRepository;
import com.sharath.FebTest.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;

    public void addStudent(Student student) {
        studentRepository.save(student);
    }

    public List<Student> getAllStudent() {
        return studentRepository.findAll();
    }

    public String deleteStudent(String studentId) {
        for (Student student : studentRepository.findAll()) {
            if (student.getStudent_Id()==(Integer.valueOf(studentId))){
                studentRepository.delete(student);
                return "Deleted";
            }
        }
        return "Not found";
    }
}
