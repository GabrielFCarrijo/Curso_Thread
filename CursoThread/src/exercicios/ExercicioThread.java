package exercicios;

// Crie uma classe que imprime no console uma String a partir de uma nova Thread! Chame a tarefa

public class ExercicioThread implements Runnable{

    @Override
    public void run() {
        System.out.println("Minha primeira thread");
    }

    public static void main(String[] args) {
        ExercicioThread exercicioThread = new ExercicioThread();

        Thread thread = new Thread(exercicioThread);

        thread.start();
    }
}


