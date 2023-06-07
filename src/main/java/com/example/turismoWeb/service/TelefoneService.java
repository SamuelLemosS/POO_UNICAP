package com.example.turismoWeb.service;

import com.example.turismoWeb.exception.NotFoundEntityException;
import com.example.turismoWeb.model.TelefoneModel;
import com.example.turismoWeb.repository.TelefoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TelefoneService {
    @Autowired
    private TelefoneRepository telefoneRepository;

    public List<TelefoneModel> getAllDatas() {
        return telefoneRepository.findAll();
    }
    public TelefoneModel getClienteById(Long id) throws NotFoundEntityException {
        return telefoneRepository.findById(id).orElseThrow(() ->
                new NotFoundEntityException("Data nao encontrado!"));
    }
    public TelefoneModel findByDddAndNumero(int ddd, int numero){// throws NotFoundEntityException {
        return telefoneRepository.findByDddAndNumero( ddd,  numero);//.orElseThrow(() ->
        //new NotFoundEntityException("Cliente nao encontrado!"));
    }
    public TelefoneModel deleteCliente(Long id){// throws NotFoundEntityException {
        telefoneRepository.deleteById(id);//.orElseThrow(() ->
        //new NotFoundEntityException("Cliente nao encontrado!"));
        return null;
    }

    public TelefoneModel createCliente(TelefoneModel telefone) {
        telefoneRepository.save(telefone);
        return telefone;
    }

}