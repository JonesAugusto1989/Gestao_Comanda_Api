package br.edu.infnet.gestao_comanda.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Comida extends Produto{
   private float peso;
   private boolean vegano;
   private String ingredientes;
   
   
   
}