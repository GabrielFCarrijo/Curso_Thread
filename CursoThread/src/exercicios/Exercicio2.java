package exercicios;

import org.w3c.dom.ls.LSOutput;

public class Exercicio2 {

    public static void main(String[] args) {

        new Thread(new Exercicio2Thread ()).start();
        new Thread(new Exercicio2Thread ()).start();
    }
}
