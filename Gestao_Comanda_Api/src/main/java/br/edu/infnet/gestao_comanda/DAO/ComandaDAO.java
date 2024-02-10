package br.edu.infnet.gestao_comanda.DAO;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import br.edu.infnet.gestao_comanda.exceptions.ComandaException;
import br.edu.infnet.gestao_comanda.model.Comanda;

public class ComandaDAO {
	
	private static List<Comanda> comandas;
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
	public Comanda fecharComanda(Comanda comanda) throws ComandaException {
		if(comandas.contains(comanda)) {
			int posicao = comandas.indexOf(comanda);
			comandas.get(posicao).fechaComanda();
			return comandas.get(posicao);
		}
		
		throw new ComandaException("Objeto não encontrado");
		
		}
	
	public Comanda atualizarComanda(Comanda comanda) throws ComandaException{
		if(comandas.contains(comanda)) {
			int posicao = comandas.indexOf(comanda);
			comandas.set(posicao, comanda);
			return comandas.get(posicao);
		}
		
		throw new ComandaException("Objeto não encontrado");
	}
	
	}
	
	
	

