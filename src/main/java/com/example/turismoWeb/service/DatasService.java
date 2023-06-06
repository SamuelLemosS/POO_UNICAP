package com.example.TurismoWeb.service;

import com.example.TurismoWeb.repository.DatasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DatasService {
    @Autowired
    private DatasRepository clienteRepository;

}