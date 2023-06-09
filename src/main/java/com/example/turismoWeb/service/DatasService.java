package com.example.turismoWeb.service;

import com.example.turismoWeb.exception.NotFoundEntityException;
import com.example.turismoWeb.model.DatasModel;
import com.example.turismoWeb.repository.DatasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DatasService {
    @Autowired
    private DatasRepository datasRepository;

    public List<DatasModel> getAllDatas() {
        return datasRepository.findAll();
    }
    public DatasModel getDatasById(Long id) throws NotFoundEntityException {
        return datasRepository.findById(id).orElseThrow(() ->
                new NotFoundEntityException("Data nao encontrado!"));
    }
    public DatasModel findByDiaAndMesAndAno(int dia, int mes, int ano){// throws NotFoundEntityException {
        return datasRepository.findByDiaAndMesAndAno( dia,  mes,  ano);//.orElseThrow(() ->
        //new NotFoundEntityException("Cliente nao encontrado!"));
    }
    public DatasModel deleteDatas(Long id){// throws NotFoundEntityException {
        datasRepository.deleteById(id);//.orElseThrow(() ->
        //new NotFoundEntityException("Cliente nao encontrado!"));
        return null;
    }

    public DatasModel createDatas(DatasModel data) {
        datasRepository.save(data);
        return data;
    }

}