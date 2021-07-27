package AulaList;

import java.util.List;
import java.util.Vector;

public class AulaVector {
    public static void main(String[] args) {
        List<String> esportes = new Vector<>();

        // Adicionando elementos ao vetor
        esportes.add("Futebol");
        esportes.add("Basquetebol");
        esportes.add("Tênis de Mesa");
        esportes.add("HandBoll");
        for (String esporte: esportes){
            System.out.println("Esporte: "+ esporte);
        }

        // Altera o valor da posição 2
        esportes.set(2,"Ping Pong");
        System.out.println(esportes.get(2));

        // Remove Esporte da posição 2
        esportes.remove(2);
        for (String mantidos: esportes){ // Imprime os valores mantidos no array
            System.out.println("Mantidos: "+mantidos);
        }

        // Retorna o primeiro item do vetor
        System.out.println("Posição 0: "+esportes.get(0));

        // Remove Pelo nome do objeto
        esportes.remove("HandBoll");
        for (String continuados : esportes) {
            System.out.println("Continuados: "+ continuados);
        }
    }
}
