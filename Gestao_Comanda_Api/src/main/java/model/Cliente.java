package model;

import java.util.List;

import model.vo.EmailVO;

public class Cliente {
	
	private String cpfCnpj; 
	private TipoCLienteEnum tipoCliente;
	private TipoSexoEnum sexo;
	private String nome;
	private EmailVO email;
	private List<Comanda> comandas;
	
	


}
