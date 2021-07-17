package aula001;

public class Moto extends Veiculo{
    private float cilindradas;
    private String partida;

    public Moto(String ano, String marca, String modelo, float cil, String partida) {
        super(ano, marca, modelo);
        this.cilindradas = cil;
        this.partida = partida;
    }
    public void setCilindradas(float cil){
        this.cilindradas = cil;
    }
    public float getCilindradas(){
        return this.cilindradas;
    }
    public void setPartida(String partida){
        this.partida = partida;
    }
    public String getPartida(){
        return this.partida;
    }
    public void info(){
        System.out.println("Ano: "+getAno());
        System.out.println("Marca: "+getMarca());
        System.out.println("Modelo: "+getModelo());
        System.out.println("Cilindradas: "+getCilindradas());
        System.out.printf("Partida: "+getPartida());

    }
}
