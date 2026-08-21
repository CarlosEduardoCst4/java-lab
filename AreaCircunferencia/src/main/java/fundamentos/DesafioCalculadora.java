package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
    static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("\nDigite o Primeiro valor: ");
        double valor1 = entrada.nextDouble();

        System.out.println("\nDigite o Segundo Valor: ");
        double valor2 = entrada.nextDouble();

        System.out.println("\nDigite a Operacao: ");
        String operacao = entrada.next();

        double resposta = "+".equals(operacao) ? valor1 + valor2 : 0;
        resposta = "-".equals(operacao) ? valor1 - valor2 : resposta;
        resposta = "*".equals(operacao) ? valor1 * valor2 : resposta;
        resposta = "/".equals(operacao) ? valor1 / valor2 : resposta;
        resposta = "%".equals(operacao) ? valor1 % valor2 : resposta;

        System.out.println("Valor da Operacao: " + resposta);


        entrada.close();
    }
}
