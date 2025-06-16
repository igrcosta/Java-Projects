package listaPratica.primeira;
import java.time.LocalDateTime;

public class Operacao {
    private String placa;
    private TipoOperacao tipo;
    private LocalDateTime dataHora;

    //construtor
    public Operacao(String placa, TipoOperacao tipo){
        this.placa = placa;
        this.tipo = tipo;
        this.dataHora = LocalDateTime.now(); //pegando o horário e data de agr
    }

    //getters e setters

    public String getDescricao(){
        return tipo.getDescricao(); //pegando do enum
    }

    public String getResumo(){
        return dataHora.toString() + " - Placa: " + placa + " - " + tipo.getDescricao();
    }
}

