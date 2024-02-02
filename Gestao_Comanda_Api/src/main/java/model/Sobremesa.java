package model;
import lombok.*;

@Data@AllArgsConstructor@NoArgsConstructor@Builder
public class Sobremesa {
	
	private String informacao;
	private boolean doce;
	private float quantidade;

}
