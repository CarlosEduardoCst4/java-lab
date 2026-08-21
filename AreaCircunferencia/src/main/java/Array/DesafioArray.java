package Array;


import java.util.Scanner;

public class DesafioArray {

    static void main(String[] args) {

        Scanner entarda = new Scanner(System.in);

        System.out.printf("Digite a Quantidade de notas que deseja informar: ");
        int tamanho = entarda.nextInt();

        double[] notas = new double[tamanho];

        for(int i = 0; i < notas.length; i++){
            System.out.println("Digite a " + (i + 1) + " Nota: ");
            notas[i] = entarda.nextDouble();
        }

        double total = 0;
        for (double nota: notas){
            total += nota;
        }
        System.out.println("A média do aluno é: "+ (total/tamanho));
        // ou System.out.println("Media :" + (total / notas.length));

        entarda.close();
    }
}
