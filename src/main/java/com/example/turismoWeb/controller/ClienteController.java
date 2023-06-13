package com.example.turismoWeb.controller;

import com.example.turismoWeb.exception.NotFoundEntityException;
import com.example.turismoWeb.model.ClienteEntity;
import com.example.turismoWeb.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
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
    @RequestMapping(value="/lista/{clienteId}", method=RequestMethod.GET)
    public ResponseEntity<ClienteEntity> listIdCliente(
            @PathVariable(value = "clienteId") Long id) throws NotFoundEntityException {
        clienteService.getClienteById(id);
        return ResponseEntity.status(HttpStatus.OK).body(null);
    }
    @RequestMapping(value="/quantidae", method=RequestMethod.GET)
    public ResponseEntity<Long> quantidaeCliente() {
        return ResponseEntity.status(HttpStatus.OK)
                .body(clienteService.count());
    }
    @RequestMapping(value="/semNomeEmail", method=RequestMethod.GET)
    public ResponseEntity<List<ClienteEntity>> semNomeEmailCliente() {
        return ResponseEntity.status(HttpStatus.OK)
                .body(clienteService.getClienteNull());
    }
    @RequestMapping(value="/achar/{nome}/{email}", method=RequestMethod.DELETE)
    public ResponseEntity<ClienteEntity> acharNomeEmailCliente(
            @PathVariable(value = "nome") String nome,
            @PathVariable(value = "email")String email) throws NotFoundEntityException {
        clienteService.getClienteByNomeAndEmail(nome,email);
        return ResponseEntity.status(HttpStatus.OK).body(null);
    }

    @RequestMapping(value="/delete/{nome}/{email}", method=RequestMethod.DELETE)
    public ResponseEntity<ClienteEntity> deleteNomeEmailCliente(
            @PathVariable(value = "nome") String nome,
            @PathVariable(value = "email")String email) throws NotFoundEntityException {
        clienteService.deleteByNomeAndEmail(nome,email);
        return ResponseEntity.status(HttpStatus.OK).body(null);
    }
    @RequestMapping(value="/delete/{clienteId}", method=RequestMethod.DELETE)
    public ResponseEntity<ClienteEntity> deleteCliente(
            @PathVariable(value = "clienteId") Long id) throws NotFoundEntityException {
        clienteService.deleteCliente(id);
        return ResponseEntity.status(HttpStatus.OK).body(null);
    }

    @RequestMapping(value="/update/{clienteId}", method=RequestMethod.PUT)
    public ResponseEntity<ClienteEntity> updateCliente(
            @PathVariable(value = "clienteId") Long id,
            @RequestBody ClienteEntity cliente) throws NotFoundEntityException {
        return ResponseEntity.status(HttpStatus.OK)
                .body((ClienteEntity) clienteService.updateCliente(id, cliente));

    }

}
