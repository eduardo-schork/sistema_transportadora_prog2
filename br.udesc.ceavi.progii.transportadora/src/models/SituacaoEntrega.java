package models;

public enum SituacaoEntrega {
    SOLICITADA_COLETA("Solicitada Entrega"),
    AGUARDANDO_CARREGAMENTO("Aguardando Carregamento"),
    EM_SEPARACAO("Em Separação"),
    ETIQUETAS_EMITIDAS("Etiquitas Emitidas"),
    TRANFERENCIA_ENTRE_FILIAIS("Transferência Entre Filiais"),
    EM_ROTA("Em Rota"),
    EXTRAVIADA("Extraviada"),
    SAIU_PARA_ENTREGA_AO_DESTINATARIO("Saiu Para Entrega Ao Destinatário"),
    ENTREGUE("Entregue"),
    DESTINADA_A_TRANSPORTADORA_REDESPACHO("Destinada A Transportadora Redespacho");

    private String situacao;

    private SituacaoEntrega(String nome) {
        this.situacao = nome;
    }

    @Override
    public String toString() {
        return situacao;
    }
}
