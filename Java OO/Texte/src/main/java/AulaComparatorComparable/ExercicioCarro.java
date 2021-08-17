package AulaComparatorComparable;

public class ExercicioCarro implements Comparable{
    private final String marca;
    private final String modelo;
    private final Integer fabricaçao;

    public ExercicioCarro(String marca, String modelo, Integer fabricaçao) {
        this.marca = marca;
        this.modelo = modelo;
        this.fabricaçao = fabricaçao;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public Integer getFabricaçao() {
        return fabricaçao;
    }

    public String toString(){
        return getMarca()+", "+getModelo()+", "+getFabricaçao();
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
