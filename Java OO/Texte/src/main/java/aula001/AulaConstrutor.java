package aula001;
    //Aula de construtores, Sobrecarga e Herança --  O. Objt
public class AulaConstrutor {

    public static void main(String[] args) {

        Pessoa p = new Pessoa("Christian", "Toledo");
        System.out.println(p.nome + ' ' + p.sobreNome);

        p.setNome("Juliana");
        System.out.println(p.nome);

        Carro c1 = new Carro("2021","VW","Virtus",4);
        c1.info();
        c1.setVariante("Carro incrivel!");
        c1.info();

        Moto m1 = new Moto("2001","Honda","CG125",125f,"Eletrica");
        m1.info();

        // Exemplos de equals
    }
}
