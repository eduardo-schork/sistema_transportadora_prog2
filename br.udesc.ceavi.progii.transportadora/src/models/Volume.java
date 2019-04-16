/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author Lucas Levi Gonçalves
 */
public class Volume {
    private int id;
    private float pesoLiquido;
    private float pesoBruto;
    private double cubagem;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getPesoLiquido() {
        return pesoLiquido;
    }

    public void setPesoLiquido(float pesoLiquido) {
        this.pesoLiquido = pesoLiquido;
    }

    public float getPesoBruto() {
        return pesoBruto;
    }

    public void setPesoBruto(float pesoBruto) {
        this.pesoBruto = pesoBruto;
    }

    public double getCubagem() {
        return cubagem;
    }

    public void setCubagem(double cubagem) {
        this.cubagem = cubagem;
    }
    
    
    
}
