package listaPratica.quinta;

import java.util.List;
import java.util.stream.*;
import java.util.Map;

public class main {
    public static void main(String[] args) throws Exception {
        List<Pessoa> pessoas = List.of(
            new Pessoa("Igor", 20, "Belo Horizonte"),
            new Pessoa("Julia", 17, "Contagem"),
            new Pessoa("Iago", 19, "Betim"),
            new Pessoa("Gabriela", 19, "Belo Horizonte"),
            new Pessoa("Isabela", 17, "Belo Horizonte")
        );

        //filtrar por pessoas maiores de 18 COMEÇO
        System.out.println("\nPessoas maiores de 18:\n");

        List<Pessoa> maiores = pessoas.stream()
        //transformamos a lista de pessoas em stream para poder filtrar

        .filter(p -> p.getIdade() > 18)
        //filtramos para aquelas pessoas na stream que o getIdade dá mais do que 18

        .collect(Collectors.toList());
        //agora que já filtramos o que gostaríamos, a gente pega isso e transforma devolta pra lista

        maiores.forEach(p -> System.out.println(p.getNome() + " - " + p.getIdade()));
        //imprimimos toda essa lista filtrada, por meio do foreach que passa por tudo na lista e depois para

        //filtrar por pessoas maiores de 18 FIM

        //agrupar por cidade COMEÇO
        System.out.println("\nAgrupando por cidade:\n");

        Map<String, List<Pessoa>> pessoasPorCidade = pessoas.stream()
        //Pegamos a lista de pessoas e mapeamos ela, de forma que a chave fique sendo String
        //para cidades, e o valor, as pessoas que estão naquela cidade

        .collect(Collectors.groupingBy(Pessoa::getCidade));
        //agrupamos as pessoas com base em suas cidades, seguindo a organização do mapa

        //agora, basta imprimir tudo isso:
        pessoasPorCidade.forEach((cidade, lista) -> {
            System.out.println("Cidade: " + cidade);
            lista.forEach(p -> System.out.println(" - " + p.getNome() + " ( " + p.getIdade() + " ) "));
        });
         //agrupar por cidade FIM

         //calcular média de idades COMEÇO
         System.out.println("A média das idades é de:\n");

         double mediaIdade = pessoas.stream()
         //pegamos a lista de pessoas, e vamos colocar os dados organizados em forma de stream
         //dentro do double mediaIdade

         .mapToInt(Pessoa::getIdade)
         //basicamente, estamos pegando a idade de cada pessoa e "mapeando pra int" para fazer a média

         .average()
         //calcula a média de idade

         .orElse(0);
         //se a lista estiver vazia, vai retornar 0 pra não dar erro

         System.out.printf("%.2f anos\n", mediaIdade);
         
         //calcular média de idades FIM

         //imprimir os nomes em ordem alfabética COMEÇO
         System.out.println("Ordem alfabética:\n");
         
         pessoas.stream()
         //transformando a lista em stream para podermos trabalhar com ela

         .map(Pessoa::getNome)
         //separamos cada nome de cada pessoa em forma de um mapeamento

         .sorted()
         //simplesmente organizamos a Stream 

         .forEach(System.out::println);
         //em cada pessoa da lista organizada, vamos imprimir, o que vai entregar a ordem alfabética

         //imprimir os nomes em ordem alfabética FIM
    }
}
