package model;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Comida{
   private float peso;
   private boolean vegano;
   private String ingredientes;
}