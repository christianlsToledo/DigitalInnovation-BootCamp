package AulaCollectionsSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/*  Java.Util.set tem como objetivo principal tratar de coleções focado em performace, assim tem como caracteristica
 * algumas limitações:  --> Por padrão não permitem ordenação, não permitem itens repetidos, não possui busca por item
 * ou atualização e não permite alteração na ordem dos itens.
 *                      --> Permite Adição, remoção, leitura e navegação somente.
 *
 */
public class AulaTreeSet {
    public static void main(String[] args) {
        /*
            Utilizado quando se faz necessário alterar a ordem atravéz do uso de comparators pois
            mantem a ordem e pode ser reordenado, (Estrutura de ARVORES ou Pilha pois o elemento do topo é o ultimo
            que foi adicionado)

            Prejuiso: Para cada alteração no TreeSet o algoritimo de ordenação é reesecutado prejudicando a performace
         */

        TreeSet<String> capitais = new TreeSet<>();

        //Adicionando capitais
        capitais.add("Porto Alegre");
        capitais.add("Florianopolis");
        capitais.add("Curitiba");
        capitais.add("São Paulo");
        capitais.add("Rio de Janeiro");
        capitais.add("Minas Gerais");

        System.out.println(capitais);

        //Retornar o primeira capital no topo da arvore ou seja a ultima que foi adicionado a pilha
        System.out.println("Primeira da pilha: "+capitais.first());

        //Retornar a ultima capital do final da arvore, ou seja a primeira que foi adicionada a pilha
        System.out.println("Ultima da pilha: "+capitais.last());

        // Recebe um parametro e retorna a primeira a baixo do parametro
        System.out.println("A baixo do parametro (Florianopolis): "+capitais.lower("Florianopolis"));

        // Recebe um parametro e retorna a primeira a cima do parametro
        System.out.println("A cima do parametro (Florianopolis)"+capitais.higher("Florianopolis"));

        System.out.println(capitais);

        // Retorna para o console a primeira capital do topo removendoa da pilha
        System.out.println("Exibindo e removendo : "+ capitais.pollFirst());

        // Retorna para o console a ultima capital do inicio da pilha removendoa da pilha
        System.out.println(capitais.pollLast());

        System.out.println(capitais);

        // Navegando com o Iterator
        Iterator<String> iterator = capitais.iterator();
        while (iterator.hasNext()){
            System.out.println("Nome com Iterator: "+iterator.next());
        }

        //navegando com o for
        for (String nome: capitais){
            System.out.println("Nome com for: "+ nome);
        }
    }
}
