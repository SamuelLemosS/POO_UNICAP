package com.example.TurismoWeb.service;

import com.example.TurismoWeb.repository.DestinoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DestinoService {
    @Autowired
    private DestinoRepository clienteRepository;

}