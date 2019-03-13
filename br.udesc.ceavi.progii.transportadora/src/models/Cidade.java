package models;

public class Cidade {

    private int id;
    private String nome;
    private Estado estado;

    public Cidade(int id, String nome, Estado estado) {
        this.id = id;
        this.nome = nome;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Estado getEstado() {
        return estado;
    }

    @Override
    public String toString() {
        return "Cidade{" + "id=" + id + ", nome=" + nome + ", estado=" + estado + '}';
    }

}
