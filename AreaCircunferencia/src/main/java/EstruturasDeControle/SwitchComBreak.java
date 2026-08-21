package EstruturasDeControle;

import java.util.Scanner;

public class SwitchComBreak {
    static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String conseito = "";

        System.out.println("Digite uma nota: ");
        int nota = entrada.nextInt();

        switch (nota){
            case 10: case 9:{
                conseito = "A";}
            case 8: case 7:{
                conseito = "B";}
                break;
            default:
                conseito = "Nao foi encontrado!";
        }

        System.out.println("Conseito " + conseito);
        entrada.close();
    }
}
