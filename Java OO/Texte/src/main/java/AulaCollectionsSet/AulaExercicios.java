package AulaCollectionsSet;

import java.util.HashSet;
import java.util.Set;

public class AulaExercicios {
    public static void main(String[] args) {
        Set<Integer> exercicio = new HashSet<>();
        exercicio.add(3);
        exercicio.add(88);
        exercicio.add(20);
        exercicio.add(44);
        exercicio.add(3);

        for (Integer numero: exercicio){
            System.out.println("Numero: "+ numero);
        }

        exercicio.remove(3);
        System.out.println(exercicio);
        exercicio.add(23);
        System.out.println("Tamanho do set: "+ exercicio.size());
        System.out.println("Set esta vasio: "+ exercicio.isEmpty());
        System.out.println(exercicio);
    }
}
