package EstruturasDeControle;

import java.util.Scanner;

public class DesafioWhile {
    static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int contador = 0;
        double nota = 0;
        double soma = 0;

        while (nota != -1){
            System.out.println("Digite uma nota: ");
            nota = entrada.nextDouble();
            if(nota >=0 && nota <=10) {
                soma += nota;
                contador++;
            } else if(nota !=-1){
                System.out.println("Nota Invalida!");
            }
        }

         double media = soma/contador;

         System.out.println("Media: " + media);

         entrada.close();
    }
}
