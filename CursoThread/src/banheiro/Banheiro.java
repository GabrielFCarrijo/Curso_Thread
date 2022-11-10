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

    public void limpa() {

        String nome = Thread.currentThread().getName();

        System.out.println(nome + " batendo na porta");

        synchronized (this) {

            System.out.println(nome + " entrando no banheiro");

            if (!this.banheiroSujo) {
                System.out.println(nome + ", não está sujo, vou sair");
                return;
            }

            System.out.println(nome + " limpando o banheiro");
            this.banheiroSujo = false;

            try {
                Thread.sleep(13000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


            System.out.println(nome + " saindo do banheiro");
        }
        this.notifyAll();
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
