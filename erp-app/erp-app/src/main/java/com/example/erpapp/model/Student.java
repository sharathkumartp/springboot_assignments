package com.example.erpapp.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@AllArgsConstructor
@Data

public class Student {
    private int rollNumber;
    private String name;
    private String gender;
    private List<Double> maks;
    private String city;

//    public Student(int rollNumber, String name, String gender, List<Double> maks, String city) {
//        this.rollNumber = rollNumber;
//        this.name = name;
//        this.gender = gender;
//        this.maks = maks;
//        this.city = city;
//    }
//
//    public int getRollNumber() {
//        return rollNumber;
//    }
//
//    public void setRollNumber(int rollNumber) {
//        this.rollNumber = rollNumber;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getGender() {
//        return gender;
//    }
//
//    public void setGender(String gender) {
//        this.gender = gender;
//    }
//
//    public List<Double> getMaks() {
//        return maks;
//    }
//
//    public void setMaks(List<Double> maks) {
//        this.maks = maks;
//    }
//
//    public String getCity() {
//        return city;
//    }
//
//    public void setCity(String city) {
//        this.city = city;
//    }

   // @Override
//    public String toString() {
//        return "Student{" +
//                "rollNumber=" + rollNumber +
//                ", name='" + name + '\'' +
//                ", gender='" + gender + '\'' +
//                ", maks=" + maks +
//                ", city='" + city + '\'' +
//                '}';
//    }
}
