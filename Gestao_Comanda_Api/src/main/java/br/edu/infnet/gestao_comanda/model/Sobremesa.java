package br.edu.infnet.gestao_comanda.model;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Sobremesa extends Produto{
	
	private String informacao;
	private boolean doce;
	private float quantidade;

}
