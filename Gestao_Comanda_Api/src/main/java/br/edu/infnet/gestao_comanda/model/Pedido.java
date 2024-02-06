package br.edu.infnet.gestao_comanda.model;


import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
@EqualsAndHashCode
public class Pedido {
		
	private Long numero;
	private String descricaoPedido;
	


}
