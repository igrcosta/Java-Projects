package listaPratica.primeira;

import java.util.List;
import java.util.ArrayList;
import java.time.LocalDateTime;

public class Estacionamento {
    //simular controle de entrada e saída de veículo

    private List<Operacao> historico = new ArrayList<>();
    public void registrarOperacao(String placa, TipoOperacao tipo) {
        Operacao op = new Operacao(placa, tipo);
        historico.add(op);
    }

    public void exibirHistorico(){
        System.out.println("\n--- Histórico de Operações ---");
        for (Operacao op : historico) {
            System.out.println(op.getResumo());
        }
    }
}
