package com.example.LMSBackend.Converter;

import com.example.LMSBackend.Models.Book;
import com.example.LMSBackend.RequestDTO.BookRequestDTO;

public class BookConverter {

    public static  Book convertBook(BookRequestDTO bookRequestDTO){
        Book book=Book.builder().name(bookRequestDTO.getName()).genre(bookRequestDTO.getGenre()).build();
        return book;
    }
}
