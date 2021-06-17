package com.example.jsoncustommapper.service;

import com.example.jsoncustommapper.entity.Usermappings;
import org.springframework.context.annotation.Bean;

import java.util.Optional;

public interface MappingService {
    @Bean
    public void savemapping(Usermappings usermappings);
    public String deletemapping(String user);
    public Optional<Usermappings> findbyId(String user);
}
