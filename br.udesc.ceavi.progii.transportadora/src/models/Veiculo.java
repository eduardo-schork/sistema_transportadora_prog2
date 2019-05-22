package models;
import java.sql.Date;
import javax.persistence.*;

@Entity
@Table(name = "veiculo")
public class Veiculo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "pk_veiculo")
    private int id;
    
    @Column(name = "placa_vei")
    private String placa;
    
    @Temporal(TemporalType.DATE)
    @Column(name = "data_aquisicao_vei")
    private Date dataAquisicao;
    
    @Column(name = "tipo_vei")
    private int tipo;
  
    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private int status;

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

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
    
    
}
