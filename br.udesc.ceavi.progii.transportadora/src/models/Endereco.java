
package models;
// classe endereço representa uma localidade no planeta. utilizada como localização
// de tranportadora, destino de carregamento etc

import javax.persistence.*;

@Entity
@Table(name="endereco")
public class Endereco {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "pk_endereco")
    private int id;
    @Column(name = "numero_end")
    private int numero;
    @Column(name = "cep_end")
    private int cep;
    @Column(name = "rua_end")
    private String rua;
    @Column(name = "bairro_end")
    private String bairro;
    @Column(name = "cidade_end")
    private String cidade;
    @Column(name = "uf_end")
    private String uf;
    @Column(name = "pais_end")
    private String pais;

    public int getId() {
        return id;
    }


    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
    
    
}
