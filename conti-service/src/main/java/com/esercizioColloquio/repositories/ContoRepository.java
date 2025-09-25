package com.esercizioColloquio.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.esercizioColloquio.dtos.Conto;
@Repository
public interface ContoRepository extends MongoRepository<Conto, String> {

}
