package com.example.turismoWeb.service;

import com.example.turismoWeb.repository.DestinoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DestinoService {
    @Autowired
    private DestinoRepository clienteRepository;

}