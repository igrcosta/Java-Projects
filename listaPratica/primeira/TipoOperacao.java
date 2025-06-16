package listaPratica.primeira;

public enum TipoOperacao {
    ENTRADA("IN", "Entrada no estacionamento"),
    SAIDA("OUT", "Saída no estacionamento");

    private String codigo;
    private String descricao;

    //construtor
    TipoOperacao (String codigo, String descricao){
        this.codigo = codigo;
        this.descricao = descricao;
    }

    //getters e setters

    public String getCodigo(){
        return codigo;
    }

    public String getDescricao(){
        return descricao;
    }
}
