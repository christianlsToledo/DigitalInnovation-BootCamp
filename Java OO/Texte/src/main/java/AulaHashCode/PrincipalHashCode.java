package AulaHashCode;

public class PrincipalHashCode {
    public static void main(String[] args) {
        boolean verdade;
        Carro c1 = new Carro("2001","VW","Gol",2);
        Carro c2 = new Carro("200","VW","G",4);

        // Pesquisar Melhor

        System.out.println(c1.hashCode() == c2.hashCode());
    }
}
