package Poo;

public class AreaCircTeste {
    static void main(String[] args) {

        AreaCirc a1 = new AreaCirc(10);
        a1.raio = 10;

        AreaCirc a2 = new AreaCirc(5);
        a2.raio = 100;

        System.out.println(a1.Area());

        System.out.println(a2.Area());
        System.out.println(AreaCirc.pi);
        System.out.println(Math.PI);
    }
}
