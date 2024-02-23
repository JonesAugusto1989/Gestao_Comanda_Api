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
public class Pedido {
	
	private Long id;
	private String observacao;
	private Comanda comanda;
	private List<Produto> produtos;

}
