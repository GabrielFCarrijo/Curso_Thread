package banheiro;

public class Banheiro {

    private boolean banheiroSujo = true;

    public void fazNumero1() {

        String nome = Thread.currentThread().getName();
        System.out.println(nome + " Batendo na porta");

        synchronized (this) {
            System.out.println("Entro");

            if (banheiroSujo) {
                esperaLaFora(nome);
            }

            System.out.println(nome + " Fez pips");
            System.out.println("Saiu");
        }
    }

    private void esperaLaFora(String nome) {
        System.out.println(nome + "eca, banheiro sujo");

        try {
            this.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void fazNumero2() {

        String nome = Thread.currentThread().getName();
        System.out.println(nome + " Batendo na porta");

        synchronized (this) {
            System.out.println("Entro");

            if (banheiroSujo){
                esperaLaFora(nome);
            }

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
