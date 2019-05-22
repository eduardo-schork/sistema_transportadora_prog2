package models;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="pk_usuario")
    private int id;
    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_pessoa", referencedColumnName = "pk_pessoa")
    private Pessoa pessoa;
    
    @Column(name="tipo_usu")
    private int tipo;
    
    @Column(name="login_usu")
    private String login;
    
    @Column(name="senha_usu")
    private String senha;

    public int getId() {
        return id;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
}
