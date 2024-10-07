package com.example.demo.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entities.Colaborador;

public interface ColaboradorRepository extends JpaRepository<Colaborador,Long> {
	
}
	

