package com.example.clientcoreapi.service;

import com.example.clientcoreapi.model.ClientModel;

import java.util.List;

public interface ClientService {
    void createClient(ClientModel clientModel);

    List<ClientModel> getAllClients();

    ClientModel getClientById(String clientId);

    void updateClientById(String clientId, ClientModel clientModel);

    void deleteClientById(String clientId);
}
