package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entities.Colaborador;
import com.example.demo.repositories.ColaboradorRepository;
import java.util.List;
import java.util.Optional;

@Service
public class ColaboradorService {

    @Autowired
    private ColaboradorRepository repository;

    public Colaborador save(Colaborador colaborador) {
        return repository.save(colaborador);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

    public List<Colaborador> findAll() {
        return repository.findAll();
    }

    public Optional<Colaborador> findById(Long id) {
        return repository.findById(id);
    }
}