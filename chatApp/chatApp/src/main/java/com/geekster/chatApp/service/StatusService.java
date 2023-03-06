package com.geekster.chatApp.service;

import com.geekster.chatApp.dao.StatusRepository;
import com.geekster.chatApp.model.Status;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StatusService {

    @Autowired
    StatusRepository repository;


    public int saveStatus(Status status) {
        Status statusObj = repository.save(status);
        return statusObj.getStatusId();
    }
}