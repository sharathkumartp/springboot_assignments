package com.sharath.thMarchTest.service;


import com.sharath.thMarchTest.dao.StudentRepo;
import com.sharath.thMarchTest.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentRepo studentRepo;
    public int saveStudent(Student student) {
        Student studentObj=studentRepo.save(student);
        return studentObj.getStudentId();
    }

    public List<Student> getStudent(String studentId) {
        List<Student> list=new ArrayList<>();
        if(studentId!=null){
            list.add(studentRepo.findById(Integer.valueOf(studentId)).get());
        }
        else {
            List<Student> studentList=studentRepo.getAll();
            for (Student student:studentList){
                list.add(student);
            }
        }
        return list;
    }

    public List<Student> getStudentByFirstName(String firstName) {
        List<Student> student=studentRepo.findByFirstName(firstName);
        return student;
    }

    public List<Student> getStudentByAge(String age) {
        List<Student> students=studentRepo.findByAge(Integer.valueOf(age));
        return students;
    }

    public List<Student> getStudentByName(String firstName, String lastName) {
        List<Student> students=studentRepo.findByLastNameOrFirstName(firstName,lastName);
        return students;
    }

    public List<Student> getStudentByAgeGreater(String age) {
        return studentRepo.findByAgeGreaterThan(Integer.valueOf(age));
    }

    public List<Student> getStudentByLastName(String lastName) {
        List<Student> student=studentRepo.findByLastName(lastName);
        return student;
    }
}
