package com.geekster.chatApp.dao;


import com.geekster.chatApp.model.Status;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StatusRepository extends JpaRepository<Status, Integer> {
}
