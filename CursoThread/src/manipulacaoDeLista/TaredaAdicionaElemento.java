package manipulacaoDeLista;

public class TaredaAdicionaElemento implements  Runnable{

    private Lista lista;
    private int numeroThread;

    public TaredaAdicionaElemento(Lista lista, int numeroThread){
        this.lista = lista;
        this.numeroThread = numeroThread;
    }

    @Override
    public void run() {

        for (int i =0 ; i <10; i++){
            lista.adicionaElementos(" Thread " + numeroThread + " - " + i);
        }
    }
}