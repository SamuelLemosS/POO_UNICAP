package com.example.turismoWeb.service;

import com.example.turismoWeb.exception.NotFoundEntityException;
import com.example.turismoWeb.model.ClienteEntity;
import com.example.turismoWeb.model.ClientePremiumModel;
import com.example.turismoWeb.repository.ClientePremiumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientePremiumService {
    @Autowired
    private ClientePremiumRepository clientePremiumRepository;

    public ClientePremiumModel createClientePremium(ClientePremiumModel cliente) {
        clientePremiumRepository.save(cliente);
        return cliente;
    }

    public List<ClientePremiumModel> getAllClientesPremium() {
        return clientePremiumRepository.findAll();
    }
    public List<ClientePremiumModel> getOrderByDiasDePremium() {
        return clientePremiumRepository.findByNomeIsNotNullOrderByDiasDePremium();
    }
    public List<ClientePremiumModel> getClientePremiumNull(){// throws NotFoundEntityException {
        return clientePremiumRepository.findByIdIsNullOrNomeIsNullOrEmailIsNullOrAgenciaIsNullOrDiasDePremiumIsNullOrderById();//.orElseThrow(() ->
        //new NotFoundEntityException("Cliente nao encontrado!"));
    }
    public ClientePremiumModel getClientePremiumById(Long id) throws NotFoundEntityException {
        return clientePremiumRepository.findById(id).orElseThrow(() ->
                new NotFoundEntityException("Cliente nao encontrado!"));
    }
    public ClientePremiumModel getClientePremiumByNomeAndEmail(String nome, String email){// throws NotFoundEntityException {
        return clientePremiumRepository.findByNomeAndEmail(nome,email);//.orElseThrow(() ->
        //new NotFoundEntityException("Cliente nao encontrado!"));
    }
    public List<ClientePremiumModel> getAgencia(String agencia){// throws NotFoundEntityException {
        return clientePremiumRepository.findByAgencia(agencia);//.orElseThrow(() ->
        //new NotFoundEntityException("Cliente nao encontrado!"));
    }
    public List<ClientePremiumModel> getDiasDePremium(int diasDePremium){// throws NotFoundEntityException {
        return clientePremiumRepository.findByDiasDePremium(diasDePremium);//.orElseThrow(() ->
        //new NotFoundEntityException("Cliente nao encontrado!"));
    }
    public long count(){// throws NotFoundEntityException {
        return clientePremiumRepository.count();//.orElseThrow(() ->
        //new NotFoundEntityException("Cliente nao encontrado!"));
    }



    public Object updateClientePremium(Long id, ClientePremiumModel cliente) throws ChangeSetPersister.NotFoundException {
        ClientePremiumModel clienteExistente = clientePremiumRepository.findById(id).orElseThrow(() -> new ChangeSetPersister.NotFoundException());
        clienteExistente.setId(cliente.getId());
        clienteExistente.setNome(cliente.getNome());
        clienteExistente.setEmail(cliente.getEmail());
        clienteExistente.setTelefoneModel(cliente.getTelefoneModel());
        clienteExistente.setDestinoModel(cliente.getDestinoModel());
        clienteExistente.setAgencia(cliente.getAgencia());
        clienteExistente.setDiasDePremium(cliente.getDiasDePremium());

        return clientePremiumRepository.save(clienteExistente);
    }



    public ClientePremiumModel deleteClientePremium(Long id){// throws NotFoundEntityException {
        clientePremiumRepository.deleteById(id);//.orElseThrow(() ->
        //new NotFoundEntityException("Cliente nao encontrado!"));
        return null;
    }
    public ClientePremiumModel deleteByNomeAndEmail(String nome, String email){// throws NotFoundEntityException {
        clientePremiumRepository.deleteByNomeAndEmail(nome, email);//.orElseThrow(() ->
        //new NotFoundEntityException("Cliente nao encontrado!"));
        return null;
    }
}