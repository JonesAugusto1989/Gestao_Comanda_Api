package br.edu.infnet.gestao_comanda.DAO;

import java.util.ArrayList;
import java.util.List;
import br.edu.infnet.gestao_comanda.model.Comanda;

public class ComandaDAO {
	
	private static List<Comanda> comandas;
	
	public ComandaDAO() {
		ComandaDAO.comandas = new ArrayList<>();
		
	}
	
	
	public Long obterProximoId() {
		
		return  Long.parseLong(String.valueOf(comandas.size()));
		
	}

}
