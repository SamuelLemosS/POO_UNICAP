package com.example.turismoWeb.service;

import com.example.turismoWeb.repository.LocalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LocalService {
    @Autowired
    private LocalRepository clienteRepository;

}