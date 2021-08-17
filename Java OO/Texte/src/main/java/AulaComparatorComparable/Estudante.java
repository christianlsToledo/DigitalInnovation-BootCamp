package AulaComparatorComparable;

public class Estudante implements Comparable<Estudante> {
    private final String nome;
    private final Integer idade;

    public Estudante(String nome, Integer idade) {  // Construtor do objeto Estudante
        this.nome = nome;
        this.idade = idade;
    }
    public String getNome(){
        return this.nome;
    }

    public Integer getIdade(){
        return this.idade;
    }

    public String toString(){
        return this.getNome() + " , "+ this.getIdade();
    }

    @Override
    public int compareTo(Estudante o) {
        return this.getIdade() - o.getIdade();
    }
}
