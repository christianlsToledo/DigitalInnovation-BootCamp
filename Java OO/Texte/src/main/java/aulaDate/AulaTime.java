package aulaDate;

import java.time.LocalTime;

public class AulaTime {

    // Link de Docs ( https://docs.oracle.com/javase/8/docs/api/java/time/LocalTime.html)
    public static void main(String[] args) {

        // Exemplo de utilização de hora local

        LocalTime agora = LocalTime.now();
        System.out.println(agora);      // Resultado esperado EX: 19:42.872

        // Exemplo de manipulação de horas

        LocalTime futuro = agora.plusHours(1);
        System.out.println(futuro);     //Ex:   Agora  19:42.872
                                        //      Futuro 20:42.872
    }
}
