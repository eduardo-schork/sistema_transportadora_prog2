package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="volume")
public class Volume {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="pk_volume")
    private int id;
    
    @Column(name="peso_liquido_vol")
    private float pesoLiquido;
    
    @Column(name="peso_bruto_vol")
    private float pesoBruto;
    
    @Column(name="cubagem_vol")
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
