package com.ruiz.cine.service;

import com.ruiz.cine.repository.PersonajeRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonajeService {
    @Autowired
    private PersonajeRespository personajeRespository;
}
