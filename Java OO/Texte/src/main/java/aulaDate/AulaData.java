package aulaDate;

import java.time.LocalDate;

public class AulaData {
    public static void main(String[] args) {

        // Link de Docs ( https://docs.oracle.com/javase/8/docs/api/java/time/LocalDate.html)

       // Instanciando o LocalDate não é necessario o "new"
        LocalDate hoje = LocalDate.now();

        System.out.println(hoje);   // Exemplo de esperado -> 2021-07-20 (AAAA-MM-DD)

        //Manipulação de datas

        LocalDate ontem = hoje.minusDays(1); // Retira um dia do objeto hoje
        System.out.println(ontem);


    }
}
