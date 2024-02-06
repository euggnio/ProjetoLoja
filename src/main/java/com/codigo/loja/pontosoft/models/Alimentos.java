package com.codigo.loja.pontosoft;

public class Alimentos extends Produto{

    private Date validade;
    private Date dataFabricacao;
    private String ingredientes;
    private Boolean importado;

    public Alimentos(String nome, float preco, String categoria, String peso, String fabricante, Date validade, Date dataFabricacao, String ingredientes, Boolean importado){
        super(nome,preco,categoria,peso,fabricante);
        this.validade = validade;
        this.dataFabricacao = dataFabricacao;
        this.ingredientes = ingredientes;
        this.importado = importado;
    }


}