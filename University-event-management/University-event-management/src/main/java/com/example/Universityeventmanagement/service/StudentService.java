package com.example.Universityeventmanagement.service;



import com.example.Universityeventmanagement.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
    private static List<Student> students = new ArrayList<>();
    private static int id = 0;
    static{
        students.add(new Student(++id, "Hrishikesh", "Kalekinge", 24, "ECE"));
        students.add(new Student(++id, "Aniket", "Kumar", 22, "ECE"));
        students.add(new Student(++id, "Sumit", "Patil", 23, "CSE"));
        students.add(new Student(++id, "Adesh", "Sonawane", 23, "IT"));
        students.add(new Student(++id, "Aditya", "Saraf", 22, "EE"));
    }
    public String addStudent(Student student) {
        student.setStudentId(++id);
        students.add(student);
        return student.getFirst_name() + " " + student.getLast_name() + " Added Successfully!";
    }

    public String updateByDept(Student newStudent, String department) {
        for(Student student: students){
            if(student.getDepartment().equals(department)){
                if(newStudent.getStudentId() != 0) student.setStudentId(newStudent.getStudentId());
                if(newStudent.getAge() != 0) student.setAge(newStudent.getAge());
                if(newStudent.getFirst_name() != null) student.setFirst_name(newStudent.getFirst_name());
                if(newStudent.getLast_name() != null) student.setLast_name(newStudent.getLast_name());
                return "Student with Department " + department + " Updated Successfully!";
            }
        }
        return "Student with Department " + department + " Not Found! ";
    }

    public String deleteById(int id) {
        for(int idx = 0; idx < students.size(); idx++)
            if (students.get(idx).getStudentId() == id) {
                students.remove(idx);
                return "Student with ID " + id + " Deleted Successfully!";
            }
        return "Student with ID " + id + "Not Found! ";
    }

    public List<Student> getAll() {
        return students;
    }

    public Student getByID(int id) {
        for(int idx = 0; idx < students.size(); idx++)
            if (students.get(idx).getStudentId() == id) {
                return students.get(idx);
            }
        return null;
    }
}
