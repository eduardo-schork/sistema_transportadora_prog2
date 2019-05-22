package models;

//representa uma filial da empresa de transporte

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="filial")
public class Filial {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="fil_id")
    private int id;

    @Column(name="fil_nome")
    private String nome;

    @ManyToOne
    @JoinColumn (name = "end_id")
    private Endereco endereco;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    

}
