package models;

import java.util.ArrayList;

public class Carregamento {
    private int id;
    private ArrayList<Entrega> entregas;
    private Endereco enderecoSaida;
    private Endereco enderecoChegada;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Entrega> getEntregas() {
        return entregas;
    }

    public void setEntregas(ArrayList<Entrega> entregas) {
        this.entregas = entregas;
    }

    public Endereco getEnderecoSaida() {
        return enderecoSaida;
    }

    public void setEnderecoSaida(Endereco enderecoSaida) {
        this.enderecoSaida = enderecoSaida;
    }

    public Endereco getEnderecoChegada() {
        return enderecoChegada;
    }

    public void setEnderecoChegada(Endereco enderecoChegada) {
        this.enderecoChegada = enderecoChegada;
    }
    
    
    
}
