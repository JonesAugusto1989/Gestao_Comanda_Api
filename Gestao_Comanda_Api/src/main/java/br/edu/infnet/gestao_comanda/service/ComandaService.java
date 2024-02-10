package br.edu.infnet.gestao_comanda.service;

import java.util.List;
import java.util.Optional;

import br.edu.infnet.gestao_comanda.DAO.ComandaDAO;
import br.edu.infnet.gestao_comanda.exceptions.ComandaException;
import br.edu.infnet.gestao_comanda.model.Comanda;

public class ComandaService {

	private ComandaDAO comandaDao;
	
	
	
	public ComandaService(ComandaDAO comandaDao) {
		this.comandaDao = comandaDao;
	}
	
	public Comanda obterComanda() {
		
		long id = comandaDao.obterProximoId();
		Comanda comanda = new Comanda(id);
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
	public Comanda fecharComanda(Comanda comanda) throws ComandaException{
		return comandaDao.fecharComanda(comanda);
	}
	
	public Comanda atualizarComanda(Comanda comanda) throws ComandaException {
		return comandaDao.atualizarComanda(comanda);
	}

}
