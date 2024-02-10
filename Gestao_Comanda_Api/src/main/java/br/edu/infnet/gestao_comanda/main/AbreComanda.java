package br.edu.infnet.gestao_comanda.main;

import java.util.List;
import java.util.Optional;

import br.edu.infnet.gestao_comanda.DAO.ComandaDAO;
import br.edu.infnet.gestao_comanda.controller.ComandaController;
import br.edu.infnet.gestao_comanda.model.Cliente;
import br.edu.infnet.gestao_comanda.model.Comanda;
import br.edu.infnet.gestao_comanda.model.Pedido;
import br.edu.infnet.gestao_comanda.service.ComandaService;

public class AbreComanda {
	
	static ComandaDAO comandaDao = new ComandaDAO();
	static ComandaService comandaService = new ComandaService(comandaDao);
	static ComandaController comandaController = new ComandaController(comandaService);
	static Comanda teste;

	public static void main(String[] args) {
		abrirConta();
		salvarConta();
		listarConta();
		fecharConta();
		atualizarConta();
		abrirConta();
		salvarConta();
		listarConta();
		fecharConta();
		atualizarConta();
		abrirConta();
		salvarConta();
		listarConta();
		fecharConta();
		atualizarConta();
		listarConta();
	}
	
	
	public static void abrirConta() {
		// ABIRND A COMANDA	
		teste = comandaController.abrir();
		System.out.println(teste);
			
	}
	public static void listarConta() {
		
		Optional<List<Comanda>> extraiOptional = comandaController.listarComandas();
		
		//Testa o Optional
		if(extraiOptional.isPresent()) {
			List<Comanda> comandas = extraiOptional.get();
			System.out.println(comandas);
		}else {
			System.out.println("Sem elemento");
		}
				
		}
	
	
	public static void salvarConta() {
		Cliente cliente= new Cliente("Joao");
		teste.setCliente(cliente);
		teste.setNumeroMesa(10);
		
	 Comanda salvarComanda = comandaController.salvarComanda(teste);
	
	 System.out.println(salvarComanda);
			
	}
	
	public static void fecharConta() {
		
		 Comanda fecharComanda = comandaController.fecharComanda(teste);
		 System.out.println(fecharComanda);
		
		}
	public static void atualizarConta() {
		
		teste.setNumeroMesa(15);
		
		 Comanda atualizarComanda = comandaController.atualizarComanda(teste);
		 
		 System.out.println(atualizarComanda);
		
		}

}
