package buscaTextual;

public class Principal {

    public static void main(String[] args) {

            String nomeProcurado = "Jon";

            Thread threadAutores = new Thread(new TarefaBuscaTextual("buscaTextual/autores.txt",
                    nomeProcurado));

            Thread threadAssinaturas1 = new Thread(new TarefaBuscaTextual(
                    "buscaTextual/assinaturas1.txt", nomeProcurado));

            Thread threadAssinaturas2 = new Thread(new TarefaBuscaTextual(
                    "buscaTextual/assinaturas2.txt", nomeProcurado));

            threadAutores.start();
            threadAssinaturas1.start();
            threadAssinaturas2.start();
    }
}