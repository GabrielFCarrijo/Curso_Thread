package manipulacaoDeLista;

import java.util.List;

public class TaredaAdicionaElemento implements  Runnable{

    private List<String> lista;
    private int numeroThread;

    public TaredaAdicionaElemento(List<String> lista, int numeroThread){
        this.lista = lista;
        this.numeroThread = numeroThread;
    }

    @Override
    public void run() {

        for (int i =0 ; i <10; i++){
            lista.add(" Thread " + numeroThread + " - " + i);
        }
    }
}
