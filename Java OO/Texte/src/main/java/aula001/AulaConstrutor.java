package aula001;

public class AulaConstrutor {

    public static void main(String[] args) {

        Pessoa p = new Pessoa("Christian", "Toledo");
        System.out.println(p.nome + ' ' + p.sobreNome);

        p.setNome("Juliana");
        System.out.println(p.nome);

        Carro c1 = new Carro("WV", "Virtus", 2021);
        c1.setVariante("Incrivel");
        System.out.println(c1.info());
    }
}
