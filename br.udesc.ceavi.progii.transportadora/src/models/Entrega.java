/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.ArrayList;

/**
 *
 * @author 09795569961
 */
public class Entrega {

    private int id;
    private ArrayList<TrackingEntrega> movimentacoes;
    private Endereco enderecoDestino;
    private int situacao;
    private ArrayList<Volume> volumes;
    private TransportadoraRedespacho redespacho;
    
}
