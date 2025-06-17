package listaPratica.sexta;

import java.util.List;
import java.util.stream.*;
import java.util.Map;


public class main {
    public static void main(String[] args) throws Exception{
        List<Funcionario> funcionarios = List.of(
            new Funcionario("Carlos", "RH", 6000.00),
            new Funcionario("Igor", "TI", 2200.00),
            new Funcionario("Carol", "Financeiro", 4000.00),
            new Funcionario("Fiuza", "TI", 3000.00),
            new Funcionario("Flavio", "Financeiro", 5000.00),
            new Funcionario("Dinegro", "TI", 1850.00),
            new Funcionario("Jane", "RH", 5500.00)
        );

        //Filtrar salários acima de 5000 INÍCIO
        List<Funcionario> ricos = funcionarios.stream()
        //criamos uma stream da lista funcionario onde vai ter só o que desejarmos

        .filter(f -> f.getSalario() > 5000)
        //filtramos essa stream só como os salários acima de 5000

        .collect(Collectors.toList());
        //transformamos essa stream devolta numa lista 

        System.out.println("\n Funcionários com salários acimna de 5000:\n");
        ricos.forEach(f -> System.out.println(f.getNome() + " - " + f.getSalario()));
        //Filtrar salários acima de 5000 FIM

        //Agrupar funcionários por departamento INÍCIO
        Map<String, List<Funcionario>> porDepartamento = funcionarios.stream()
        .collect(Collectors.groupingBy(Funcionario::getDepartamento));

        System.out.println("\nFuncionarios por departamento:\n");

        porDepartamento.forEach((departamento, lista) -> {
            System.out.println("Departamento: " + departamento);
            lista.forEach(f -> System.out.println(" - " + f.getNome() + " (R$" + f.getSalario() + ")"));
        });
        //Agrupar funcionários por departamento FIM

        //média salarial INÍCIO
        double mediaSalarial = funcionarios.stream()
        .mapToDouble(Funcionario::getSalario)
        .average()
        .orElse(0);

        System.out.printf("\nA média salarial dessa empresa é de:\nR$ %.2f\n", mediaSalarial);
        //média salarial FIM

        //nomes em ordem alfabética INÍCIO
        System.out.println("Ordem Alfabética dos Funcionários: \n");

        funcionarios.stream()
        .map(Funcionario::getNome)
        .sorted()
        .forEach(System.out::println);
        //nomes em ordem alfabética FIM

        //Imprimir o total de funcionários por departamento INÍCIO
        Map<String, Long> contagemPorDepartamento = funcionarios.stream()
        .collect(Collectors.groupingBy(
            Funcionario::getDepartamento,
            Collectors.counting()
        ));

        System.out.println("\nTotal de funcionários por apartamento:\n");
        contagemPorDepartamento.forEach((departamento,total) -> {
            System.out.println("Departamento: " + departamento + " -> " + total + "funcionário(s)");
        });
        //Imprimir o total de funcionários por departamento FIM
    }
    
}
