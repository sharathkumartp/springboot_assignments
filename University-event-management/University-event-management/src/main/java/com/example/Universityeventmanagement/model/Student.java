package com.example.Universityeventmanagement.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student{
    private int StudentId;
    private String first_name;
    private String last_name;
    private int age;
    private String department;
}