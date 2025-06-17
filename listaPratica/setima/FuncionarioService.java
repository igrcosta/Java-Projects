package listaPratica.setima;
import listaPratica.sexta.Funcionario;


public class FuncionarioService {
    private calcularSalario calculadora;

    public FuncionarioService(calcularSalario calculadora){
        this.calculadora = calculadora;
    }

    public void calcularSalario(double valorBase){
        double resultado = calculadora.calcular(valorBase);
        System.out.println("\nSalário: " + resultado);
    }
}
