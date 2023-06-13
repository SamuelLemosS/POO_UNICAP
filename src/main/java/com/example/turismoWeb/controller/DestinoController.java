package com.example.turismoWeb.controller;

import com.example.turismoWeb.exception.NotFoundEntityException;
import com.example.turismoWeb.model.DestinoModel;
import com.example.turismoWeb.service.DestinoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/destino")
public class DestinoController {
    @Autowired
    private DestinoService destinoService;

    @RequestMapping(value="/criar", method= RequestMethod.POST)
    public ResponseEntity<DestinoModel> criarDestino
            (@RequestBody DestinoModel destino) {
        return ResponseEntity.status(HttpStatus.OK)
                .body(destinoService.createDestino((DestinoModel) destino));
    }


    @RequestMapping(value="/listarTodos", method=RequestMethod.GET)
    public ResponseEntity<List<DestinoModel>> todosDestino() {
        return ResponseEntity.status(HttpStatus.OK)
                .body(destinoService.getAllDestino());
    }
    @RequestMapping(value="/vazio", method=RequestMethod.GET)
    public ResponseEntity<List<DestinoModel>> semDestino() {
        return ResponseEntity.status(HttpStatus.OK)
                .body(destinoService.getDestinoNull());
    }
    @RequestMapping(value="/lista/{destinoId}", method=RequestMethod.GET)
    public ResponseEntity<DestinoModel> listIdDestino(
            @PathVariable(value = "destinoId") Long id) throws NotFoundEntityException {
        destinoService.getDestinoId(id);
        return ResponseEntity.status(HttpStatus.OK).body(null);
    }
    @RequestMapping(value="/lista/{nome}", method=RequestMethod.GET)
    public ResponseEntity<DestinoModel> listNomeDestino(
            @PathVariable(value = "nome") String nome) throws NotFoundEntityException {
        destinoService.getNome(nome);
        return ResponseEntity.status(HttpStatus.OK).body(null);
    }
    @RequestMapping(value="/lista/{valor}", method=RequestMethod.GET)
    public ResponseEntity<DestinoModel> listValorDestino(
            @PathVariable(value = "valor") float valor) throws NotFoundEntityException {
        destinoService.getValor(valor);
        return ResponseEntity.status(HttpStatus.OK).body(null);
    }
    @RequestMapping(value="/lista/{nome}/{valor}", method=RequestMethod.GET)
    public ResponseEntity<DestinoModel> listNomeValorDestino(
            @PathVariable(value = "nome") String nome,
            @PathVariable(value = "valor") float valor) throws NotFoundEntityException {
        destinoService.getNomeValor(nome, valor);
        return ResponseEntity.status(HttpStatus.OK).body(null);
    }
    @RequestMapping(value="/quantidae", method=RequestMethod.GET)
    public ResponseEntity<Long> quantidaeDestino() {
        return ResponseEntity.status(HttpStatus.OK)
                .body(destinoService.count());
    }

    @RequestMapping(value="/delete/{destinoId}", method=RequestMethod.DELETE)
    public ResponseEntity<DestinoModel> deleteDestino(
            @PathVariable(value = "destinoId") Long id) throws NotFoundEntityException {
        destinoService.deleteDestino(id);
        return ResponseEntity.status(HttpStatus.OK).body(null);
    }
    @RequestMapping(value="/delete/{nome}/{valor}", method=RequestMethod.DELETE)
    public ResponseEntity<DestinoModel> deleteNomeValorDestino(
            @PathVariable(value = "nome") String nome,
            @PathVariable(value = "valor")float valor) throws NotFoundEntityException {
        destinoService.deleteNomeValor(nome,valor);
        return ResponseEntity.status(HttpStatus.OK).body(null);
    }


    @RequestMapping(value="/update/{destinoId}", method=RequestMethod.PUT)
    public ResponseEntity<DestinoModel> updateDestino(
            @PathVariable(value = "destinoId") Long id,
            @RequestBody DestinoModel destino) throws NotFoundEntityException {
        return ResponseEntity.status(HttpStatus.OK)
                .body((DestinoModel) destinoService.updateDestino(id, destino));

    }

}