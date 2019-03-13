package models;

public class Estado {

    private int id;
    private String uf;
    private String nome;
    private int codigoIbge;
    private Pais pais;

    public Estado(int id, String uf, String nome, int codigoIbge, Pais pais) {
        this.id = id;
        this.uf = uf;
        this.nome = nome;
        this.codigoIbge = codigoIbge;
        this.pais = pais;
    }

    public int getId() {
        return id;
    }

    public String getUf() {
        return uf;
    }

    public String getNome() {
        return nome;
    }

    public int getCodigoIbge() {
        return codigoIbge;
    }

    public Pais getPais() {
        return pais;
    }

    @Override
    public String toString() {
        return "Estado{" + "id=" + id + ", uf=" + uf + ", nome=" + nome + ", codigoIbge=" + codigoIbge + ", pais=" + pais + '}';
    }

}
