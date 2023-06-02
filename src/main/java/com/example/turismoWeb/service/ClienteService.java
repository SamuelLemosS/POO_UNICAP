package com.example.TurismoWeb.service;

import com.example.TurismoWeb.exception.NotFoundEntityException;
import com.example.TurismoWeb.model.ClienteModel;
import com.example.TurismoWeb.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;

    public List<ClienteModel> getAllClientes() {
        return clienteRepository.findAll();
    }
    public ClienteModel getClienteById(Long id) throws NotFoundEntityException {
        return clienteRepository.findById(id).orElseThrow(() ->
                new NotFoundEntityException("Cliente nao encontrado!"));
    }
    public ClienteModel createCliente(ClienteModel cliente) {
        return clienteRepository.save(cliente);
    }


}