package com.example.TurismoWeb.service;

import com.example.TurismoWeb.repository.LocalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LocalService {
    @Autowired
    private LocalRepository clienteRepository;

}