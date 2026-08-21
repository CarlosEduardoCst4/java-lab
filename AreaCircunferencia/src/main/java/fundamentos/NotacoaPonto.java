package fundamentos;

import java.util.Locale;

public class NotacoaPonto {
    static void main(String[] args) {

        String s = "Bom Dia X";
        s = s.replace("X", "Senhora"); // troca os valores
        s = s.toUpperCase(); // deixa as letras todas em maiusculas
        s = s.concat("!!!"); // adiciona mais elementos

        System.out.println(s);

        String x = "Carro X".replace("X", "Y");
        System.out.println(x);

        String y = "Moto".toUpperCase();
        System.out.println(y);

        String z = x.concat(" Vermelha");
        System.out.println(z);
    }
}
