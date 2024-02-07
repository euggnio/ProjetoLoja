package com.codigo.loja.pontosoft.models;

import java.util.Date;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Alimentos extends Produto{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Date validade;
    private Date dataFabricacao;
    private String ingredientes;                
    private Boolean importado;

    @OneToOne(mappedBy = "produto", cascade = CascadeType.ALL)
    private TabelaNutricional tabelaNutricional; 

    public Alimentos(String nome, float preco, String categoria, String peso, String fabricante, Date validade, Date dataFabricacao, String ingredientes, Boolean importado, String descricao){
        super(nome,preco,categoria,peso,fabricante, descricao);
        this.validade = validade;
        this.dataFabricacao = dataFabricacao;
        this.ingredientes = ingredientes;
        this.importado = importado;
    }                     

    public void setValidade(Date validade){
        this.validade = validade;
    }

    public void setTabelaNutricional(TabelaNutricional tabela){
        this.tabelaNutricional = tabela;
    }

    public void setFabricacao(Date dataFabricacao){
        this.dataFabricacao = dataFabricacao;
    }

    public void setIngredientes(String ingredientes){
        this.ingredientes = ingredientes;
    }

    public void setImportado(Boolean importado){
        this.importado = importado;
    }

    public Date getValidade(){
        return this.validade;
    }

    public Date getFabricacao(){
        return this.dataFabricacao;
    }

    public String getIngredientes(){
        return this.ingredientes;
    }

    public Boolean getImportado(){
        return this.importado;
    }

    public TabelaNutricional getTabelaNutricional(){
        return this.tabelaNutricional;
    }


}