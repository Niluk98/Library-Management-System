package com.example.LMSBackend.Controller;

import com.example.LMSBackend.RequestDTO.BookRequestDTO;
import com.example.LMSBackend.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired
    BookService bookService;
    @PostMapping("/createBook")
    public String createBooks(@RequestBody() BookRequestDTO bookRequestDTO){
       return bookService.createBooks(bookRequestDTO);
    }
}
