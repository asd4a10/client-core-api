package com.example.clientcoreapi.service;

import com.example.clientcoreapi.model.ClientModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

@Service
public class ClientServiceImpl implements ClientService {
    private static final HashMap<String, ClientModel> postMap = new HashMap<>();

    static {
        ClientModel clientModel = new ClientModel("id1", "Rustem", "one", "mail@123");
        ClientModel clientMode2 = new ClientModel("id2", "LEvi", "one", "mail@123");
        ClientModel clientMode3 = new ClientModel("id3", "Mikasa", "one", "mail@123");

        postMap.put(clientModel.getClientId(), clientModel);
        postMap.put(clientMode2.getClientId(), clientMode2);
        postMap.put(clientMode3.getClientId(), clientMode3);
    }
    @Override
    public void createClient(ClientModel clientModel) {
        clientModel.setClientId(UUID.randomUUID().toString());
        postMap.put(clientModel.getClientId(),clientModel);
    }

    @Override
    public List<ClientModel> getAllClients() {
        return new ArrayList<>(postMap.values());
    }

    @Override
    public ClientModel getClientById(String clientId) {
        return postMap.get(clientId);
    }

    @Override
    public void updateClientById(String clientId, ClientModel clientModel) {
        clientModel.setClientId(clientId);
        postMap.put(clientModel.getClientId(),clientModel);
    }

    @Override
    public void deleteClientById(String clientId) {
        postMap.remove(clientId);
    }


}
