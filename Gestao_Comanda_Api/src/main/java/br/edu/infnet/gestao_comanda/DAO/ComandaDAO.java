package br.edu.infnet.gestao_comanda.DAO;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import br.edu.infnet.gestao_comanda.model.Comanda;

public class ComandaDAO {
	
	private static List comandas;
	private static Long id;
	
	public ComandaDAO() {
		ComandaDAO.comandas = new ArrayList<>();
		ComandaDAO.id = 0l;	
	}
	
	public Long obterProximoId() {
		
		return ComandaDAO.id++;	
		//return  Long.parseLong(String.valueOf(comandas.size()));
		
	}
	
	public Comanda salvarComanda(Comanda comanda) {
		comandas.add(comanda);
		return comanda;
	}
	
	public Optional<List<Comanda>> listarComandas() {
	
		if(comandas.isEmpty()){
			return Optional.empty();
		}
		
		return Optional.of(comandas);
	}
	
	
	
	
}
