package AulaCollectionsSet;

import java.util.Iterator;
import java.util.LinkedHashSet;

/*  Java.Util.set tem como objetivo principal tratar de coleções focado em performace, assim tem como caracteristica
 * algumas limitações:  --> Por padrão não permitem ordenação, não permitem itens repetidos, não possui busca por item
 * ou atualização e não permite alteração na ordem dos itens.
 *                      --> Permite Adição, remoção, leitura e navegação somente.
 *
 */
public class AulaLinkedHashSet {
    public static void main(String[] args) {
        /*
            Utilizado quando a ordem de inserção da coleção é importante, seu prejuiso é a iplementação mais lenta.
         */

        LinkedHashSet<Integer> sequencia = new LinkedHashSet<>();

        // Adicionando itens a sequencia
        sequencia.add(1);
        sequencia.add(2);
        sequencia.add(4);
        sequencia.add(8);
        sequencia.add(16);
        System.out.println(sequencia); // Sequencia é impressa na mesma oredem de inserção

        sequencia.remove(4);    // Remove o item 4
        System.out.println(sequencia);
        System.out.println("Quantidade de itens: "+ sequencia.size());

        //Navegar em todos os itens atraves do ITERATOR
        Iterator<Integer> iterator = sequencia.iterator();
        while (iterator.hasNext()){
            System.out.println("Iterator N° "+iterator.next());
        }
        for (Integer numero: sequencia){
            System.out.println("For N° "+ numero);
        }
        System.out.println("A lista esta vasia: "+ sequencia.isEmpty());
    }
}
