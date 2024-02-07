package com.codigo.loja.pontosoft.models;

import java.util.HashMap;
import java.util.Map;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class TabelaNutricional {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Getter
    @ElementCollection
    @CollectionTable(name = "tabela_map")
    @MapKeyColumn(name = "chave")
    @Column(name = "valor")
    private Map<String, Integer> tabela = new HashMap<>();

    @OneToOne
    private Produto produto;


     public TabelaNutricional(int valorEnergetico, int carboidratos, int acucares, int gordurasTotais, int gorduraSaturadas, int sodio){
        this.tabela.put("Valor energetico", valorEnergetico);
         this.tabela.put("Carboidratos", carboidratos);
        this.tabela.put("Açúcares", acucares);
       this.tabela.put("Gorduras totais", gordurasTotais);
        this.tabela.put("Gorduras saturadas", gorduraSaturadas);
        this.tabela.put("Sódio", sodio);
     }

     public void addNutriente(String nutrienteNome, int nutrienteGramas){
       this.tabela.put(nutrienteNome, nutrienteGramas);
     }

     public void removeNutriente(String nutrienteNome){
        this.tabela.remove(nutrienteNome);
     }

    public void setTabela(Map<String, Integer> tabela ){
        this.tabela = tabela;
     }



    
}
