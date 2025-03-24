import java.util.Scanner;

// Classe de Exceção Personalizada
class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String mensagem) {
        super(mensagem);
    }
}

// Classe principal do programa
public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        
        System.out.println("Digite o primeiro parâmetro:");
        int parametroUm = terminal.nextInt();
        
        System.out.println("Digite o segundo parâmetro:");
        int parametroDois = terminal.nextInt();
        
        try {
            // Chamando o método contar
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException exception) {
            // Imprime a mensagem de erro caso a exceção seja lançada
            System.out.println("Erro: O segundo parâmetro deve ser maior que o primeiro.");
        }

        terminal.close();
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        // Verifica se o primeiro parâmetro é maior que o segundo
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro.");
        }

        int contagem = parametroDois - parametroUm; // Calcula quantas vezes o loop vai rodar

        // Laço for para imprimir os números
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}
