package banheiro;

public class Banheiro {

    public void fazNumero1() {

        String nome = Thread.currentThread().getName();
        System.out.println(nome + " Batendo na porta");

        synchronized (this) {
            System.out.println("Entro");
            System.out.println(nome + " Fez pips");
            System.out.println("Saiu");
        }
    }

    public void fazNumero2() {



        String nome = Thread.currentThread().getName();
        System.out.println(nome + " Batendo na porta");

        synchronized (this) {
            System.out.println("Entro");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(nome + " Fez submarino");
            System.out.println("Saiu");
        }
    }
}
