package com.example.LMSBackend.RequestDTO;

import com.example.LMSBackend.Enum.Genre;
import lombok.Data;

@Data
public class BookRequestDTO {
    private String name;

    private Genre genre;

    private int authurId;
}
