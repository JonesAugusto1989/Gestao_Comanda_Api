package br.edu.infnet.gestao_comanda.controller;

import br.edu.infnet.gestao_comanda.model.Comanda;
import br.edu.infnet.gestao_comanda.service.ComandaService;

public class ComandaController {
	
	private ComandaService comandaService;
	
	public ComandaController(ComandaService comandaService) {
		this.comandaService = comandaService;
	}
	
	public Long abrir() {
		Long numeroComanda = comandaService.obterNumeroProximaComanda();
		return numeroComanda;
	}
	
	public void fechar(Comanda comanda) {
		 
	}

}
