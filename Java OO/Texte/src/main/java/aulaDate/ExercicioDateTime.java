package aulaDate;

import java.time.LocalDateTime;

public class ExercicioDateTime {
    public static void main(String[] args) {
        /*
        * Exercicio: Adicione 4Anos, 6Meses e 13Horas ao momento 15/05/2010 10:00:00
        * */

        LocalDateTime momento = LocalDateTime.of(2010,05,15,10,00,00);
        System.out.println("Momento = "+ momento);
        LocalDateTime alterado = momento.plusYears(4).plusMonths(6).plusHours(13);
        System.out.println("Alterado = "+alterado); // Teste OK
    }
}
