package AulaExcecoes;
/*  Tratamentos de Excecoes :
 *  Try -> Bloco feliz, este é o bloco a ser executado no fluxo comum do programa
 *  Cath -> Bloco executado caso haja uma exeção na execução du fluxo do programa
 */
public class PrincipalExcecoes {
    public static void main(String[] args) {

     Calculadora c = new Calculadora();
        System.out.println(c.soma(2));
        System.out.println(c.divide(5));

    }
}
