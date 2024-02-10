package br.edu.infnet.gestao_comanda.controller;

import java.util.List;
import java.util.Optional;

import br.edu.infnet.gestao_comanda.exceptions.ComandaException;
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
	
	public Comanda fecharComanda(Comanda comanda) {
		String mensagem="";
		Comanda c= null;
		try {
			c = comandaService.fecharComanda(comanda);
			mensagem = "Comanda fechada";
		}catch (ComandaException e) {
			mensagem = e.getMessage();
		}catch (Exception e) {
			mensagem = "Erro";
		}
		System.out.println(mensagem);
		return c;
	}

	public Comanda atualizarComanda(Comanda comanda) {
		String mensagem="";
		Comanda c= null;
		try {
			c = comandaService.atualizarComanda(comanda);
			mensagem = "Comanda atualizada";
		}catch (ComandaException e) {
			mensagem = e.getMessage();
		}catch (Exception e) {
			mensagem = "Erro";
		}
		System.out.println(mensagem);
		return c;
	}
	
	
}
