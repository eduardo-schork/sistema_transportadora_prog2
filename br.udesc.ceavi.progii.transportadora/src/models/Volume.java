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
    @Column(name="vol_id")
    private int id;
    
    @Column(name="vol_peso_liquido")
    private float pesoLiquido;
    
    @Column(name="vol_peso_bruto")
    private float pesoBruto;
    
    @Column(name="vol_cubagem")
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
