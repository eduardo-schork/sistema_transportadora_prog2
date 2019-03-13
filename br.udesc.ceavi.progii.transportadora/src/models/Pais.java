package models;

public class Pais {

    private int id;
    private String nome;
    private String continete;

    public Pais(int id, String nome, String continete) {
        this.id = id;
        this.nome = nome;
        this.continete = continete;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getContinete() {
        return continete;
    }

    @Override
    public String toString() {
        return "Pais{" + "id=" + id + ", nome=" + nome + ", continete=" + continete + '}';
    }

}
