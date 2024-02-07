package com.codigo.loja.pontosoft.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@AllArgsConstructor
@NoArgsConstructor
public class Produto{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private float preco;
    private String categoria;
    private String peso;
    private String fabricante;
    private String descricao;


    public Produto(String nome, float preco, String categoria, String peso, String fabricante, String descricao){
       this.nome = nome;
       this.preco = preco;
       this.categoria = categoria;
       this.peso = peso;
       this.fabricante = fabricante;
       this.descricao = descricao;
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setPreco(float preco){
        this.preco = preco;
    }

    public void setCategoria(String categoria){
        this.categoria = categoria;
    }

    public void setPeso(String peso){
        this.peso = peso;
    } 

    public void setFabricante(String fabricante){
        this.fabricante = fabricante;
    }

    public String getNome(){
        return this.nome;
    }

    public float getPreco(){
        return this.preco;
    }

    public String getCategoria(){
        return this.categoria;
    }

    public String getPeso(){
        return this.peso;
    }

    public String getFabricante(){
        return this.fabricante;
    }

    public String getDescricao(){
        return this.descricao;
    }

}