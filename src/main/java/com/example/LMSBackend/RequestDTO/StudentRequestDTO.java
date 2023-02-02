package com.example.LMSBackend.RequestDTO;

import jakarta.persistence.Column;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StudentRequestDTO {
    private int age;
    @Column(nullable = false)
    private String name;

    private String country;
    @Column(unique = true)
    private String email;
}
