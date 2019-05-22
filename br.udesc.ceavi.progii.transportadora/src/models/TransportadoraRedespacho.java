package models;
import javax.persistence.*;

@Entity
@Table(name = "transportadora_redespacho")
public class TransportadoraRedespacho {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name ="tra_red_id")
    private int id;
    
    @OneToOne
    @JoinColumn(name = "pes_jur_id", referencedColumnName = "pes_id")
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
