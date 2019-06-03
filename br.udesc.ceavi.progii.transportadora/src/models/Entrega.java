package models;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;
//classe entrega possui uma lista de TrackingEntrega, que representam um rastreamento das entregas
// uma lista de volumes, são os itens da entrega
@Entity
@Table(name = "entrega")
public class Entrega {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ent_id")
    private int id;
    
    @ManyToOne
    @JoinColumn(name = "car_id")
    private Carregamento carregamento;
    
    @OneToMany(cascade = CascadeType.ALL,orphanRemoval = true)
    private List<TrackingEntrega> movimentacoes;
    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ent_endereco_destino", referencedColumnName = "end_id")
    private Endereco enderecoDestino;
    
    @Column(name = "end_situacao")
    private int situacao;
    
    @OneToMany(cascade = CascadeType.ALL,orphanRemoval = true)
    @JoinColumn(name = "vol_id", referencedColumnName = "vol_id")
    private List<Volume> volumes;
    
    @ManyToOne
    @JoinColumn(name = "tra_red_id", nullable= false)
    private TransportadoraRedespacho redespacho;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<TrackingEntrega> getMovimentacoes() {
        return movimentacoes;
    }

    public void setMovimentacoes(List<TrackingEntrega> movimentacoes) {
        this.movimentacoes = movimentacoes;
    }

    public Endereco getEnderecoDestino() {
        return enderecoDestino;
    }

    public void setEnderecoDestino(Endereco enderecoDestino) {
        this.enderecoDestino = enderecoDestino;
    }

    public int getSituacao() {
        return situacao;
    }

    public void setSituacao(int situacao) {
        this.situacao = situacao;
    }

    public Carregamento getCarregamento() {
        return carregamento;
    }

    public TransportadoraRedespacho getRedespacho() {
        return redespacho;
    }

    public void setRedespacho(TransportadoraRedespacho redespacho) {
        this.redespacho = redespacho;
    }

    
}
