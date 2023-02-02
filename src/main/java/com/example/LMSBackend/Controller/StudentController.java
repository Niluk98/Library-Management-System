package com.example.LMSBackend.Controller;

import com.example.LMSBackend.RequestDTO.StudentRequestDTO;
import com.example.LMSBackend.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {
@Autowired
    StudentService studentService;

    @PostMapping("/create")
    public ResponseEntity<String> createStudent(@RequestBody()StudentRequestDTO studentRequestDTO){
       String result=studentService.createStudent(studentRequestDTO);
       return new ResponseEntity<>(result, HttpStatus.CREATED);
    }
}
