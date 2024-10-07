package com.example.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Colaborador {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String ctps;
    private String pis;
    private String tituloEleitor;
    private String reservista;
    private String estadoCivil;
    private int numDependentes;
    private String ativo;
    private String setor;
    private String cargo;
    private float salario;
    private String telefone1;
    private String telefone2;
    private String emailPessoal;
    private String emailCorporativo;

    public void admitir() {
        this.ativo = "Sim";
    }

    public void demitir() {
        this.ativo = "Não";
    }
}

