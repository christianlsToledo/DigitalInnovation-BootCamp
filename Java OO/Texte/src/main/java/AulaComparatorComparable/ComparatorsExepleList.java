package AulaComparatorComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorsExepleList {
    public static void main(String[] args) {
        //Lista de testes
        List<Estudante> estudantes = new ArrayList<>();
        estudantes.add(new Estudante("Pedro",19));
        estudantes.add(new Estudante("Carlos", 23));
        estudantes.add(new Estudante("Mariana", 21));
        estudantes.add(new Estudante("João", 18));
        estudantes.add(new Estudante("Thiago", 20));
        estudantes.add(new Estudante("George", 22));
        estudantes.add(new Estudante("Larissa", 21));

        //   ---- Testes Comparable  ----

        System.out.println("--- Ordem de inserção ---");
        System.out.println(estudantes.toString());

        //Função Lambida - oredenação natural
        // Estudantes recebe dois objetos e os compara atravez do getIdade de cada
        estudantes.sort((first,second) -> first.getIdade() - second.getIdade());

        System.out.println("--- Ordem natural dos numeros pela idade ---"  );
        System.out.println(estudantes);

        // Para a ordem inversa basta inverter a expreção
        estudantes.sort((first,second) -> second.getIdade() - first.getIdade());
        System.out.println("--- Ordem inversa comparativo (idade) ---");
        System.out.println(estudantes);

        // ---- Testes Comparator ----

        //Utiliza a mesma logica da função Lambda em tempo de execução

        estudantes.sort(Comparator.comparingInt(Estudante::getIdade));
        System.out.println("-- Ordem natural dos numeros Comparator pela idade ---");
        System.out.println(estudantes);

        estudantes.sort(Comparator.comparingInt(Estudante::getIdade).reversed());
        System.out.println(" --- Ordem reversa Comparator.reversed");
        System.out.println(estudantes);

        Collections.sort(estudantes); // É obrigatório que Estudante esteja implementando a classe Comparable

        System.out.println(" ---- Ordem reversa interface Comparator");
        System.out.println(estudantes);
    }
}
