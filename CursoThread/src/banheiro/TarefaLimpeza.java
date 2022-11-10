package banheiro;

public class TarefaLimpeza implements Runnable {

    private Banheiro banheiro;
    public TarefaLimpeza(Banheiro banheiro) {
        super();
        this.banheiro = banheiro;
    }

    @Override
    public void run() {
        banheiro.limpa();
    }
}
