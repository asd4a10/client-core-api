package com.example.clientcoreapi.repository;

import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;
import java.util.List;

public interface ClientRepository extends CrudRepository<ClientEntity, Long> {
    ClientEntity getClientEntityByClientId(String clientId);

    List<ClientEntity> getClientEntitiesBy();

    @Transactional
    void deleteClientEntityByClientId(String clientId);
}
