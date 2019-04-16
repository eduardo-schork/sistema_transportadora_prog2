package models;

import java.util.ArrayList;

public class Entrega {

    private int id;
    private ArrayList<TrackingEntrega> movimentacoes;
    private Endereco enderecoDestino;
    private int situacao;
    private ArrayList<Volume> volumes;
    private TransportadoraRedespacho redespacho;

}
