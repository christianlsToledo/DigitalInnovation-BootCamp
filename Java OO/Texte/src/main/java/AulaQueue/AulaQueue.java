package AulaQueue;

/*      Colections - Conceitos QUEUE - java.util.LinkedList
 *
 *      Conceito de fila, Primeiro que entra é o primeiro que sai (permite leitura e remoção do primeiro
 * item e a adição de itens ao final da fila).
 *      Não permite alteração de itens ou a reordenação.
 *
 *      add     -- Adiciona um elemento ao fim da fila
 *      poll    -- Retorna removendo o primeiro elemento da fila
 *      peek    -- Retorna o primeiro elemento da fila mas não o remove e caso a fila esteja vasia retorna NULL
 *      element -- Retorna o primeiro elemento da fila mas não o remove e caso a fila esteja vasia retorna uma Exeption
 *
 *      Navegação por elementos da Queue
 *
 */

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class AulaQueue {
    public static void main(String[] args) {
        Queue<String> filaBanco = new LinkedList<>();   // Declaração de uma queue
        filaBanco.add("Patricia");
        filaBanco.add("Roberto");
        filaBanco.add("Flávio");
        filaBanco.add("Pamela");
        filaBanco.add("Anderson");

        System.out.println(filaBanco);

        String clienteAtendido = filaBanco.poll(); // ClienteAtendido recebe primeiro cliente e remove da fila
        System.out.println(clienteAtendido);        // Imprime cliente a ser atendido
        System.out.println(filaBanco);              // Imprime fila agora com a próxima sequência.

        // filaBanco.clear();               // Se fila banco estiver vasio retorna NULL

        String primeiroFila = filaBanco.peek();// ClienteAtendido recebe primeiro cliente e NÃO remove da fila
        System.out.println(primeiroFila);       // Imprime o primeiro da fila
        System.out.println(filaBanco);          // Imprime fila banco com a mesma confg de antes

        // Situação em que a fila não pode ser vasia

      //  filaBanco.clear();                  // Se fila banco estiver vasio retorna - NoSuchElementExeption
        String primeiroClienteOuErro = filaBanco.element();
        System.out.println("--> "+primeiroClienteOuErro);

        for (String cliente: filaBanco){        //Navegação para cada
            System.out.println("Nome: "+cliente);
        }
        /*
            1- Chamada do metodo Iterator para uma String
            2 - nomeia o objeto como iteratorFila
            3 - Adiciona filaBanco ao objeto
         */
        Iterator<String> iteratorFila = filaBanco.iterator();
        while (iteratorFila.hasNext()){
            System.out.println("Cliente da vez: "+ iteratorFila.next());
        }

        System.out.println(filaBanco.size());   //Imprime a quantidade de elementos da fila
        System.out.println(filaBanco.isEmpty());//Imprime se a fila esta vasia
    }


}
