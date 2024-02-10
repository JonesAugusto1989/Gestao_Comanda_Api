package br.edu.infnet.gestao_comanda.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@AllArgsConstructor
public class Cliente {
	@Getter
	@Setter
	private String nome;
}
