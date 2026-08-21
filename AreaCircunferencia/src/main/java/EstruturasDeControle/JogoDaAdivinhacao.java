package EstruturasDeControle;

import java.util.Scanner;

public class JogoDaAdivinhacao {
    static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int contador = 10;
        int valor = 67;

        while (contador > 0){
            System.out.println("Digite um numero: ");
            int num = entrada.nextInt();
            if(num >= 0){
                if(num == valor){
                    System.out.println("Acertou! - " + valor);
                } else {
                    System.out.println("Errou!");
                }
            }
            contador--;
            System.out.println("Você tem ainda - " + contador + " Jogadas.");
        }
        entrada.close();
    }
}
