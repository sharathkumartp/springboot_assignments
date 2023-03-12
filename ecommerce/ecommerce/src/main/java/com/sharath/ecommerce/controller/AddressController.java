package com.sharath.ecommerce.controller;

import com.sharath.ecommerce.model.Address;
import com.sharath.ecommerce.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddressController {

    @Autowired
    AddressService addressService;

    @PostMapping(value = "/address")
    public String saveAddress(@RequestBody Address address){
        return addressService.saveAddress(address);
    }

}