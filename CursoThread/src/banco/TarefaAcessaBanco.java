package banco;

public class TarefaAcessaBanco implements Runnable {

    private PoolDeConnexao pool;
    private GerenciadorDeTransacao tx;
    public TarefaAcessaBanco(PoolDeConnexao pool, GerenciadorDeTransacao tx) {
        this.pool = pool;
        this.tx = tx;
    }

    @Override
    public void run() {
        synchronized (tx){
            System.out.println("Começando a tx");
            tx.begin();

            synchronized (pool){
                System.out.println("Peguei a conexão");
                pool.getConnection();
            }
        }
    }
}
