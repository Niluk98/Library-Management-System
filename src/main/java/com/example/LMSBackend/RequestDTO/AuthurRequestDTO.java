package com.example.LMSBackend.RequestDTO;

import jakarta.persistence.Column;
import lombok.Data;

@Data
public class AuthurRequestDTO {

    private String name;

    private int age;
    private String country;

    @Column(unique = true)
    private  String email;

}
