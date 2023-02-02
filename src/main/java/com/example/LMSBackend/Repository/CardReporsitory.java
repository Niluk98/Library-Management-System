package com.example.LMSBackend.Repository;

import com.example.LMSBackend.Models.Card;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardReporsitory extends JpaRepository<Card,Integer> {
}
