package Colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

    static void main(String[] args) {

        Queue<String> fila = new LinkedList<>();

        // Offer e Add -> adicionam elementos na fila
        // Diferença é o comportamento quando a fila esta cheia!
        fila.add("Ana");
        fila.offer("Bia");
        fila.add("Carlos");
        fila.offer("Daniel");
        fila.add("Rafaela");
        fila.offer("Gui");

        System.out.println(fila.peek());
        System.out.println(fila.peek());
        System.out.println(fila.element());
        System.out.println(fila.element());

        //Poll e Remove -> obter o próximo elemento
        //quando a fila está vazia!

        System.out.println(fila.poll());
        System.out.println(fila.remove());
        System.out.println(fila.poll());
        System.out.println(fila.remove());

        //fila.size();
        //fila.clear();
        //fila.isEmpty();
        //fila.contains(...);
    }
}
