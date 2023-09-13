
public class MinhaThread extends Thread {
    private String nome;

    public MinhaThread(String nome) {
        this.nome = nome;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread" + nome + ": " + i);
            try {
                Thread.sleep(100); //sleep um delay de cem milisegundos (pode ser quebrado, no mínimo ela dorme cem )
            } catch (Exception e) {

            }

        }
        System.out.println("Thread" + nome + ":" + "concluída");
    }
}


