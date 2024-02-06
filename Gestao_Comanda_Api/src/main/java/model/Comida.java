package model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;


@Data@AllArgsConstructor@Builder
public class Comida extends Produto{
   private float peso;
   private boolean vegano;
   private String ingredientes;
}