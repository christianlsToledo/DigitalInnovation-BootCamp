package AulaCollectionsSet;
/*  Java.Util.set tem como objetivo principal tratar de coleções focado em performace, assim tem como caracteristica
 * algumas limitações:  --> Por padrão não permitem ordenação, não permitem itens repetidos, não possui busca por item
 * ou atualização e não permite alteração na ordem dos itens.
 *                      --> Permite Adição, remoção, leitura e navegação somente.
 *
 */

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class AulaHashSet {
    public static void main(String[] args) {
        /*
            Não mantem a ordem de inserção, não permite itens repetidos porem é a implementação mais performatica.
         */

        Set<Double> notasAlunos = new HashSet<>(); // Instancia um set.HashSet notasAlunos

        //Adicionando notas
        notasAlunos.add(5.8);
        notasAlunos.add(9.3);
        notasAlunos.add(6.5);
        notasAlunos.add(10.0);
        notasAlunos.add(5.4);
        notasAlunos.add(7.3);
        notasAlunos.add(3.8);
        notasAlunos.add(4.0);

        System.out.println(notasAlunos);// Imprime lista de notas

        notasAlunos.remove(3.8);
        System.out.println(notasAlunos);

        System.out.println("Quantidado de itens: "+ notasAlunos.size());

        //Navegando por todos os itens com o metodo ITERATOR
        Iterator<Double> iterator = notasAlunos.iterator();
        while (iterator.hasNext()){
            System.out.println("While Nota: " +iterator.next());
        }
        for(Double nota: notasAlunos){
            System.out.println("For nota: "+ nota);
        }
        notasAlunos.clear();  // Esvasia a lista
        System.out.println("Lista esta vasia: "+ notasAlunos.isEmpty());

    }
}
