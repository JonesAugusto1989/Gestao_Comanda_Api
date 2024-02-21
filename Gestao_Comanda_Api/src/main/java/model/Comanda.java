package model;

import java.util.Date;
import java.util.List;

public class Comanda {
	
	private Long id;
	private Cliente cliente;
	private int numeroMesa;
	private Date dataHoraAbertura;
	private Date dataHoraFechamento;
	List<Pedido> pedidos;

}
