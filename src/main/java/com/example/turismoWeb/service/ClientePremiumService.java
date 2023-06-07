package com.example.turismoWeb.service;

import com.example.turismoWeb.repository.ClientePremiumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientePremiumService {
    @Autowired
    private ClientePremiumRepository clienteRepository;

}