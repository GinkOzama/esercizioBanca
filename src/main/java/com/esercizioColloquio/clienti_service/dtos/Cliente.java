package com.esercizioColloquio.clienti_service.dtos;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Document(collection = "clienti")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Cliente {
    @Id
    private String id;
    private String nome;
    private String cognome;
    private String codiceFiscale;
    private String email;
    private String indirizzo;
}
