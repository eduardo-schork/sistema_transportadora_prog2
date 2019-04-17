package models;
// representa os tipos de pessoa no sistema
public enum TipoPessoa {
    MOTORISTA("Motorista"),
    MECANICO("Mecânico"),
    CLIENTE("Cliente"),
    ADMINSTRADOR("Administrador");

    private String tipo;

    private TipoPessoa(String nome) {
        this.tipo = nome;
    }

    @Override
    public String toString() {
        return tipo;
    }
}
