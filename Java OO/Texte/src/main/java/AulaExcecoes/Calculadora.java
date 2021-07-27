package AulaExcecoes;

import java.text.NumberFormat;

public class Calculadora {
    public int divide (int num){
        int div=0;
        try {
            div= num/2;
            System.out.print("Dividindo numero " + num + " por 2 = ");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return div;
    }
    public int soma (int num) {
        int soma;
        try {
            soma = num  + num ;
        }catch(Exception e){    // Tratamento da excecao
            System.out.println("Erro ao tentar somar");
            soma = 0;
        }
        finally {  //  Bloco executado independente do resultado do metodo
            System.out.println("Encerrando o programa");
        }
        return soma;
    }
}
