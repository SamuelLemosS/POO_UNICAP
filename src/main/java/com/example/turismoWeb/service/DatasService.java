package com.example.turismoWeb.service;

import com.example.turismoWeb.repository.DatasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DatasService {
    @Autowired
    private DatasRepository clienteRepository;

}