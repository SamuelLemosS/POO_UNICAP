package com.example.TurismoWeb.service;

import com.example.TurismoWeb.repository.TelefoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TelefoneService {
    @Autowired
    private TelefoneRepository clienteRepository;

}