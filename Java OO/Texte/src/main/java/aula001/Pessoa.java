package aula001;

public class Pessoa {
    String nome;
    String sobreNome;

    // Exemplo de construtores sem parametros podem se omitidos
    public Pessoa (){
        //Construtor Default
    }

    // Construtor com passagem de parametros, como foi informado
    // um outro construtor neste caso temos uma sobre carga de metodo

    public Pessoa (String nome, String sNome){
        this.nome = nome;
        this.sobreNome = sNome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }
}
