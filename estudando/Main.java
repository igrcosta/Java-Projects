package estudando;
import java.util.Scanner; //importei a classe Scanner para dar "scanf" no teclado

public class Main {
    public static void main(String[] args) throws Exception{
        System.out.println("\nBem vindo aos meus estudos para programar em java!\n");
        System.out.println("Aqui vou praticar herança, polimorfismo e por aí vai!\n");

        System.out.println("Qual carro você gosta mais?\n1:Porsche\n2:DodgeRAM\n3:celta Turbinado\n");
        Scanner scanner = new Scanner (System.in);

        
        String mensagem = scanner.next();
        //escaneamos a string que vier (sem pular espaço) e guardamos na variável string nome

        if(mensagem.equals(1)){
            porsche po1 = new porsche(100, "Porsche_911", "Hybrid");
            po1.ronco();
        } else if (mensagem.equals(2)){

        } else if (mensagem.equals(3)){

        }


        scanner.close();
        //fechamos o scanner para evitar problemas de buffer e performance
    }
}
