package com.esercizioColloquio.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.esercizioColloquio.dtos.Cliente;
import com.esercizioColloquio.dtos.Conto;
import com.esercizioColloquio.repositories.ContoRepository;

@Service
public class ContoService {
    @Autowired
    private ContoRepository contoRepository;

    @Autowired
    private RestTemplate restTemplate;

    public List<Conto> getAllConti() {
        return contoRepository.findAll();
    }

    public Optional<Conto> getContoById(String id) {
        return contoRepository.findById(id);
    }

    public Conto createConto(Conto conto) {
        return contoRepository.save(conto);
    }

    public Conto updateConto(String id, Conto conto) {
        conto.setId(id);
        return contoRepository.save(conto);
    }

    public void deleteConto(String id) {
        contoRepository.deleteById(id);
    }

    public void delete(String id) {
        contoRepository.deleteById(id);
    }

    public Cliente getCliente(Conto conto){
        return restTemplate.getForObject("http://localhost:8080/api/clienti/" + conto.getClienteId(), Cliente.class);

    }

}
