package com.example.turismoWeb.controller;

import com.example.turismoWeb.exception.NotFoundEntityException;
import com.example.turismoWeb.model.ClientePremiumModel;
import com.example.turismoWeb.model.DatasModel;
import com.example.turismoWeb.model.LocalModel;
import com.example.turismoWeb.service.DatasService;
import com.example.turismoWeb.service.LocalService;
import org.springframework.beans.factory.annotation.Autowired;
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
                .body(localService.getIsNull());
    }
    @RequestMapping(value="/lista/{localId}", method=RequestMethod.GET)
    public ResponseEntity<LocalModel> listIdLocal(
            @PathVariable(value = "localId") Long id) throws NotFoundEntityException {
        localService.getLocalById(id);
        return ResponseEntity.status(HttpStatus.OK).body(null);
    }
    @RequestMapping(value="/lista/{cidade}", method=RequestMethod.GET)
    public ResponseEntity<LocalModel> listCidadeLocal(
            @PathVariable(value = "cidade") String cidade) throws NotFoundEntityException {
        localService.getCidade(cidade);
        return ResponseEntity.status(HttpStatus.OK).body(null);
    }
    @RequestMapping(value="/lista/{estado}", method=RequestMethod.GET)
    public ResponseEntity<LocalModel> listEstadoLocal(
            @PathVariable(value = "estado") String estado) throws NotFoundEntityException {
        localService.getEstado(estado);
        return ResponseEntity.status(HttpStatus.OK).body(null);
    }
    @RequestMapping(value="/quantidae", method=RequestMethod.GET)
    public ResponseEntity<Long> quantidaeLocal() {
        return ResponseEntity.status(HttpStatus.OK)
                .body(localService.count());
    }

    @RequestMapping(value="/delete/{localId}", method=RequestMethod.DELETE)
    public ResponseEntity<LocalModel> deleteLocal(
            @PathVariable(value = "localId") Long id) throws NotFoundEntityException {
        localService.deleteLocal(id);
        return ResponseEntity.status(HttpStatus.OK).body(null);
    }
    @RequestMapping(value="/delete/{distancia}/{cidade}", method=RequestMethod.DELETE)
    public ResponseEntity<LocalModel> deleteDistanciaCidadeLocal(
            @PathVariable(value = "distancia") int distancia,
            @PathVariable(value = "cidade")String cidade) throws NotFoundEntityException {
        localService.deleteDistanciaCidade(distancia,cidade);
        return ResponseEntity.status(HttpStatus.OK).body(null);
    }


    @RequestMapping(value="/update/{localId}", method=RequestMethod.PUT)
    public ResponseEntity<LocalModel> updateLocal(
            @PathVariable(value = "localId") Long id,
            @RequestBody LocalModel local) throws NotFoundEntityException {
        return ResponseEntity.status(HttpStatus.OK)
                .body((LocalModel) localService.updateLocal(id, local));

    }

}