package banco;

public class PrincipalBanco {

    public static void main(String[] args) {

        GerenciadorDeTransacao tx = new GerenciadorDeTransacao();
        PoolDeConnexao pool = new PoolDeConnexao();

        new Thread(new TarefaAcessaBanco(pool,tx)).start();
        new Thread(new TarefaAcessaBancoProcedimento(pool,tx)).start();

    }
}
