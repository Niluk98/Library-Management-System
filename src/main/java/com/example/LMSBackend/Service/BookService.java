package com.example.LMSBackend.Service;

import com.example.LMSBackend.Converter.BookConverter;
import com.example.LMSBackend.Models.Authur;
import com.example.LMSBackend.Models.Book;
import com.example.LMSBackend.Repository.AuthurRepository;
import com.example.LMSBackend.Repository.BookRepository;
import com.example.LMSBackend.RequestDTO.BookRequestDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    AuthurRepository authurRepository;
    @Autowired
    BookRepository bookRepository;
    public String createBooks(BookRequestDTO bookRequestDTO){
        Book book= BookConverter.convertBook(bookRequestDTO);
        int authorId=bookRequestDTO.getAuthurId();
        Authur authur= authurRepository.findById(authorId).get();
        book.setAuthur(authur);

       List<Book>currentListOfBooks= authur.getBookWritten();
       currentListOfBooks.add(book);
       authur.setBookWritten(currentListOfBooks);
       authurRepository.save(authur);

//       bookRepository.save(book);
       return "Successfully added book";

    }
}
