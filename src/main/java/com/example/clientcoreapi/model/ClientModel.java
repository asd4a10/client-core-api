package com.example.clientcoreapi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ClientModel {
    @NonNull
    private String clientId;
    private String name;
    private String surname;
    private String email;
}
