package com.example.turismoWeb.controller;

import com.example.turismoWeb.exception.NotFoundEntityException;
import com.example.turismoWeb.model.ClientePremiumModel;
import com.example.turismoWeb.service.ClientePremiumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientesPremium")
public class ClientePremiumController {
    @Autowired
    private ClientePremiumService clientePremiumService;

    @RequestMapping(value="/criar", method= RequestMethod.POST)
    public ResponseEntity<ClientePremiumModel> createClientePremium
            (@RequestBody ClientePremiumModel cliente) {
        return ResponseEntity.status(HttpStatus.OK)
                .body(clientePremiumService.createClientePremium((ClientePremiumModel) cliente));
    }

    @RequestMapping(value="/listarTodos", method=RequestMethod.GET)
    public ResponseEntity<List<ClientePremiumModel>> todosClientePremium() {
        return ResponseEntity.status(HttpStatus.OK)
                .body(clientePremiumService.getAllClientesPremium());
    }
    @RequestMapping(value="/vazio", method=RequestMethod.GET)
    public ResponseEntity<List<ClientePremiumModel>> semNomeEmailClientePremium() {
        return ResponseEntity.status(HttpStatus.OK)
                .body(clientePremiumService.getClientePremiumNull());
    }
    @RequestMapping(value="/maisPremium", method=RequestMethod.GET)
    public ResponseEntity<List<ClientePremiumModel>> premiumClientePremium() {
        return ResponseEntity.status(HttpStatus.OK)
                .body(clientePremiumService.getOrderByDiasDePremium());
    }

    @RequestMapping(value="/listaId/{clienteId}", method=RequestMethod.GET)
    public ResponseEntity<ClientePremiumModel> listIdClientePremium(
            @PathVariable(value = "clienteId") Long id) throws NotFoundEntityException {
        return ResponseEntity.status(HttpStatus.OK).body(clientePremiumService.getClientePremiumById(id));
    }
    @RequestMapping(value="/listaAgencia/{agencia}", method=RequestMethod.GET)
    public ResponseEntity<List<ClientePremiumModel>> listIdClientePremium(
            @PathVariable(value = "agencia") String agencia) throws NotFoundEntityException {
        return ResponseEntity.status(HttpStatus.OK).body(clientePremiumService.getAgencia(agencia));
    }
    @RequestMapping(value="/listaDiasDePremium/{diasDePremium}", method=RequestMethod.GET)
    public ResponseEntity<List<ClientePremiumModel>> listIdClientePremium(
            @PathVariable(value = "diasDePremium") int diasDePremium) throws NotFoundEntityException {
        return ResponseEntity.status(HttpStatus.OK).body( clientePremiumService.getDiasDePremium(diasDePremium));
    }
    @RequestMapping(value="/listaNomeEmail/{nome}/{email}", method=RequestMethod.GET)
    public ResponseEntity<ClientePremiumModel> acharNomeEmailClientePremium(
            @PathVariable(value = "nome") String nome,
            @PathVariable(value = "email")String email) throws NotFoundEntityException {
        return ResponseEntity.status(HttpStatus.OK).body(clientePremiumService.getClientePremiumByNomeAndEmail(nome,email));
    }
    @RequestMapping(value="/quantidade", method=RequestMethod.GET)
    public ResponseEntity<Long> quantidaeClientePremium() {
        return ResponseEntity.status(HttpStatus.OK)
                .body(clientePremiumService.count());
    }


    @RequestMapping(value="/update/{clienteId}", method=RequestMethod.PUT)
    public ResponseEntity<ClientePremiumModel> updateClientePremium(
            @PathVariable(value = "clienteId") Long id,
            @RequestBody ClientePremiumModel cliente) throws NotFoundEntityException, ChangeSetPersister.NotFoundException {
        return ResponseEntity.status(HttpStatus.OK)
                .body((ClientePremiumModel) clientePremiumService.updateClientePremium(id, cliente));

    }


    @RequestMapping(value="/deleteId/{clienteId}", method=RequestMethod.DELETE)
    public ResponseEntity<ClientePremiumModel> deleteClientePremium(
            @PathVariable(value = "clienteId") Long id) throws NotFoundEntityException {
        clientePremiumService.deleteClientePremium(id);
        return ResponseEntity.status(HttpStatus.OK).body(null);
    }
    @RequestMapping(value="/deleteNomeEmail/{nome}/{email}", method=RequestMethod.DELETE)
    public ResponseEntity<ClientePremiumModel> deleteNomeEmailClientePremium(
            @PathVariable(value = "nome") String nome,
            @PathVariable(value = "email")String email) throws NotFoundEntityException {
        clientePremiumService.deleteByNomeAndEmail(nome,email);
        return ResponseEntity.status(HttpStatus.OK).body(null);
    }


}
