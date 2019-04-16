package transudesc;

public enum StatusVeiculo {
    EM_MANUTENCAO("Em Manutenção"),
    OPERANDO("Operando"),
    DESATIVADO("Desativado"),
    AGUARDANDO_MANUTENCAO("Aguardando Manutenção"),
    PRONTO_PARA_OPERAR("Pronto Para Operar");

    private String status;
    
    private StatusVeiculo(String nome) {
        this.status = nome;
    }

    @Override
    public String toString() {
        return status;
    }
}
