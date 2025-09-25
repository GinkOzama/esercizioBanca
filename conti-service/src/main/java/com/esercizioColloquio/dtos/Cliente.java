package com.esercizioColloquio.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class Cliente {
    private String id;
    private String nome;
    private String cognome;
    private String codiceFiscale;
    private String email;
    private String indirizzo;
}
