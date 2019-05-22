package models;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

// é um tipo de pessoa, representa pessoa fisica, possui cpf
@Entity
@Table(name="pessoa_fisica")
public class PessoaFisica extends Pessoa implements Serializable{

    public PessoaFisica() {
    }
    
    
    @Column(name="cpf_pesfis")
    private long cpf;
    
    @Temporal (TemporalType.DATE)
    private Date dataNascimento;

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}
