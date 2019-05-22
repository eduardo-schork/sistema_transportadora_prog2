package models;

//é um tipo de pessoa. pessoa juridica, possui cnpj

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="pessoa_juridica")
public class PessoaJuridica extends Pessoa implements Serializable{
    
    public PessoaJuridica() {
    }
    
    @Column(name="nome_fan_pesjur")
    private String nomeFantasia;
    
    @Column(name="cnpj_pesjur")
    private long cnpj;
    
    @Column(name="ie_pesjur")
    private String ie;
    

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public long getCnpj() {
        return cnpj;
    }

    public void setCnpj(long cnpj) {
        this.cnpj = cnpj;
    }

    public String getIe() {
        return ie;
    }

    public void setIe(String ie) {
        this.ie = ie;
    }
    
}
