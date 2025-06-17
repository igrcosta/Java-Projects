package listaPratica.setima;

public class CalcularSalarioCLT implements calcularSalario{
    public double calcular(double valorBase){
        return valorBase - 0.1 * valorBase;
    }
}
