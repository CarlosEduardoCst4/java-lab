package EstruturasDeControle;

import javax.swing.*;

public class IfElse {
    static void main(String[] args) {

        String valor = JOptionPane.showInputDialog("Digite um numero: ");
        int numero = Integer.parseInt(valor);//converte em numero inteiro

        if(numero % 2 == 0){
            System.out.println("Numero Par!");
        } else {
            System.out.println("Numero Impar!");
        }
    }
}
