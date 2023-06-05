package com.example.TurismoWeb.service;

import com.example.TurismoWeb.exception.NotFoundEntityException;
import com.example.TurismoWeb.model.ClienteEntity;
import com.example.TurismoWeb.model.ClienteModel;
import com.example.TurismoWeb.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;

    public List<ClienteEntity> getAllClientes() {
        return clienteRepository.findAll();
    }
    public ClienteEntity getClienteById(Long id) throws NotFoundEntityException {
        return clienteRepository.findById(id).orElseThrow(() ->
                new NotFoundEntityException("Cliente nao encontrado!"));
    }
    public ClienteEntity getClienteByNomeAndEmail(String nome, String email) throws NotFoundEntityException {
        return clienteRepository.findByNomeAndEmail(nome,email).orElseThrow(() ->
                new NotFoundEntityException("Cliente nao encontrado!"));
    }

    public ClienteModel createCliente(ClienteEntity cliente) {
        return clienteRepository.save(cliente);
    }


}