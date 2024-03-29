package model;

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
public class Bebida extends Produto {
	
	private Boolean gelada;
	private Float tamanho;
	private String marca;
	
}
