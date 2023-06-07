package com.example.turismoWeb.service;

import com.example.turismoWeb.repository.TelefoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TelefoneService {
    @Autowired
    private TelefoneRepository clienteRepository;

}