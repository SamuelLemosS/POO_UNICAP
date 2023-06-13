package com.example.turismoWeb.service;

import com.example.turismoWeb.exception.NotFoundEntityException;
import com.example.turismoWeb.model.LocalModel;
import com.example.turismoWeb.model.TelefoneModel;
import com.example.turismoWeb.repository.TelefoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TelefoneService {
    @Autowired
    private TelefoneRepository telefoneRepository;

    public TelefoneModel createTelefone(TelefoneModel telefone) {
        telefoneRepository.save(telefone);
        return telefone;
    }

    public List<TelefoneModel> getAllTelefone() {
        return telefoneRepository.findAll();
    }
    public List<TelefoneModel> getTelefoneNull() {
        return telefoneRepository.findByIdIsNullOrDddNullOrNumeroIsNullOrderById();
    }
    public TelefoneModel getTelefoneId(Long id) throws NotFoundEntityException {
        return telefoneRepository.findById(id).orElseThrow(() ->
                new NotFoundEntityException("Telefone nao encontrado!"));
    }
    public List<TelefoneModel> getDdd(int ddd){// throws NotFoundEntityException {
        return telefoneRepository.findByDdd(ddd);//.orElseThrow(() ->
        //new NotFoundEntityException("Cliente nao encontrado!"));
    }
    public long count(){// throws NotFoundEntityException {
        return telefoneRepository.count();//.orElseThrow(() ->
        //new NotFoundEntityException("Cliente nao encontrado!"));
    }


    public TelefoneModel deleteTelefone(Long id){// throws NotFoundEntityException {
        telefoneRepository.deleteById(id);//.orElseThrow(() ->
        //new NotFoundEntityException("Cliente nao encontrado!"));
        return null;
    }
    public LocalModel deleteDddNumero(int ddd, int numero){// throws NotFoundEntityException {
        telefoneRepository.deleteByDddAndNumero(ddd,numero);//.orElseThrow(() ->
        //new NotFoundEntityException("Cliente nao encontrado!"));
        return null;
    }

    public Object updateTelefone(Long id, TelefoneModel telefone) {
        return null;
    }

}