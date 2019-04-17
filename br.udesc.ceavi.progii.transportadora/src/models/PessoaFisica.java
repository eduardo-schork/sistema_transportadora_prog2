package models;
import java.sql.Date;

// é um tipo de pessoa, representa pessoa fisica, possui cpf
public class PessoaFisica extends Pessoa {
    private long cpf;
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
