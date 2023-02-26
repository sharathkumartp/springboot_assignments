package com.sharath.FebTest.controller;

import com.sharath.FebTest.dao.StudentRepository;
import com.sharath.FebTest.model.Laptop;
import com.sharath.FebTest.model.Student;
import com.sharath.FebTest.service.LaptopService;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LaptopController {
    @Autowired
    LaptopService laptopService;
    @Autowired
    StudentRepository studentRepository;
    @PostMapping("/add-laptop")
    public String addLaptop(@RequestBody String newLaptop){
        JSONObject json = new JSONObject(newLaptop);
        Laptop laptop = setLaptop(json);
        laptopService.addLaptop(laptop);
        return "Student Added";
    }
    @GetMapping("/get-laptop")
    public List<Laptop> getAllBook(){
        return laptopService.getAllLaptop();
    }

    @DeleteMapping("/delete-laptop/{laptop_id}")
    public String deleteBook(@PathVariable String laptop_id){
        return laptopService.deleteBook(laptop_id);
    }

    private Laptop setLaptop(JSONObject json) {
        Laptop laptop=new Laptop();
        laptop.setName(json.getString("name"));
        laptop.setBrand(json.getString("brand"));
        laptop.setPrice(json.getInt("price"));

        String studentid = json.getString("student_id");
        Student student = studentRepository.findById(Integer.valueOf(studentid)).get();

        laptop.setStudent_Id(student);
        return laptop;
    }
}
