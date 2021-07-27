package AulaList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AulaExercicio {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();

        // Tarefa 1
        if (nomes.isEmpty()){
            nomes.add("Juliana");
            nomes.add("Pedro");
            nomes.add("Carlos");
            nomes.add("Larissa");
            nomes.add("João");
        }
        //Tarefa 2
        if (!(nomes.isEmpty())){
            for (String nome: nomes){
                System.out.println("Indice "+nomes.indexOf(nome) +" - Nome cadastrado: "+nome);
            }
        }
        // Tarefa 3
        nomes.set(nomes.indexOf("Carlos"), "Roberto");
        System.out.println("Posição 2: "+nomes.get(2));

        // Tarefa 4
        System.out.println("Nome posição 1: "+ nomes.get(1));

        //Tarefa 5 - Removendo posição 4
        nomes.remove(4);
        // Tarefa 6 - Removendo nome João
        nomes.remove("João");
        for (String mantidos: nomes){
            System.out.println("Nome mantido: "+ mantidos);
        }

        //Tarefa 7 - Tamanho da lista
        System.out.println("Tamanho do array: "+nomes.size());

        //Tarefa 8
        System.out.println("Existe nome Juliano? "+nomes.contains("Juliano"));//Esperado false

        //Tarefa 9 - Cria nova lista
        List<String> novaLista = new ArrayList<>();
            novaLista.add("Ismael");
            novaLista.add("Rodrigo");
        System.out.println(novaLista);

        nomes.addAll(novaLista);    // Adiciona os itens de novaLista em Nomes
        for (String item: nomes){
            System.out.println("Nome: "+item);
        }

        //Tarefa 10 - Ordem alfabetica
        Collections.sort(nomes);
        for (String itens: nomes){
            System.out.println(itens);
        }

        //Tarefa 11 - Lista vazia
        System.out.println("Lista Vazia: "+ nomes.isEmpty());
    }
}
