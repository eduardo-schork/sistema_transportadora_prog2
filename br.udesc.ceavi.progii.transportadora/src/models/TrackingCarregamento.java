package models;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="tracking_carregamento")
public class TrackingCarregamento {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="tra_car_id")
    private int id;
    
    @ManyToOne
    @JoinColumn(name = "car_id", referencedColumnName = "end_id")
    private Carregamento carregamento;
    
    @Column(name="tra_car_situacao")
    private int situacaoCodigo;
    
    @Temporal (TemporalType.DATE)
    @Column(name="tra_car_data")
    private Date data;

    public int getId() {
        return id;
    }

    public Carregamento getCarregamento() {
        return carregamento;
    }

    public void setCarregamento(Carregamento carregamento) {
        this.carregamento = carregamento;
    }

    public int getSituacaoCodigo() {
        return situacaoCodigo;
    }

    public void setSituacaoCodigo(int situacaoCodigo) {
        this.situacaoCodigo = situacaoCodigo;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
    
    
}
