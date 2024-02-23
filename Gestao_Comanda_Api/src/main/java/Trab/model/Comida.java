package Trab.model;

import java.util.List;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@EqualsAndHashCode
@ToString
@NoArgsConstructor
@Getter
@Setter
public class Comida extends Produto{
	
   private float peso;
   private boolean vegano;
   private String ingredientes;
   
}