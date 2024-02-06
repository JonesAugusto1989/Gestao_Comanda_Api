package br.edu.infnet.gestao_comanda.service;

import java.util.List;

import br.edu.infnet.gestao_comanda.DAO.ComandaDAO;
import br.edu.infnet.gestao_comanda.model.Comanda;

public class ComandaService {

	private ComandaDAO comandaDao;
	
	
	public ComandaService(ComandaDAO comandaDao) {
		this.comandaDao = comandaDao;
	}
	
	public Long obterNumeroProximaComanda() {
		return comandaDao.obterProximoId();
	}

}
