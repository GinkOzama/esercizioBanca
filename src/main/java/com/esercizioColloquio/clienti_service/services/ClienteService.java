package com.esercizioColloquio.clienti_service.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.esercizioColloquio.clienti_service.dtos.Cliente;
import com.esercizioColloquio.clienti_service.repositories.ClienteRepository;

@Service
public class ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;

    public List<Cliente> getAll(){
        return clienteRepository.findAll();
    }

    public Optional<Cliente> getById(String id){
        return clienteRepository.findById(id);
    }

    public Cliente save(Cliente cliente){
        return clienteRepository.save(cliente);
    }

    public void delete(String id){
        clienteRepository.deleteById(id);
    }
    
}   