package com.example.umsdb.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.sql.Timestamp;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId;
    @NotNull
    private String userName;
    @Pattern(regexp = "^\\d{2}-\\d{2}-\\d{4}$", message = "DOB should be in DD-MM-YYYY format")
    private String dateOfBirth;
    @Email
    private String email;
    @Size(min = 12 ,max = 12 , message = "Phone number must be 12 digits with first two as country code")
    private String phoneNumber;

    private String dateTime;
}