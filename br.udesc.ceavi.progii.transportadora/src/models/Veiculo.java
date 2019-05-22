package models;
import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name = "veiculo")
public class Veiculo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "vei_id")
    private int id;
    
    @Column(name = "vei_placa")
    private String placa;
    
    @Temporal(TemporalType.DATE) 
    @Column(name="vei_data_aquisicao")
    private Date dataAquisicao;
    
    @Enumerated(EnumType.STRING)
    @Column(name = "vei_tipo")
    private TipoVeiculo tipo;
  
    @Enumerated(EnumType.STRING)
    private StatusVeiculo status;

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

    public TipoVeiculo getTipo() {
        return tipo;
    }

    public void setTipo(TipoVeiculo tipo) {
        this.tipo = tipo;
    }

    public StatusVeiculo getStatus() {
        return status;
    }

    public void setStatus(StatusVeiculo status) {
        this.status = status;
    }
    
    
}
