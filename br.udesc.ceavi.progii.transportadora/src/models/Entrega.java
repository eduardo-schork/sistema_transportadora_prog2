package models;

import java.util.ArrayList;
//classe entrega possui uma lista de TrackingEntrega, que representam um rastreamento das entregas
// uma lista de volumes, são os itens da entrega
public class Entrega {

    private int id;
    private ArrayList<TrackingEntrega> movimentacoes;
    private Endereco enderecoDestino;
    private int situacao;
    private ArrayList<Volume> volumes;
    private TransportadoraRedespacho redespacho;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<TrackingEntrega> getMovimentacoes() {
        return movimentacoes;
    }

    public void setMovimentacoes(ArrayList<TrackingEntrega> movimentacoes) {
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

    public ArrayList<Volume> getVolumes() {
        return volumes;
    }

    public void setVolumes(ArrayList<Volume> volumes) {
        this.volumes = volumes;
    }

    public TransportadoraRedespacho getRedespacho() {
        return redespacho;
    }

    public void setRedespacho(TransportadoraRedespacho redespacho) {
        this.redespacho = redespacho;
    }

    
}
