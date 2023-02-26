package com.sharath.FebTest.service;

import com.sharath.FebTest.dao.LaptopRepository;
import com.sharath.FebTest.model.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LaptopService {
    @Autowired
    LaptopRepository laptopRepository;

    public void addLaptop(Laptop laptop) {
        laptopRepository.save(laptop);
    }

    public List<Laptop> getAllLaptop() {
        return laptopRepository.findAll();
    }

    public String deleteBook(String laptopId) {
        for (Laptop laptop : laptopRepository.findAll()) {
            if (laptop.getLaptop_id()==(Integer.valueOf(laptopId))){
                laptopRepository.delete(laptop);
                return "Deleted";
            }
        }
        return "Not found";
    }
}
