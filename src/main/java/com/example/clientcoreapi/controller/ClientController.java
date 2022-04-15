package com.example.clientcoreapi.controller;

import com.example.clientcoreapi.model.ClientRequest;
import com.example.clientcoreapi.model.ClientResponse;
import com.example.clientcoreapi.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/client")
public class ClientController {
    @Autowired
    ClientService clientService;

    @GetMapping("/check")
    public String check() {
        return "client-core-api works";
    }

    @PostMapping
    public ClientResponse createClient(@RequestBody ClientRequest clientRequest){
        return clientService.createClient(clientRequest);
    }

    @PutMapping
    public ClientResponse updateClient(@RequestParam String clientId,
            @RequestBody ClientRequest clientRequest){
        clientRequest.setClientId(clientId);
        return clientService.updateClient(clientRequest);
    }

    @GetMapping("/all")
    public List<ClientResponse> getAllClients() {
        return clientService.getAllClients();
    }

    @GetMapping
    public ClientResponse getClientById(@RequestParam String clientId){
        return clientService.getClientById(clientId);
    }

    @DeleteMapping
    public String deleteClient(@RequestParam String clientId){
        clientService.deleteClientById(clientId);
        return "successfully deleted";
    }
}
