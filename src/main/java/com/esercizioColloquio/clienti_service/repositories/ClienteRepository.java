package com.esercizioColloquio.clienti_service.repositories;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.esercizioColloquio.clienti_service.dtos.Cliente;
@Repository
public interface ClienteRepository extends MongoRepository<Cliente, String> {

}
