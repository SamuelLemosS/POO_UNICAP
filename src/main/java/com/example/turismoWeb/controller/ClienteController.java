package com.example.TurismoWeb.controller;

import com.example.TurismoWeb.model.ClienteModel;
import com.example.TurismoWeb.service.ClienteService;
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

    @RequestMapping(value="/create", method= RequestMethod.POST)
    public ResponseEntity<ClienteModel> createCliente
            (@RequestBody ClienteModel cliente) {
        return ResponseEntity.status(HttpStatus.OK)
                .body(clienteService.createCliente(cliente));
    }
    @RequestMapping(value="/list", method=RequestMethod.GET)
    public ResponseEntity<List<ClienteModel>> readCliente() {
        return ResponseEntity.status(HttpStatus.OK)
                .body(clienteService.getAllClientes());
    }

    /*@RequestMapping(value="/delete/{clienteId}", method=RequestMethod.DELETE)
    public ResponseEntity<ClienteModel> deleteCliente(
            @PathVariable(value = "clienteId") Long id) {
        clienteService.deleteCliente(id);
        return ResponseEntity.status(HttpStatus.OK).body(null);
    }*/

}

