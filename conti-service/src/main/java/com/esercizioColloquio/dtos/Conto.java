package com.esercizioColloquio.dtos;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Document(collection = "conti")
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class Conto {
    @Id
    private String id;
    private String iban;
    private double saldo;
    private LocalDate dataApertura;
    private String clienteId;

}
