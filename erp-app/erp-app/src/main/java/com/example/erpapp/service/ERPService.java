package com.example.erpapp.service;

import com.example.erpapp.dto.StudentPercentageDTO;
import com.example.erpapp.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ERPService {
    private static final List<Student> students=new ArrayList<>();//In memory database
    public static int rollNo=0;
    static{
        Student s1=new Student(++rollNo,"abc","male",List.of(80.0,90.0,87.0,60.0),"Delhi");
        students.add(s1);
        Student s2=new Student(++rollNo,"xyz","male",List.of(86.6,92.3,87.8,63.4),"Bengaluru");
        students.add(s2);
        Student s3=new Student(++rollNo,"anshika","female",List.of(50.5,72.6,85.9,47.8),"Mumbai");
        students.add(s3);
        Student s4=new Student(++rollNo,"meera","female",List.of(87.4,99.9,54.3,98.5),"Pune");
        students.add(s4);
        Student s5=new Student(++rollNo,"san","male",List.of(45.5,56.6,98.7,77.8),"Chennai");
        students.add(s5);
    }

    public List<Student> findAll(){
        return students;
    }

    public Student findById(int rollNo){
        for(Student student:students){
            if(student.getRollNumber()==rollNo) return student;
        }
        return null;
    }

    public Student findTopper(){
        //....
        return null;

    }


    public List<StudentPercentageDTO> findAllPercentage(){
        List<StudentPercentageDTO> percentages=new ArrayList<>();

        for(Student student:students){
            List<Double> marks=student.getMaks();
            double perc=0.0;
            for(Double mark:marks){
                perc += mark;
            }
            perc *= 0.04;

            StudentPercentageDTO studentPercentageDTO=new StudentPercentageDTO(student.getRollNumber(),student.getName(),perc);
            percentages.add(studentPercentageDTO);

        }
        return percentages;
    }
}
