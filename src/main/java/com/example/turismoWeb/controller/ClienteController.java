package com.example.turismoWeb.controller;

import com.example.turismoWeb.exception.NotFoundEntityException;
import com.example.turismoWeb.model.ClienteEntity;
import com.example.turismoWeb.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
    @Autowired
    private ClienteService clienteService;

    @RequestMapping(value="/criar", method= RequestMethod.POST)
    public ResponseEntity<ClienteEntity> createCliente
            (@RequestBody ClienteEntity cliente) {
        return ResponseEntity.status(HttpStatus.OK)
                .body(clienteService.createCliente((ClienteEntity) cliente));
    }

    @RequestMapping(value="/listarTodos", method=RequestMethod.GET)
    public ResponseEntity<List<ClienteEntity>> todosCliente() {
        return ResponseEntity.status(HttpStatus.OK)
                .body(clienteService.getAllClientes());
    }
    @RequestMapping(value="/vazio", method=RequestMethod.GET)
    public ResponseEntity<List<ClienteEntity>> semNomeEmailCliente() {
        return ResponseEntity.status(HttpStatus.OK)
                .body(clienteService.getClienteNull());
    }
    @RequestMapping(value="/listaId/{clienteId}", method=RequestMethod.GET)
    public ResponseEntity<ClienteEntity> listIdCliente(
            @PathVariable(value = "clienteId") Long id) throws NotFoundEntityException {
        return ResponseEntity.status(HttpStatus.OK).body(clienteService.getClienteById(id));
    }
    @RequestMapping(value="/listaNomeEmail/{nome}/{email}", method=RequestMethod.GET)
    public ResponseEntity<ClienteEntity> acharNomeEmailCliente(
            @PathVariable(value = "nome") String nome,
            @PathVariable(value = "email")String email) throws NotFoundEntityException {
        return ResponseEntity.status(HttpStatus.OK).body(clienteService.getClienteByNomeAndEmail(nome,email));
    }
    @RequestMapping(value="/quantidade", method=RequestMethod.GET)
    public ResponseEntity<Long> quantidaeCliente() {
        return ResponseEntity.status(HttpStatus.OK)
                .body(clienteService.count());
    }

    @RequestMapping(value="/update/{clienteId}", method=RequestMethod.PUT)
    public ResponseEntity<ClienteEntity> updateCliente(
            @PathVariable(value = "clienteId") Long id,
            @RequestBody ClienteEntity cliente) throws NotFoundEntityException, ChangeSetPersister.NotFoundException {
        return ResponseEntity.status(HttpStatus.OK)
                .body((ClienteEntity) clienteService.updateCliente(id, cliente));

    }


    @RequestMapping(value="/deleteId/{clienteId}", method=RequestMethod.DELETE)
    public ResponseEntity<ClienteEntity> deleteCliente(
            @PathVariable(value = "clienteId") Long id) throws NotFoundEntityException {
        clienteService.deleteCliente(id);
        return ResponseEntity.status(HttpStatus.OK).body(null);
    }
    @RequestMapping(value="/deleteNomeEmail/{nome}/{email}", method=RequestMethod.DELETE)
    public ResponseEntity<ClienteEntity> deleteNomeEmailCliente(
            @PathVariable(value = "nome") String nome,
            @PathVariable(value = "email")String email) throws NotFoundEntityException {
        clienteService.deleteByNomeAndEmail(nome,email);
        return ResponseEntity.status(HttpStatus.OK).body(null);
    }

}


