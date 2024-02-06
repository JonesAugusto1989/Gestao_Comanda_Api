package br.edu.infnet.gestao_comanda.main;

import br.edu.infnet.gestao_comanda.DAO.ComandaDAO;
import br.edu.infnet.gestao_comanda.controller.ComandaController;
import br.edu.infnet.gestao_comanda.model.Pedido;
import br.edu.infnet.gestao_comanda.service.ComandaService;

public class AbreComanda {

	public static void main(String[] args) {
		ComandaDAO comandaDao = new ComandaDAO();
		ComandaService comandaService = new ComandaService(comandaDao);
		ComandaController comandaController = new ComandaController(comandaService);
		
		Long numeroDisponivel = null;
		
		// ABIRND A COMANDA
		numeroDisponivel = comandaController.abrir();
		System.out.println(numeroDisponivel);
			
		
	}

}
