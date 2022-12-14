package manipulacaoDeLista;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class Principal {

    public static void main(String[] args) throws InterruptedException {

        List<String> lista = new Vector<String>();

        for (int i = 1; i < 10; i++){
            
            Thread thread = new Thread(new TaredaAdicionaElemento(lista, i));

            thread.start();
        }

        Thread.sleep(2000);


        for (int i = 1; i < lista.size(); i++){
            System.out.println(i + "-" +lista.get(i));
        }
    }
}
