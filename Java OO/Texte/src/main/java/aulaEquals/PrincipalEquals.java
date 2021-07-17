package aulaEquals;

public class PrincipalEquals {
    public static void main(String[] args) {
        Carro c1 = new Carro("2000","Fiat", "Uno",2);
        Carro c2 = new Carro("2000","Fiat", "Uno",2);

        System.out.println(c1.equals(c2));
    }
}
