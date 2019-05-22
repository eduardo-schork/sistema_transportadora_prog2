package models;

import java.sql.Date;
import javax.persistence.*;

@Entity
@Table(name = "tracking_entrega")
public class TrackingEntrega {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "pk_tracking_entrega")
    private int id;
    
    @OneToOne
    @JoinColumn(name = "fk_entrega", columnDefinition = "pk_entrea")
    private Entrega entrega;
    
    @OneToOne
    @JoinColumn(name = "fk_usuario", columnDefinition = "pk_usuario")
    private Usuario usuario;
    
    @Enumerated(EnumType.STRING)
    @Column(name = "situacao_codigo_ten")
    private int situacaoCodigo;

    @Temporal(TemporalType.DATE)
    @Column(name = "data_ten")
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

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    
}
