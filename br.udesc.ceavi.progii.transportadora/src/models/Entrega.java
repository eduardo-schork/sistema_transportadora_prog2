package models;

import java.util.ArrayList;
import javax.persistence.*;
//classe entrega possui uma lista de TrackingEntrega, que representam um rastreamento das entregas
// uma lista de volumes, são os itens da entrega
@Entity
@Table(name = "entrega")
public class Entrega {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "pk_entrega")
    private int id;
    
//    @OneToMany(cascade = CascadeType.ALL,orphanRemoval = true)
//    private ArrayList<TrackingEntrega> movimentacoes;
    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "endereco_destino_ent", referencedColumnName = "pk_endereco")
    private Endereco enderecoDestino;
    
    @Column(name = "situacao_ent")
    private int situacao;
    
//    @OneToMany(cascade = CascadeType.ALL,orphanRemoval = true)
//    private ArrayList<Volume> volumes;
    
//    @ManyToMany(cascade = CascadeType.ALL)
//    private TransportadoraRedespacho redespacho;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

//    public ArrayList<TrackingEntrega> getMovimentacoes() {
//        return movimentacoes;
//    }
//
//    public void setMovimentacoes(ArrayList<TrackingEntrega> movimentacoes) {
//        this.movimentacoes = movimentacoes;
//    }

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

//    public ArrayList<Volume> getVolumes() {
//        return volumes;
//    }
//
//    public void setVolumes(ArrayList<Volume> volumes) {
//        this.volumes = volumes;
//    }

//    public TransportadoraRedespacho getRedespacho() {
//        return redespacho;
//    }
//
//    public void setRedespacho(TransportadoraRedespacho redespacho) {
//        this.redespacho = redespacho;
//    }

    
}
