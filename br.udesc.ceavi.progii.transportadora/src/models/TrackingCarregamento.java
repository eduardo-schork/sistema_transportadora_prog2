package models;

import java.sql.Date;

public class TrackingCarregamento {

    private int id;
    private Carregamento carregamento;
    private int situacaoCodigo;
    private Date data;

    public int getId() {
        return id;
    }

    public Carregamento getCarregamento() {
        return carregamento;
    }

    public void setCarregamento(Carregamento carregamento) {
        this.carregamento = carregamento;
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
    
    
}
