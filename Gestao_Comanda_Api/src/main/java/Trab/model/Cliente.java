package Trab.model;

import java.util.List;

import Trab.model.vo.EmailVO;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@EqualsAndHashCode
@ToString
@NoArgsConstructor
@Getter
@Setter
public class Cliente {
	
	private String cpfCnpj; 
	private TipoCLienteEnum tipoCliente;
	private TipoSexoEnum sexo;
	private String nome;
	private EmailVO email;
	private List<Comanda> comandas;
	
	


}
