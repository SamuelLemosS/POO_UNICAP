package com.example.TurismoWeb.service;

import com.example.TurismoWeb.repository.ClientePremiumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientePremiumService {
    @Autowired
    private ClientePremiumRepository clienteRepository;

}