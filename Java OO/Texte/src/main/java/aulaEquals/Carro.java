package aulaEquals;

public class Carro extends Veiculo {
    private int nPortas;
    private String variante;


    public Carro(String ano, String marca, String modelo, int quantPortas) {
        super(ano, marca, modelo);
        this.nPortas = quantPortas;
        this.variante = "Sem Observações.";
    }
    public void setNPortas(int quant){
        this.nPortas = quant;
    }
    public int getnPortas(){
        return this.nPortas;
    }

    public void setVariante(String obs){
        this.variante = obs;
    }
    public String getVariante(){
        return this.variante;
    }

    public void info(){
        System.out.println("Ano: "+this.getAno());
        System.out.println("Marca: "+this.getMarca());
        System.out.println("Modelo: "+this.getModelo());
        System.out.println("Quant. Portas: "+getnPortas());
        System.out.println("Observações: "+getVariante());
    }


}
