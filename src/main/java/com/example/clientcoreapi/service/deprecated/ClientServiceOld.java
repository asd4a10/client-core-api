package com.example.clientcoreapi.service.deprecated;

import com.example.clientcoreapi.model.ClientModel;

import java.util.List;

public interface ClientServiceOld {
    void createClient(ClientModel clientModel);

    List<ClientModel> getAllClients();

    ClientModel getClientById(String clientId);

    void updateClientById(String clientId, ClientModel clientModel);

    void deleteClientById(String clientId);
}
