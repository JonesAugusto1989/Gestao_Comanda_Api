package model;
import lombok.*;

@Data@AllArgsConstructor@NoArgsConstructor@Builder
public class Sobremesa extends Produto{
	
	private String informacao;
	private boolean doce;
	private float quantidade;

}
