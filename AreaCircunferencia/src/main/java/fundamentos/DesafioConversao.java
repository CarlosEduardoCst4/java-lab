package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
    static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o Primeiro Salario: ");
        String valor1 = entrada.next().replace(",", ".");

        System.out.println("Informe o Segundo Salario: ");
        String valor2 = entrada.next().replace(",", ".");

        System.out.println("Informe o Terceiro Salario: ");
        String valor3 = entrada.next().replace(",", ".");

        double numero1 = Double.parseDouble(valor1);
        double numero2 = Double.parseDouble(valor2);
        double numero3 = Double.parseDouble(valor3);

        double media = (numero1 + numero2 + numero3) / 3;
        System.out.println("Valor da Media: " + media);
        entrada.close();
    }
}
