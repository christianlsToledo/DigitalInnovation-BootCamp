package AulaList;
/*
*   Aula de listas
*   Adicionar, remover e alterar objetos da lista atraves de seus nomes ou indices(add, get, set)
*   Organização pela Collections.sort
*   Limpeza com o metodo clear
*   Verificação de Vazia com o metodo isEmpty
*   Verificação de existencia de um objeto especifico atravez do metodo contains
*   Retorno do indice de um objeto com o metodo indexOf
*
*   Percorrendo Array com for it
*
*   Percorrendo array com while Iterator(hasNext)
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class AulaArrayList {
    public static void main(String[] args) {
        List<String> nomes =new ArrayList<>();  // Instacia um Array de nome "nomes"
        nomes.add("Carlos");
        nomes.add("Pedro");         // .add Adiciona itens a lista nomes
        nomes.add("Juliana");
        nomes.add("Anderson");
        nomes.add("Maria");
        nomes.add("João");

        System.out.println(nomes);  // Neste momento imprimimos a lista na ordem em que foi criada
        nomes.set(2,"Larissa");     // .set, Passamos o indice da posição a ser alterada e entre aspas o novo valor

        Collections.sort(nomes);    // <-- Aqui colocamos a lista em ordem alfabetica
        System.out.println(nomes);

        nomes.set(2, "Weslley");    // .set, Passamos o indice da posição a ser alterada e entre aspas o novo valor
        System.out.println(nomes);

        //O metodo REMOVE pode ser referenciado atravez do indice ou pelo nome do objeto
        nomes.remove(4);            // Remove um elemento atravez de seu (i) indice
        nomes.remove("Weslley");    //Remove um elemento pelo nome do (0 ) objeto
        System.out.println(nomes);   // Impressão da lisra após a remoção de dois elementos

        // Metodo get
        String nome = nomes.get(1); // Metodo retorna o Elemento do indice solicitado
        System.out.println("Nome retornado: "+nome);

       // String erro = nomes.get(4); // Indice superior ao tamanho do Array
        int tamanho = nomes.size();     // Variavel tamanho recebe o tamanho do Array
        System.out.println("Tamanho do Array = "+tamanho);

        //Metodo Contains, verifica a existencia de um objeto na lista
        System.out.println("Existe Larissa = "+nomes.contains("Larissa"));
        nomes.remove("Larissa");
        System.out.println("Existe Larissa = "+nomes.contains("Larissa"));

        // Metodo indexOf, Retorna o indice de um objeto
        // Caso o objeto não exista o metodo retorna -1
        System.out.println("Indice do objeto Carlos: "+nomes.indexOf("Carlos"));// Esperado = 1
        System.out.println("Indice do objeto Inexistente: "+nomes.indexOf("Samuel"));// Esperado = -1

        // Metodo isEmpty, Retorna se uma lista esta vazia
        System.out.println("Lista está vazia ? "+ nomes.isEmpty());//Retorno esperado  false

        //Metodo for it (ou para cada)
        //Utilizando o metodo for para percorrer cada posição do array imprindo o indice e o nome do objeto
        for (String nomeItem: nomes){
            System.out.println("Posição: "+nomes.indexOf(nomeItem)+ " Nome: "+ nomeItem);
        }

       // nomes.clear();      // Limpa lista
        //System.out.println("Lista está vazia ? "+ nomes.isEmpty());//Retorno esperado  true

        // Metodo Iterator, deve ser instanciado e sua biblioteca importada

        Iterator<String> iterator = nomes.iterator();
        while (iterator.hasNext()){
            System.out.println("Nomes com iterator = " + iterator.next());
        }
    }
}
