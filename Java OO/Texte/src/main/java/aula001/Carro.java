package aula001;

public class Carro {
    String marca;
    String modelo;
    Integer Ano;
    String variante;

    public Carro(String marca, String modelo, Integer ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.Ano = ano;
    }

    public String info(){
        return "Marca: "+this.getMarca()+", Modelo: "+this.getModelo()+", Ano: "+this.getAno()+", Obs: "+ this.getVariante();
    }

    public void setMarca(String marca){
        this.marca = marca;
    }
    public String getMarca(){
        return this.marca;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public String getModelo(){
        return this.modelo;
    }
    public void setAno(int ano){
        this.Ano = ano;
    }
    public Integer getAno(){
        return this.Ano;
    }
    public void setVariante(String variante){
        this.variante = variante;
    }
    public String getVariante(){
        return this.variante;
    }
}
