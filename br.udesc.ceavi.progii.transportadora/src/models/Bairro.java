package models;

public class Bairro {

    private int id;
    private String nome;
    private Cidade cidade;

    public Bairro(int id, String nome, Cidade cidade) {
        this.id = id;
        this.nome = nome;
        this.cidade = cidade;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Cidade getCidade() {
        return cidade;
    }

    @Override
    public String toString() {
        return "Bairro{" + "id=" + id + ", nome=" + nome + ", cidade=" + cidade + '}';
    }

}
