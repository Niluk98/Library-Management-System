package com.example.LMSBackend.Service;

import com.example.LMSBackend.Enum.CardStatus;
import com.example.LMSBackend.Models.Card;
import com.example.LMSBackend.Models.Student;
import com.example.LMSBackend.Repository.StudentRepository;
import com.example.LMSBackend.RequestDTO.StudentRequestDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
@Autowired
    StudentRepository studentRepository;
 public  String createStudent(StudentRequestDTO studentRequestDTO){

     Student student=new Student();
     student.setAge(studentRequestDTO.getAge());
     student.setName(studentRequestDTO.getName());
     student.setCountry(studentRequestDTO.getCountry());
     student.setEmail(studentRequestDTO.getEmail());


     Card newCard=new Card();
     newCard.setCardStatus(CardStatus.Activated);
     newCard.setStudent(student);//for that new foreign key column
      //bidirectional mapping
     student.setCard(newCard);
     studentRepository.save(student);
     return "Success";
 }

}
