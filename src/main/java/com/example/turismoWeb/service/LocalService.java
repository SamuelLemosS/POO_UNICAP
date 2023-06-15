package com.example.turismoWeb.service;

import com.example.turismoWeb.exception.NotFoundEntityException;
import com.example.turismoWeb.model.DatasModel;
import com.example.turismoWeb.model.LocalModel;
import com.example.turismoWeb.repository.LocalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocalService {
    @Autowired
    private LocalRepository localRepository;
    public LocalModel createLocal(LocalModel local) {
        localRepository.save(local);
        return local;
    }

    public List<LocalModel> getAllLocal() {
        return localRepository.findAll();
    }
    public List<LocalModel> getLocalNull() {
        return localRepository.findByIdIsNullOrEstadoIsNullOrCidadeIsNullOrDistanciaIsNullOrderById();
    }
    public LocalModel getLocalById(Long id) throws NotFoundEntityException {
        return localRepository.findById(id).orElseThrow(() ->
                new NotFoundEntityException("Local nao encontrado!"));
    }
    public List<LocalModel> getCidade(String cidade){// throws NotFoundEntityException {
        return localRepository.findByCidadeOrderByDistancia(cidade);//.orElseThrow(() ->
        //new NotFoundEntityException("Cliente nao encontrado!"));
    }
    public List<LocalModel> getEstado(String estado){// throws NotFoundEntityException {
        return localRepository.findByEstadoOrderByDistancia(estado);//.orElseThrow(() ->
        //new NotFoundEntityException("Cliente nao encontrado!"));
    }
    public long count(){// throws NotFoundEntityException {
        return localRepository.count();//.orElseThrow(() ->
        //new NotFoundEntityException("Cliente nao encontrado!"));
    }

    public LocalModel deleteLocal(Long id){// throws NotFoundEntityException {
        localRepository.deleteById(id);//.orElseThrow(() ->
        //new NotFoundEntityException("Cliente nao encontrado!"));
        return null;
    }
    public LocalModel deleteDistanciaCidade(int distancia, String cidade){// throws NotFoundEntityException {
        localRepository.deleteByDistanciaAndCidade(distancia,cidade);//.orElseThrow(() ->
        //new NotFoundEntityException("Cliente nao encontrado!"));
        return null;
    }

    public Object updateLocal(Long id, LocalModel local) throws ChangeSetPersister.NotFoundException {
        LocalModel localExistente = localRepository.findById(id).orElseThrow(() -> new ChangeSetPersister.NotFoundException());
        localExistente.setId(local.getId());
        localExistente.setEstado(local.getEstado());
        localExistente.setCidade(local.getCidade());
        localExistente.setDistancia(local.getDistancia());

        return localRepository.save(localExistente);
    }

}