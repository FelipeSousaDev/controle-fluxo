package controleFluxo;
import java.util.Scanner;

	

	public class Contador {
	    public static void main(String[] args) {
	        Scanner terminal = new Scanner(System.in);

	        // Solicita o primeiro parâmetro
	        System.out.println("Digite o primeiro parâmetro");
	        int parametroUm = terminal.nextInt(); // Lê o primeiro inteiro

	        // Solicita o segundo parâmetro
	        System.out.println("Digite o segundo parâmetro");
	        int parametroDois = terminal.nextInt(); // Lê o segundo inteiro
	        
	        try {
	            // Chama o método que contém a lógica de contagem
	            contar(parametroUm, parametroDois);
	        } catch (ParametrosInvalidosException exception) {
	            // Caso a exceção seja lançada, imprime a mensagem de erro
	            System.out.println(exception.getMessage());
	        } finally {
	            terminal.close(); // Fechar o scanner após o uso
	        }
	    }

	    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
	        // Verifica se o primeiro parâmetro é maior que o segundo
	        if (parametroUm > parametroDois) {
	            // Lança a exceção personalizada caso o primeiro parâmetro seja maior
	            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
	        }

	        int contagem = parametroDois - parametroUm; // Calcula a quantidade de interações

	        // Realiza o loop para imprimir os números de 1 até o valor de contagem
	        for (int i = 1; i <= contagem; i++) {
	            System.out.println("Imprimindo o número " + i);
	        }
	    }
	}


