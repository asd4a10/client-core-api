package com.example.clientcoreapi.controller;

import com.example.clientcoreapi.model.ClientModel;
import com.example.clientcoreapi.service.deprecated.ClientServiceOld;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/deprecated/client")
public class ClientControllerOld {

    @Autowired
    ClientServiceOld clientService;

    @Autowired
    Environment env;

    @GetMapping("/check")
    public String check(){
        return "client core api works "+env.getProperty("local.server.port");
    }

    @PostMapping
    public ResponseEntity<String> createClient(@Valid @RequestBody ClientModel clientModel){
        clientService.createClient(clientModel);
        return new ResponseEntity("Client is created successfully", HttpStatus.OK);
    }

    @GetMapping("/all")
    public List<ClientModel> getAllClients() {
        return clientService.getAllClients();
    }

    @GetMapping("/{clientId}")
    public ClientModel getPostById(@PathVariable String clientId) {
        return clientService.getClientById(clientId);
    }

    @PutMapping("/{clientId}")
    public ResponseEntity<String> updateClientById(@PathVariable String clientId, @Valid @RequestBody ClientModel clientModel){
        clientService.updateClientById(clientId, clientModel);
        return new ResponseEntity("Client is created updated", HttpStatus.OK);
    }

    @DeleteMapping("/{clientId}")
    public ResponseEntity<String> deletePostById(@PathVariable String clientId) {
        clientService.deleteClientById(clientId);
        return new ResponseEntity<>("Post is deleted successfully", HttpStatus.OK);
    }

}
