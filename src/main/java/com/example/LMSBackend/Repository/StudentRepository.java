package com.example.LMSBackend.Repository;

import com.example.LMSBackend.Models.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {
}
