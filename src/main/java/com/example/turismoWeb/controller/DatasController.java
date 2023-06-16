package com.example.turismoWeb.controller;

import com.example.turismoWeb.exception.NotFoundEntityException;
import com.example.turismoWeb.model.DatasModel;
import com.example.turismoWeb.service.DatasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/datas")
public class DatasController {
    @Autowired
    private DatasService datasService;

    @RequestMapping(value="/criar", method= RequestMethod.POST)
    public ResponseEntity<DatasModel> criarDatas
            (@RequestBody DatasModel data) {
        return ResponseEntity.status(HttpStatus.OK)
                .body(datasService.createDatas((DatasModel) data));
    }


    @RequestMapping(value="/listarTodos", method=RequestMethod.GET)
    public ResponseEntity<List<DatasModel>> todosDatas() {
        return ResponseEntity.status(HttpStatus.OK)
                .body(datasService.getAllDatas());
    }
    @RequestMapping(value="/vazio", method=RequestMethod.GET)
    public ResponseEntity<List<DatasModel>> semDiaData() {
        return ResponseEntity.status(HttpStatus.OK)
                .body(datasService.getDatasNull());
    }
    @RequestMapping(value="/listaId/{datasId}", method=RequestMethod.GET)
    public ResponseEntity<DatasModel> listIdDatas(
            @PathVariable(value = "datasId") Long id) throws NotFoundEntityException {
        return ResponseEntity.status(HttpStatus.OK).body(datasService.getDatasById(id));
    }
    @RequestMapping(value="/listaMes/{mes}", method=RequestMethod.GET)
    public ResponseEntity<List<DatasModel>> listMesDatas(
            @PathVariable(value = "mes") int mes) throws NotFoundEntityException {
        return ResponseEntity.status(HttpStatus.OK).body( datasService.getMes(mes));
    }
    @RequestMapping(value="/listaAno/{ano}", method=RequestMethod.GET)
    public ResponseEntity<List<DatasModel>> listAnoDatas(
            @PathVariable(value = "ano") int ano) throws NotFoundEntityException {
        return ResponseEntity.status(HttpStatus.OK).body( datasService.getAno(ano));
    }
    @RequestMapping(value="/quantidade", method=RequestMethod.GET)
    public ResponseEntity<Long> quantidaeDatas() {
        return ResponseEntity.status(HttpStatus.OK)
                .body(datasService.count());
    }


    @RequestMapping(value="/update/{datasId}", method=RequestMethod.PUT)
    public ResponseEntity<DatasModel> updateData(
            @PathVariable(value = "datasId") Long id,
            @RequestBody DatasModel data) throws NotFoundEntityException, ChangeSetPersister.NotFoundException {
        return ResponseEntity.status(HttpStatus.OK)
                .body (datasService.updateData(id, data));

    }


    @RequestMapping(value="/deleteId/{datasId}", method=RequestMethod.DELETE)
    public ResponseEntity<DatasModel> deleteDatas(
            @PathVariable(value = "datasId") Long id) throws NotFoundEntityException {
        datasService.deleteDatas(id);
        return ResponseEntity.status(HttpStatus.OK).body(null);
    }
    @RequestMapping(value="/deleteDiaMesAno/{dia}/{mes}/{ano}", method=RequestMethod.DELETE)
    public ResponseEntity<DatasModel> deleteDiaMesAnoDatas(
            @PathVariable(value = "dia") int dia,
            @PathVariable(value = "mes")int mes,
            @PathVariable(value = "ano")int ano)throws NotFoundEntityException {
        datasService.deleteByDiaAndMesAndAno(dia,mes, ano);
        return ResponseEntity.status(HttpStatus.OK).body(null);
    }



}