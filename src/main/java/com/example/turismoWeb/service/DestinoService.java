package com.example.turismoWeb.service;

import com.example.turismoWeb.exception.NotFoundEntityException;
import com.example.turismoWeb.model.DatasModel;
import com.example.turismoWeb.model.DestinoModel;
import com.example.turismoWeb.model.LocalModel;
import com.example.turismoWeb.repository.DestinoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DestinoService {
    @Autowired
    private DestinoRepository destinoRepository;

    public DestinoModel createDestino(DestinoModel destino) {
        destinoRepository.save(destino);
        return destino;
    }

    public List<DestinoModel> getAllDestino() {
        return destinoRepository.findAll();
    }
    public List<DestinoModel> getDestinoNull() {
        return destinoRepository.findByIdIsNullOrNomeIsNullOrValorIsNullOrderByValor();
    }
    public DestinoModel getDestinoId(Long id) throws NotFoundEntityException {
        return destinoRepository.findById(id).orElseThrow(() ->
                new NotFoundEntityException("Destino nao encontrado!"));
    }
    public List<DestinoModel> getNome(String nome){// throws NotFoundEntityException {
        return destinoRepository.findByNome(nome);//.orElseThrow(() ->
        //new NotFoundEntityException("Cliente nao encontrado!"));
    }
    public List<DestinoModel> getValor(float valor){// throws NotFoundEntityException {
        return destinoRepository.findByValor(valor);//.orElseThrow(() ->
        //new NotFoundEntityException("Cliente nao encontrado!"));
    }
    public DestinoModel getNomeValor(String nome, float valor){// throws NotFoundEntityException {
        return destinoRepository.findByNomeAndValor(nome, valor);//.orElseThrow(() ->
        //new NotFoundEntityException("Cliente nao encontrado!"));
    }
    public long count(){// throws NotFoundEntityException {
        return destinoRepository.count();//.orElseThrow(() ->
        //new NotFoundEntityException("Cliente nao encontrado!"));
    }


    public DestinoModel deleteDestino (Long id){// throws NotFoundEntityException {
        destinoRepository.deleteById(id);//.orElseThrow(() ->
        //new NotFoundEntityException("Cliente nao encontrado!"));
        return null;
    }
    public DestinoModel deleteNomeValor(String nome, float valor){// throws NotFoundEntityException {
        destinoRepository.deleteByNomeAndValor(nome,valor);//.orElseThrow(() ->
        //new NotFoundEntityException("Cliente nao encontrado!"));
        return null;
    }

    public Object updateDestino(Long id, DestinoModel destino) throws ChangeSetPersister.NotFoundException {
        DestinoModel destinoExistente = destinoRepository.findById(id).orElseThrow(() -> new ChangeSetPersister.NotFoundException());
        destinoExistente.setId(destino.getId());
        destinoExistente.setNome(destino.getNome());
        destinoExistente.setValor(destino.getValor());
        destinoExistente.setDatasModel(destino.getDatasModel());
        destinoExistente.setLocalModel(destino.getLocalModel());

        return destinoRepository.save(destinoExistente);
    }



}