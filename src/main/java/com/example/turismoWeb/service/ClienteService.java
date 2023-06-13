package com.example.turismoWeb.service;

import com.example.turismoWeb.exception.NotFoundEntityException;
import com.example.turismoWeb.model.ClienteEntity;
import com.example.turismoWeb.repository.ClienteRepository;
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
    public ClienteEntity getClienteByNomeAndEmail(String nome, String email){// throws NotFoundEntityException {
        return clienteRepository.findByNomeAndEmail(nome,email);//.orElseThrow(() ->
        //new NotFoundEntityException("Cliente nao encontrado!"));
    }
    public long count(){// throws NotFoundEntityException {
        return clienteRepository.count();//.orElseThrow(() ->
                //new NotFoundEntityException("Cliente nao encontrado!"));
    }
    public List<ClienteEntity> getClienteNull(){// throws NotFoundEntityException {
        return clienteRepository.findByIdIsNullOrNomeIsNullOrEmailIsNullOrderById();//.orElseThrow(() ->
        //new NotFoundEntityException("Cliente nao encontrado!"));
    }


    public ClienteEntity deleteCliente(Long id){// throws NotFoundEntityException {
         clienteRepository.deleteById(id);//.orElseThrow(() ->
                //new NotFoundEntityException("Cliente nao encontrado!"));
        return null;
    }
    public ClienteEntity deleteByNomeAndEmail(String nome, String email){// throws NotFoundEntityException {
        clienteRepository.deleteByNomeAndEmail(nome, email);//.orElseThrow(() ->
        //new NotFoundEntityException("Cliente nao encontrado!"));
        return null;
    }

    public ClienteEntity createCliente(ClienteEntity cliente) {
        clienteRepository.save(cliente);
        return cliente;
    }

    public Object updateCliente(Long id, ClienteEntity cliente) {
        return null;
    }
}
