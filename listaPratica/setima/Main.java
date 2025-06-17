package listaPratica.setima;

public class Main {
    public static void main(String[] args) {
        calcularSalario calculadoraCLT = new CalcularSalarioCLT();
        FuncionarioService service = new FuncionarioService(calculadoraCLT);

        service.calcularSalario(5000.00);
    }
}
