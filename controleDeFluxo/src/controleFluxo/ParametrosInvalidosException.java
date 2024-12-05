package controleFluxo;

public class ParametrosInvalidosException extends Exception {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	// Construtor que recebe a mensagem da exceção
    public ParametrosInvalidosException(String message) {
        super(message); // Passa a mensagem para a superclasse (Exception)
    }
}
