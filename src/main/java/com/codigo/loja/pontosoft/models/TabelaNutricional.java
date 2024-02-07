package com.codigo.loja.pontosoft.models;

import java.util.HashMap;
import java.util.Map;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity

public class TabelaNutricional {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //private Map<String, Integer> tabela = new HashMap<>();

    @OneToOne
    @JoinColumn(name = "produto_id")
    private Produto produto;

     //construtor para geração de uma tabela genérica.
     public TabelaNutricional(int valorEnergetico, int carboidratos, int acucares, int gordurasTotais, int gorduraSaturadas, int sodio){
      //  this.tabela.put("Valor energetico", valorEnergetico);
       // this.tabela.put("Carboidratos", carboidratos);
       // this.tabela.put("Açúcares", acucares);
       // this.tabela.put("Gorduras totais", gordurasTotais);
       // this.tabela.put("Gorduras saturadas", gorduraSaturadas);
       // this.tabela.put("Sódio", sodio);
     }

     public void addNutriente(String nutrienteNome, int nutrienteGramas){
      //  this.tabela.put(nutrienteNome, nutrienteGramas);
     }

     public void removeNutriente(String nutrienteNome){
     //   this.tabela.remove(nutrienteNome);
     }

     //public Map<String, Integer> getTabela(){
      //  return tabela;
     //}
     public void setTabela(Map<String, Integer> tabela ){
      //  this.tabela = tabela;
     }



    
}
