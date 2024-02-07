package com.codigo.loja.pontosoft.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Vestuario extends Produto{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String tamanho;
    private int numeracao;
    private String modelo;
    private String cor;
    private String genero;


    public Vestuario(String nome, float preco, String categoria, String peso, String fabricante, String descricao) {
        super(nome, preco, categoria, peso, fabricante, descricao);
        this.tamanho = tamanho;
        this.numeracao = numeracao;
        this.modelo = modelo;
        this.cor = cor;
        this.genero = genero;
        
    }

    public void setTamanho(String tamanho){
        this.tamanho = tamanho;
    }

    public void setNumeracao(int numeracao){
        this.numeracao = numeracao;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public void setCor(String cor){
        this.cor = cor;
    }

    public void setGenero(String genero){
        this.genero = genero;
    }

    public String getTamanho(){
        return this.tamanho;
    }

    public int getNumeracao(){
        return this.numeracao;
    }

    public String getModelo(){
        return this.modelo;
    }
    
    public String getCor(){
        return this.cor;
    }

    public String getGenero(){
        return this.genero;
    }

}