package com.example.turismoWeb.service;

import com.example.turismoWeb.exception.NotFoundEntityException;
import com.example.turismoWeb.model.ClientePremiumModel;
import com.example.turismoWeb.model.DatasModel;
import com.example.turismoWeb.repository.DatasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Service
public class DatasService {
    @Autowired
    private DatasRepository datasRepository;

    public DatasModel createDatas(DatasModel data) {
        datasRepository.save(data);
        return data;
    }

    public List<DatasModel> getAllDatas() {
        return datasRepository.findAll();
    }
    public List<DatasModel> getDatasNull() {
        return datasRepository.findByIdIsNullOrDiaIsNullOrMesIsNullOrAnoIsNullOrderById();
    }
    public DatasModel getDatasById(Long id) throws NotFoundEntityException {
        return datasRepository.findById(id).orElseThrow(() ->
                new NotFoundEntityException("Data nao encontrado!"));
    }
    public List<DatasModel> getMes(int mes){// throws NotFoundEntityException {
        return datasRepository.findByMes(mes);//.orElseThrow(() ->
        //new NotFoundEntityException("Cliente nao encontrado!"));
    }
    public List<DatasModel> getAno(int ano){// throws NotFoundEntityException {
        return datasRepository.findByAno(ano);//.orElseThrow(() ->
        //new NotFoundEntityException("Cliente nao encontrado!"));
    }
    public long count(){// throws NotFoundEntityException {
        return datasRepository.count();//.orElseThrow(() ->
        //new NotFoundEntityException("Cliente nao encontrado!"));
    }


    public DatasModel updateData(Long id, DatasModel data) throws ChangeSetPersister.NotFoundException {
        DatasModel datasExistente = datasRepository.findById(id).orElseThrow(() -> new ChangeSetPersister.NotFoundException());
        datasExistente.setId(data.getId());
        datasExistente.setDia(data.getDia());
        datasExistente.setMes(data.getMes());
        datasExistente.setAno(data.getAno());

        return datasRepository.save(datasExistente);
    }


    public DatasModel deleteDatas(Long id){// throws NotFoundEntityException {
        datasRepository.deleteById(id);//.orElseThrow(() ->
        //new NotFoundEntityException("Cliente nao encontrado!"));
        return null;
    }
    public DatasModel deleteByDiaAndMesAndAno(int dia, int mes, int ano){// throws NotFoundEntityException {
        datasRepository.deleteByDiaAndMesAndAno(dia, mes, ano);//.orElseThrow(() ->
        //new NotFoundEntityException("Cliente nao encontrado!"));
        return null;
    }




}