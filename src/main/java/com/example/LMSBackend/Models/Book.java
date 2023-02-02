package com.example.LMSBackend.Models;

import com.example.LMSBackend.Enum.Genre;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @Enumerated(value = EnumType.STRING )
    private Genre genre;

    @ManyToOne
    @JoinColumn
    private Authur authur;

    @ManyToOne
    @JoinColumn
    private Card card;

}
