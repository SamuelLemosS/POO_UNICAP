package com.example.turismoWeb.service;

import com.example.turismoWeb.exception.NotFoundEntityException;
import com.example.turismoWeb.model.DestinoModel;
import com.example.turismoWeb.repository.DestinoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DestinoService {
    @Autowired
    private DestinoRepository destinoRepository;

    public List<DestinoModel> getAllDatas() {
        return destinoRepository.findAll();
    }
    public DestinoModel getClienteById(Long id) throws NotFoundEntityException {
        return destinoRepository.findById(id).orElseThrow(() ->
                new NotFoundEntityException("Data nao encontrado!"));
    }
    public DestinoModel findByNomeAndValor(String nome, float valor){// throws NotFoundEntityException {
        return destinoRepository.findByNomeAndValor(nome, valor);//.orElseThrow(() ->
        //new NotFoundEntityException("Cliente nao encontrado!"));
    }
    public DestinoModel deleteCliente(Long id){// throws NotFoundEntityException {
        destinoRepository.deleteById(id);//.orElseThrow(() ->
        //new NotFoundEntityException("Cliente nao encontrado!"));
        return null;
    }

    public DestinoModel createCliente(DestinoModel destino) {
        destinoRepository.save(destino);
        return destino;
    }

}