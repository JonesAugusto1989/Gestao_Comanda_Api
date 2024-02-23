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
public class Sobremesa extends Produto{
	
	private String informacao;
	private boolean doce;
	private float quantidade;

}
