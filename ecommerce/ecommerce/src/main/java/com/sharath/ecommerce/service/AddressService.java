package com.sharath.ecommerce.service;

import com.sharath.ecommerce.dao.AddressRepo;
import com.sharath.ecommerce.model.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {
    @Autowired
    AddressRepo addressRepo;
    public String saveAddress(Address address) {
        addressRepo.save(address);
        return "save Address";
    }
}
