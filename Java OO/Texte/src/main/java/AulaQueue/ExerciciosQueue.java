package AulaQueue;

import org.omg.PortableInterceptor.ServerRequestInfo;

import java.util.LinkedList;
import java.util.Queue;

public class ExerciciosQueue {
    public static void main(String[] args) {
        Queue <String> filaExercicio = new LinkedList();

        filaExercicio.add("Juliana");
        filaExercicio.add("Pedro");
        filaExercicio.add("Carlos");
        filaExercicio.add("Larissa");
        filaExercicio.add("João");

        for (String nome: filaExercicio){
            System.out.println("Nome: "+nome);
        }

        String primeiro = filaExercicio.peek();
        System.out.println("Primeiro da fila: "+primeiro);
        System.out.println(filaExercicio);
        String removePrimeiro = filaExercicio.poll();
        System.out.println("Atendendo: "+removePrimeiro);
        System.out.println(filaExercicio);
        filaExercicio.add("Daniel");
        System.out.println(filaExercicio);
        System.out.println("Clientes na fila = "+filaExercicio.size());
        System.out.println("A fila esta vasia = "+filaExercicio.isEmpty());
        System.out.println("Existe Carlos na lista = "+filaExercicio.contains("Carlos"));
    }
}
