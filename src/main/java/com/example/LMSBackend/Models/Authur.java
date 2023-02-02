package com.example.LMSBackend.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Authur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private  String name;
    private int age;
    @Column(unique = true)
    private  String email;

    private String country;
    @OneToMany(mappedBy = "authur",cascade = CascadeType.ALL)
    private List<Book> bookWritten;


}
