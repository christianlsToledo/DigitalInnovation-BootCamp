package aulaDate;

import java.time.LocalDateTime;

public class AulaDateTime {
    public static void main(String[] args) {

        // Link de Docs ( https://docs.oracle.com/javase/8/docs/api/java/time/LocalDateTime.html)

        LocalDateTime agora = LocalDateTime.now();
        System.out.println(agora); // Ex. Esperado 2021-07-20T19:50:26.523

        // Manipulando Local Date Time
        LocalDateTime futuro = agora.plusHours(1).plusDays(2).plusSeconds(12).plusMinutes(4);
        System.out.println(futuro);// Ex:   agora -> 2021-07-20T19:53:48.120
                                    //      futuro-> 2021-07-22T20:58:00.120
    }
}
