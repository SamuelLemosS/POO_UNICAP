package com.example.turismoWeb.controller;

import com.example.turismoWeb.exception.NotFoundEntityException;
import com.example.turismoWeb.model.TelefoneModel;
import com.example.turismoWeb.service.TelefoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/telefone")
public class TelefoneController {
    @Autowired
    private TelefoneService telefoneService;

    @RequestMapping(value="/criar", method= RequestMethod.POST)
    public ResponseEntity<TelefoneModel> criarTelefone
            (@RequestBody TelefoneModel telefone) {
        return ResponseEntity.status(HttpStatus.OK)
                .body(telefoneService.createTelefone((TelefoneModel) telefone));
    }


    @RequestMapping(value="/listarTodos", method=RequestMethod.GET)
    public ResponseEntity<List<TelefoneModel>> todosTelefone() {
        return ResponseEntity.status(HttpStatus.OK)
                .body(telefoneService.getAllTelefone());
    }
    @RequestMapping(value="/vazio", method=RequestMethod.GET)
    public ResponseEntity<List<TelefoneModel>> semTelefone() {
        return ResponseEntity.status(HttpStatus.OK)
                .body(telefoneService.getTelefoneNull());
    }
    @RequestMapping(value="/lista/{telefoneId}", method=RequestMethod.GET)
    public ResponseEntity<TelefoneModel> listIdTelefone(
            @PathVariable(value = "telefoneId") Long id) throws NotFoundEntityException {
        telefoneService.getTelefoneId(id);
        return ResponseEntity.status(HttpStatus.OK).body(null);
    }
    @RequestMapping(value="/lista/{ddd}", method=RequestMethod.GET)
    public ResponseEntity<TelefoneModel> listDddTelefone(
            @PathVariable(value = "ddd") int ddd) throws NotFoundEntityException {
        telefoneService.getDdd(ddd);
        return ResponseEntity.status(HttpStatus.OK).body(null);
    }
    @RequestMapping(value="/quantidade", method=RequestMethod.GET)
    public ResponseEntity<Long> quantidaeTelefone() {
        return ResponseEntity.status(HttpStatus.OK)
                .body(telefoneService.count());
    }

    @RequestMapping(value="/delete/{telefoneId}", method=RequestMethod.DELETE)
    public ResponseEntity<TelefoneModel> deleteTelefone(
            @PathVariable(value = "telefoneId") Long id) throws NotFoundEntityException {
        telefoneService.deleteTelefone(id);
        return ResponseEntity.status(HttpStatus.OK).body(null);
    }
    @RequestMapping(value="/delete/{ddd}/{numero}", method=RequestMethod.DELETE)
    public ResponseEntity<TelefoneModel> deleteDddNumeroTelefone(
            @PathVariable(value = "ddd") int ddd,
            @PathVariable(value = "numero")int numero) throws NotFoundEntityException {
        telefoneService.deleteDddNumero(ddd,numero);
        return ResponseEntity.status(HttpStatus.OK).body(null);
    }


    @RequestMapping(value="/update/{telefoneId}", method=RequestMethod.PUT)
    public ResponseEntity<TelefoneModel> updateTelefone(
            @PathVariable(value = "telefoneId") Long id,
            @RequestBody TelefoneModel telefone) throws NotFoundEntityException {
        return ResponseEntity.status(HttpStatus.OK)
                .body((TelefoneModel) telefoneService.updateTelefone(id, telefone));

    }

}