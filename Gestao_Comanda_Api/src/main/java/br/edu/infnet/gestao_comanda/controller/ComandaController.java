package br.edu.infnet.gestao_comanda.controller;

import java.util.List;
import java.util.Optional;

import br.edu.infnet.gestao_comanda.model.Comanda;
import br.edu.infnet.gestao_comanda.service.ComandaService;

public class ComandaController {
	
	private ComandaService comandaService;
	
	public ComandaController(ComandaService comandaService) {
		this.comandaService = comandaService;
	}
	
	public Comanda abrirComanda() {
		
		return comandaService.obterComanda();
	}
	
	public Comanda abrir() {
		Comanda comanda = comandaService.obterComanda();
		return comanda;
	}
	
	public Comanda salvarComanda(Comanda comanda) {
		return comandaService.salvarComanda(comanda);
	}
	
	public Optional<List<Comanda>> listarComandas(){
		
		
		return comandaService.listarComandas();
	}
	
	public void fechar(Comanda comanda) {
		
		 
	}

}
