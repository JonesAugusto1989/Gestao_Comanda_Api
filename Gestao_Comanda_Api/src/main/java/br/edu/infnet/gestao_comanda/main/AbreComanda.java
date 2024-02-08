package br.edu.infnet.gestao_comanda.main;

import java.util.List;
import java.util.Optional;

import br.edu.infnet.gestao_comanda.DAO.ComandaDAO;
import br.edu.infnet.gestao_comanda.controller.ComandaController;
import br.edu.infnet.gestao_comanda.model.Comanda;
import br.edu.infnet.gestao_comanda.model.Pedido;
import br.edu.infnet.gestao_comanda.service.ComandaService;

public class AbreComanda {
	
	static ComandaDAO comandaDao = new ComandaDAO();
	static ComandaService comandaService = new ComandaService(comandaDao);
	static ComandaController comandaController = new ComandaController(comandaService);

	public static void main(String[] args) {
		
		abrirConta();
		
		Optional<List<Comanda>> extraiOptional = comandaService.listarComandas();
		
		//Testa o Optional
		if(extraiOptional.isPresent()) {
			List<Comanda> comandas = extraiOptional.get();
			System.out.println(comandas);
		}else {
			System.out.println("Sem elemento");
		}
		
		
	}
	
	
	public static void abrirConta() {
		Comanda teste;
		// ABIRND A COMANDA	
		teste = comandaController.abrir();
		
		Comanda aberta = comandaController.salvarComanda(teste);
		System.out.println(aberta);
			
	}
	
	public static void salvarConta(Comanda comanda) {
		
	 Comanda salvarComanda = comandaController.salvarComanda(comanda);
	
	 System.out.println(salvarComanda);
			
	}

}
