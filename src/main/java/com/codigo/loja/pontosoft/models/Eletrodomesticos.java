package com.codigo.loja.pontosoft.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Eletrodomesticos extends Produto{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int potencia;
    private int voltagem;
    private String tipoEletrodomestico;
    private String cor;
    private float altura;
    private float largura;
    private float profundidade;

public Eletrodomesticos(String nome, float preco, String categoria, String peso, String fabricante, String descricao) {
    super(nome, preco, categoria, peso, fabricante, descricao);
    this.potencia = potencia;
    this.voltagem = voltagem;
    this.tipoEletrodomestico = tipoEletrodomestico;
    this.cor = cor;
    this.altura = altura;
    this.largura = largura;
    this.profundidade = profundidade;
}


    

    
}
