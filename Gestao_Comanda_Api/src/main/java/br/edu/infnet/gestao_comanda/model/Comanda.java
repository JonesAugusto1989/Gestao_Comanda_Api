package br.edu.infnet.gestao_comanda.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@EqualsAndHashCode
@NoArgsConstructor
public class Comanda {
	
	private Long numero;
	
	public Comanda(Long numero) {
		super();
		this.numero = numero;
		this.pedidos = new ArrayList<Pedido>();
	}
	
	@Getter
	@Setter
	private Long id;
	
	@Getter
	@Setter
	private int numeroMesa;
	
	@Getter
	@Setter
	private Cliente cliente;
		
	private List<Pedido> pedidos;
		
	
	public void adicionaPedido(Pedido pedido) {
		this.pedidos.add(pedido);
	}
	
	public Optional<Pedido> obtemPedido(Pedido pedido) {
					
		if(this.pedidos.contains(pedido)) {
			int pos = this.pedidos.indexOf(pedido);
			Pedido resultadopesquisa = this.pedidos.get(pos);			
			
			return 	Optional.of(resultadopesquisa);
		}
		
		return Optional.empty();
			
	}

}
