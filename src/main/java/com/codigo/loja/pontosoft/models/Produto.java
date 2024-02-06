package com.codigo.loja.pontosoft;

public class Produto{

    private String nome;
    private float preco;
    private String categoria;
    private String peso;
    private String fabricante;


    public Produto(String nome, float preco, String categoria, String peso, String fabricante){
       this.nome = nome;
       this.preco = preco;
       this.categoria = categoria;
       this.peso = peso;
       this.fabricante = fabricante;
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

    public void setFabricante(string fabricante){
        this.fabricante = fabricante;
    }

    public String getNome(){
        return this.nome;
    }

    public float getPreco(){
        return this.preco;
    }

    public String getCategoria(){
        return this.getCategoria;
    }

    public String getPeso(){
        return this.peso;
    }

    public String getFabricante(){
        return this.fabricante;
    }

}