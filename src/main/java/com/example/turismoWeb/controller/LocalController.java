package com.example.turismoWeb.controller;

import com.example.turismoWeb.exception.NotFoundEntityException;
import com.example.turismoWeb.model.LocalModel;
import com.example.turismoWeb.service.LocalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/local")
public class LocalController {
    @Autowired
    private LocalService localService;

    @RequestMapping(value="/criar", method= RequestMethod.POST)
    public ResponseEntity<LocalModel> criarLocal
            (@RequestBody LocalModel local) {
        return ResponseEntity.status(HttpStatus.OK)
                .body(localService.createLocal((LocalModel) local));
    }


    @RequestMapping(value="/listarTodos", method=RequestMethod.GET)
    public ResponseEntity<List<LocalModel>> todosLocal() {
        return ResponseEntity.status(HttpStatus.OK)
                .body(localService.getAllLocal());
    }
    @RequestMapping(value="/vazio", method=RequestMethod.GET)
    public ResponseEntity<List<LocalModel>> semLocal() {
        return ResponseEntity.status(HttpStatus.OK)
                .body(localService.getLocalNull());
    }
    @RequestMapping(value="/listaId/{localId}", method=RequestMethod.GET)
    public ResponseEntity<LocalModel> listIdLocal(
            @PathVariable(value = "localId") Long id) throws NotFoundEntityException {
        return ResponseEntity.status(HttpStatus.OK).body(localService.getLocalById(id));
    }
    @RequestMapping(value="/listaCidade/{cidade}", method=RequestMethod.GET)
    public ResponseEntity<List<LocalModel>> listCidadeLocal(
            @PathVariable(value = "cidade") String cidade) throws NotFoundEntityException {
        return ResponseEntity.status(HttpStatus.OK).body(localService.getCidade(cidade));
    }
    @RequestMapping(value="/listaEstado/{estado}", method=RequestMethod.GET)
    public ResponseEntity<List<LocalModel>> listEstadoLocal(
            @PathVariable(value = "estado") String estado) throws NotFoundEntityException {
        return ResponseEntity.status(HttpStatus.OK).body(localService.getEstado(estado));
    }
    @RequestMapping(value="/quantidade", method=RequestMethod.GET)
    public ResponseEntity<Long> quantidaeLocal() {
        return ResponseEntity.status(HttpStatus.OK)
                .body(localService.count());
    }


    @RequestMapping(value="/update/{localId}", method=RequestMethod.PUT)
    public ResponseEntity<LocalModel> updateLocal(
            @PathVariable(value = "localId") Long id,
            @RequestBody LocalModel local) throws NotFoundEntityException, ChangeSetPersister.NotFoundException {
        return ResponseEntity.status(HttpStatus.OK)
                .body((LocalModel) localService.updateLocal(id, local));

    }


    @RequestMapping(value="/deleteId/{localId}", method=RequestMethod.DELETE)
    public ResponseEntity<LocalModel> deleteLocal(
            @PathVariable(value = "localId") Long id) throws NotFoundEntityException {
        localService.deleteLocal(id);
        return ResponseEntity.status(HttpStatus.OK).body(null);
    }
    @RequestMapping(value="/deleteDistanciaCidade/{distancia}/{cidade}", method=RequestMethod.DELETE)
    public ResponseEntity<LocalModel> deleteDistanciaCidadeLocal(
            @PathVariable(value = "distancia") int distancia,
            @PathVariable(value = "cidade")String cidade) throws NotFoundEntityException {
        localService.deleteDistanciaCidade(distancia,cidade);
        return ResponseEntity.status(HttpStatus.OK).body(null);
    }


}