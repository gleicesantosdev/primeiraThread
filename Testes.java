public class Testes {
    public static void main (String[]args) {
        new
                MinhaThread("1").start();
        new
                MinhaThread("2").start();
    }
}

//threads são utilizadas para instalacoes simultaneas, ou seja, ela divide o tempo de execucao de cada thread

/*
start() = inicia a execucao (chamada unica)

yield() = faz com que a execucacao seja atual de maneira imediatamente suspensa, e outra thread seja escalada.

sleep() = suspende em milisegudos

wait() = suspende a thread ate que ela seja chamada pelo metodo de notifyall
* */