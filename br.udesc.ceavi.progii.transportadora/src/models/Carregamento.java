package models;

import java.util.ArrayList;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="carregamento")
public class Carregamento {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="car_id")
    private int id;
    
//    @ManyToMany(cascade = CascadeType.ALL)
//    private ArrayList<Entrega> entregas;
    
    @ManyToOne
    @JoinColumn(name = "car_end_saida_id", referencedColumnName = "end_id")
    private Endereco enderecoSaida;
    
    @ManyToOne
    @JoinColumn(name = "car_end_chegada_id", referencedColumnName = "end_id")
    private Endereco enderecoChegada;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

//    public ArrayList<Entrega> getEntregas() {
//        return entregas;
//    }
//
//    public void setEntregas(ArrayList<Entrega> entregas) {
//        this.entregas = entregas;
//    }

    public Endereco getEnderecoSaida() {
        return enderecoSaida;
    }

    public void setEnderecoSaida(Endereco enderecoSaida) {
        this.enderecoSaida = enderecoSaida;
    }

    public Endereco getEnderecoChegada() {
        return enderecoChegada;
    }

    public void setEnderecoChegada(Endereco enderecoChegada) {
        this.enderecoChegada = enderecoChegada;
    }
    
    
    
}
