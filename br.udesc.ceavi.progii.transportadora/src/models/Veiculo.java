/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.sql.Date;

/**
 *
 * @author 09795569961
 */
public class Veiculo {
    
    private int id;
    
    private String placa;
    
    private Date dataAquisicao;
    
    /**
     * CARRO
     * CAMINHAO
     * FURGAO
     * UTILITARIO
     */
    private int tipo;
    
    /**
     * EM MANUTENCAO
     * OPERANDO
     * DESATIVADO
     * AGUARDANDO MANUTENCAO
     * PRONTO PARA OPERAR
     */
    private int status;
}
