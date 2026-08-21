package EstruturasDeControle;

import java.util.Scanner;

public class MaiorNumero {
    static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int maior = 0;

        for(int i=0; i < 10; i++){
            System.out.println("Digite um valor");
            int num = entrada.nextInt();
            if(num > maior){
                maior = num;
            }
        }
        System.out.println("Maior valor: " + maior);
        entrada.close();
    }
}
