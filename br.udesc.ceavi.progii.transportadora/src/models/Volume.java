package models;
public class Volume {
    private int id;
    private float pesoLiquido;
    private float pesoBruto;
    private double cubagem;

    public int getId() {
        return id;
    }

    public float getPesoLiquido() {
        return pesoLiquido;
    }

    public void setPesoLiquido(float pesoLiquido) {
        this.pesoLiquido = pesoLiquido;
    }

    public float getPesoBruto() {
        return pesoBruto;
    }

    public void setPesoBruto(float pesoBruto) {
        this.pesoBruto = pesoBruto;
    }

    public double getCubagem() {
        return cubagem;
    }

    public void setCubagem(double cubagem) {
        this.cubagem = cubagem;
    }
    
    
    
}
