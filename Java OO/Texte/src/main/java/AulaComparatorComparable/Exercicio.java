package AulaComparatorComparable;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Exercicio {
    public static void main(String[] args) {
        List<ExercicioCarro> carroList = new ArrayList<>();

        // Nome Lista   Tipo do objeto da lista (Informações do construtor do objeto)
        carroList.add(new ExercicioCarro("VW","Fusca",1980));
        carroList.add(new ExercicioCarro("GM", "Corsa", 1990));
        carroList.add(new ExercicioCarro("Toyota", "Corolla", 2013));
        carroList.add(new ExercicioCarro("GM","Monsa", 1993 ));

        System.out.println(" ---- Ordem de inserção --- ");
        System.out.println(carroList);

            //Imlementação da interface Comparator
       // carroList.sort(Comparator.comparingInt(ExercicioCarro::getFabricaçao));
       // System.out.println(" ---- Ordem natural por ano de fabricação ----");
       // System.out.println(carroList);

        //Implementação da interface Comparable

        carroList.sort((first,second)-> first.getFabricaçao() - second.getFabricaçao());
        System.out.println(" ---- Ordenação função Lambda ----");
        System.out.println(carroList);

    }
}
