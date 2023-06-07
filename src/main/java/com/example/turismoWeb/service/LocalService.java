package com.example.turismoWeb.service;

import com.example.turismoWeb.exception.NotFoundEntityException;
import com.example.turismoWeb.model.LocalModel;
import com.example.turismoWeb.repository.LocalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocalService {
    @Autowired
    private LocalRepository localRepository;
    public List<LocalModel> getAllDatas() {
        return localRepository.findAll();
    }
    public LocalModel getClienteById(Long id) throws NotFoundEntityException {
        return localRepository.findById(id).orElseThrow(() ->
                new NotFoundEntityException("Data nao encontrado!"));
    }
    public LocalModel findByDistanciaAndCidade(int distancia,String cidade){// throws NotFoundEntityException {
        return localRepository.findByDistanciaAndCidade( distancia, cidade);//.orElseThrow(() ->
        //new NotFoundEntityException("Cliente nao encontrado!"));
    }
    public LocalModel deleteCliente(Long id){// throws NotFoundEntityException {
        localRepository.deleteById(id);//.orElseThrow(() ->
        //new NotFoundEntityException("Cliente nao encontrado!"));
        return null;
    }

    public LocalModel createCliente(LocalModel local) {
        localRepository.save(local);
        return local;
    }

}