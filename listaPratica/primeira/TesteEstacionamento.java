package listaPratica.primeira;

public class TesteEstacionamento {
    public static void main(String[] args) throws Exception {
        Estacionamento estacionamento = new Estacionamento();

        estacionamento.registrarOperacao("ABC1234", TipoOperacao.ENTRADA);
        estacionamento.registrarOperacao("XYZ5678", TipoOperacao.ENTRADA);
        estacionamento.registrarOperacao("JHG4428", TipoOperacao.SAIDA);

        estacionamento.exibirHistorico();
    }
}
