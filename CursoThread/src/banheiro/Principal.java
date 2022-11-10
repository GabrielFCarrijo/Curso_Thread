package banheiro;

public class Principal {

    public static void main(String[] args) {

        Banheiro banheiro = new Banheiro();
        Thread conviade1 = new Thread(new TarefaNumero1(banheiro), "Nico");
        Thread conviade2 = new Thread(new TarefaNumero2(banheiro), "Gabriel");
        Thread limpeza = new Thread(new TarefaLimpeza(banheiro), "Limpeza");
        limpeza.setDaemon(true);

        limpeza.start();
        conviade1.start();
        conviade2.start();
    }
}
