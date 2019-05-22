package models;
import javax.persistence.*;

@Entity
@Table(name = "transportadora_redespacho")
public class TransportadoraRedespacho {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name ="pk_transportadora_redespacho")
    private int id;
    
    @OneToOne
    @JoinColumn(name = "fk_pessoa_juridica", referencedColumnName = "pk_pessoa_juridica")
    private PessoaJuridica pessoaJuridica;

    public int getId() {
        return id;
    }

    public PessoaJuridica getPessoaJuridica() {
        return pessoaJuridica;
    }

    public void setPessoaJuridica(PessoaJuridica pessoaJuridica) {
        this.pessoaJuridica = pessoaJuridica;
    }
    
    
}
