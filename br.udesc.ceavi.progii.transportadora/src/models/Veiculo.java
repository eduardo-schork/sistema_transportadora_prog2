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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Date getDataAquisicao() {
        return dataAquisicao;
    }

    public void setDataAquisicao(Date dataAquisicao) {
        this.dataAquisicao = dataAquisicao;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
    
    
}
