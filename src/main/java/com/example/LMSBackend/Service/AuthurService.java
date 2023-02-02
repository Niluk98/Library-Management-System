package com.example.LMSBackend.Service;

import com.example.LMSBackend.Converter.AurthurConverter;
import com.example.LMSBackend.Models.Authur;
import com.example.LMSBackend.Repository.AuthurRepository;
import com.example.LMSBackend.RequestDTO.AuthurRequestDTO;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class AuthurService {
    @Autowired
    AuthurRepository authurRepository;

    public String createAuthur(AuthurRequestDTO authurRequestDTO){
     Authur authur= AurthurConverter.convertDtoToEntity(authurRequestDTO);
     try {
         authurRepository.save(authur);
     }
     catch (Exception e){
         log.info("createAuthor");
         return "Create author didn't work";
     }
     return "Authur created sucessfully";
    }
}
