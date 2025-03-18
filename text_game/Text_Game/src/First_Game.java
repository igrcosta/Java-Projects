import java.util.Scanner; //importei a classe Scanner para dar "scanf" no teclado

public class First_Game {
    public static void main(String[] args) throws Exception {
        System.out.println("Seja bem vindo ao meu projeto de text rpg!");

        System.out.println("Qual o seu nome?\n");

        //escanear teclado e criar objeto player com esse nome

        Scanner scanner = new Scanner(System.in);
        //criamos o objeto scanner para ler a entrada do teclado
        String nome = scanner.next();
        //escaneamos a string que vier (sem pular espaço) e guardamos na variável string nome

        String Zoio ="Zoio";

        if(!nome.equals(Zoio)) //usei .equals para comparar a String nome com a String Zoio,
        //e coloquei um ! antes para indicar quando não forem iguais na comparação
        {
            Player p1 = new Player(nome,15,"punhos");
            
            System.out.println("Olá "+ p1.getnome() +"!\nÉ um prazer te conhecer!\n");
            System.out.println("Stats: "+p1.gethp()+ " HP\n" + "arma atual: " + p1.getarma());
        }
        else {
            System.out.println("Fala AlEk o bgl é intelcore mermo garai");
            Player p1 = new Player(nome,30,"Marreta");
            System.out.println("Stats: "+p1.gethp()+ " HP\n" + "arma atual: " + p1.getarma());
        }
        
        scanner.close();
        //fechamos o scanner para evitar problemas de buffer e performance
    }
}
