package com.example.LMSBackend.Controller;


import com.example.LMSBackend.RequestDTO.AuthurRequestDTO;
import com.example.LMSBackend.Service.AuthurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/authur")
public class AuthurController {
 @Autowired
    AuthurService authurService;
    @PostMapping("/create")
    public String createAuthur(@RequestBody()AuthurRequestDTO authurRequestDTO){
        return authurService.createAuthur(authurRequestDTO);
    }
}
