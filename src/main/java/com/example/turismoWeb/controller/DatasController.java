package com.example.turismoWeb.controller;

import com.example.turismoWeb.exception.NotFoundEntityException;
import com.example.turismoWeb.model.ClientePremiumModel;
import com.example.turismoWeb.model.DatasModel;
import com.example.turismoWeb.service.DatasService;
import org.springframework.beans.factory.annotation.Autowired;
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
    @RequestMapping(value="/semDia", method=RequestMethod.GET)
    public ResponseEntity<List<DatasModel>> semDiaData() {
        return ResponseEntity.status(HttpStatus.OK)
                .body(datasService.getDiaIsNull());
    }
    @RequestMapping(value="/lista/{dataId}", method=RequestMethod.GET)
    public ResponseEntity<DatasModel> listIdDatas(
            @PathVariable(value = "dataId") Long id) throws NotFoundEntityException {
        datasService.getDatasById(id);
        return ResponseEntity.status(HttpStatus.OK).body(null);
    }
    @RequestMapping(value="/lista/{mes}", method=RequestMethod.GET)
    public ResponseEntity<DatasModel> listMesDatas(
            @PathVariable(value = "mes") int mes) throws NotFoundEntityException {
        datasService.getMes(mes);
        return ResponseEntity.status(HttpStatus.OK).body(null);
    }
    @RequestMapping(value="/lista/{ano}", method=RequestMethod.GET)
    public ResponseEntity<DatasModel> listAnoDatas(
            @PathVariable(value = "ano") int ano) throws NotFoundEntityException {
        datasService.getAno(ano);
        return ResponseEntity.status(HttpStatus.OK).body(null);
    }
    @RequestMapping(value="/quantidae", method=RequestMethod.GET)
    public ResponseEntity<Long> quantidaeDatas() {
        return ResponseEntity.status(HttpStatus.OK)
                .body(datasService.count());
    }

    @RequestMapping(value="/delete/{datasId}", method=RequestMethod.DELETE)
    public ResponseEntity<DatasModel> deleteDatas(
            @PathVariable(value = "datasId") Long id) throws NotFoundEntityException {
        datasService.deleteDatas(id);
        return ResponseEntity.status(HttpStatus.OK).body(null);
    }
    @RequestMapping(value="/delete/{dia}/{mes}/{ano}", method=RequestMethod.DELETE)
    public ResponseEntity<DatasModel> deleteDiaMesAnoDatas(
            @PathVariable(value = "dia") int dia,
            @PathVariable(value = "mes")int mes,
            @PathVariable(value = "ano")int ano)throws NotFoundEntityException {
        datasService.deleteByDiaAndMesAndAno(dia,mes, ano);
        return ResponseEntity.status(HttpStatus.OK).body(null);
    }


    @RequestMapping(value="/update/{dataId}", method=RequestMethod.PUT)
    public ResponseEntity<DatasModel> updateData(
            @PathVariable(value = "dataId") Long id,
            @RequestBody DatasModel data) throws NotFoundEntityException {
        return ResponseEntity.status(HttpStatus.OK)
                .body((DatasModel) datasService.updateData(id, data));

    }

}