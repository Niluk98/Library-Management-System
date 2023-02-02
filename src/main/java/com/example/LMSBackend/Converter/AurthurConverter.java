package com.example.LMSBackend.Converter;

import com.example.LMSBackend.Models.Authur;
import com.example.LMSBackend.RequestDTO.AuthurRequestDTO;

public class AurthurConverter {

    public static Authur convertDtoToEntity(AuthurRequestDTO authurRequestDTO){

        Authur authur=Authur.builder().name(authurRequestDTO.getName()).age(authurRequestDTO.getAge()).country(authurRequestDTO.getCountry()).email(authurRequestDTO.getEmail()).build();
    return authur;
    }
}
