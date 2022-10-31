package manipulacaoDeLista;

public class Principal {

    public static void main(String[] args) throws InterruptedException {

        Lista lista = new Lista();

        for (int i = 1; i < 10; i++){
            
            Thread thread = new Thread(new TaredaAdicionaElemento(lista, i));

            thread.start();
        }

        Thread.sleep(2000);


        for (int i = 1; i < lista.tamanho(); i++){
            System.out.println(i + "-" +lista.pegaElemento(i));
        }
    }
}