package br.edu.infnet.gestao_comanda.service;

import java.util.List;
import java.util.Optional;

import br.edu.infnet.gestao_comanda.DAO.ComandaDAO;
import br.edu.infnet.gestao_comanda.model.Comanda;

public class ComandaService {

	private ComandaDAO comandaDao;
	
	
	
	public ComandaService(ComandaDAO comandaDao) {
		this.comandaDao = comandaDao;
	}
	
	public Comanda obterComanda() {
		Comanda comanda = new Comanda();
		long id = comandaDao.obterProximoId();
		comanda.setId(id);	
		return comanda;
	}
	
	public Comanda salvarComanda(Comanda comanda) {
		return comandaDao.salvarComanda(comanda);
	}
	
	public Long obterNumeroProximaComanda() {
		return comandaDao.obterProximoId();
	}
	
	public Optional<List<Comanda>> listarComandas() {
		
		return comandaDao.listarComandas();
	}

}
