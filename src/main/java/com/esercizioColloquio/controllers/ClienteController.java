package com.esercizioColloquio.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.esercizioColloquio.clienti_service.dtos.Cliente;
import com.esercizioColloquio.clienti_service.services.ClienteService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api/clienti")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping("/getAll")
    public List<Cliente> getAll() {
        return clienteService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Cliente> getById(@PathVariable String id) {
        return clienteService.getById(id);
    }

    @PostMapping("/save")
    public Cliente save(@RequestBody Cliente cliente) {
        return clienteService.save(cliente);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable String id) {
        clienteService.delete(id);
    }
}
