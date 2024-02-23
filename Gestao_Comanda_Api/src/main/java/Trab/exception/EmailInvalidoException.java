package Trab.exception;

public class EmailInvalidoException extends Exception {
	private static final long serialVersionUID = 1L;
	
	public EmailInvalidoException() {
		super("Endereco de email incorreto");
	}

}
