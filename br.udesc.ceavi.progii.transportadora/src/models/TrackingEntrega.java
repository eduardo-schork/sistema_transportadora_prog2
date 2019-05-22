package models;

import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name = "tracking_entrega")
public class TrackingEntrega {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "pk_tracking_entrega")
    private int id;
    
    @OneToOne(cascade=CascadeType.ALL)
    private Entrega entrega;
    
    @OneToOne(cascade=CascadeType.ALL)
    private Usuario usuario;
    
    @Enumerated(EnumType.STRING)
    private SituacaoEntrega situacaoCodigo;
    
    @Temporal(TemporalType.DATE) 
    private Date data;
    

    public int getId() {
        return id;
    }

    public Entrega getEntrega() {
        return entrega;
    }

    public void setEntrega(Entrega entrega) {
        this.entrega = entrega;
    }

    public SituacaoEntrega getSituacaoCodigo() {
        return situacaoCodigo;
    }

    public void setSituacaoCodigo(SituacaoEntrega situacaoCodigo) {
        this.situacaoCodigo = situacaoCodigo;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    
}
