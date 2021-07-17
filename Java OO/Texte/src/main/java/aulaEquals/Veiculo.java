package aulaEquals;

public abstract class Veiculo {
    private String ano;
    private String marca;
    private String modelo;

    public Veiculo(String ano, String marca, String modelo){
        this.ano = ano;
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getAno(){
        return this.ano;
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
    public String getModelo() {
        return this.modelo;
    }
    public void info(){
        System.out.println("Ano: "+getAno());
        System.out.println("Marca: "+getMarca());
        System.out.println("Modelo: "+getModelo());
    }

    @Override  // Sobrescrevendo a logica do EQUALS
    public boolean equals(Object obj){
        if(obj == null){        // Verifica se um Objeto foi instanciado
            return false;
        }
        Veiculo comparavel;     //Cria uma instancia de Veiculo com nome comparavel

        if(obj instanceof Veiculo){     //Comparavel recebe o objeto a ser comarado
            comparavel = (Veiculo)obj;
        }else{
            return false;
        }
        if(comparavel.marca == this.marca && comparavel.modelo == this.modelo && comparavel.ano == this.ano){
            return true;
        }
        return false;
    }
}
