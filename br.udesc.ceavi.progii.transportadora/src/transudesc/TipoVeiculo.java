package transudesc;

public enum TipoVeiculo {
    CARRO("Carro"),
    CAMINHAO("Caminhão"),
    FURGAO("Furgão"),
    UTILITARIO("Utilitário");

    private String tipo;

    private TipoVeiculo(String nome) {
        this.tipo = nome;
    }

    @Override
    public String toString() {
        return tipo;
    }
}
