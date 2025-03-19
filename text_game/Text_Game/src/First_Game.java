import java.util.Scanner; //importei a classe Scanner para dar "scanf" no teclado

public class First_Game {
    public static void main(String[] args) throws Exception {
        System.out.println("Seja bem vindo ao meu projeto de text rpg!");

        System.out.println("Qual o seu nome?\n");

        //vamos escanear o teclado para escolher a string dentro nome da classe Player

        Scanner scanner = new Scanner(System.in);
        //criamos o objeto scanner para ler a entrada do teclado
        String nome = scanner.next();
        //escaneamos a string que vier (sem pular espaço) e guardamos na variável string nome

        String Zoio ="Zoio";

        if(!nome.equals(Zoio)) //usei .equals para comparar a String nome com a String Zoio,
        //e coloquei um ! antes para indicar quando não forem iguais na comparação
        {
            Player p1 = new Player(nome,15);
            
            System.out.println("Olá "+ p1.getnome() +"!\nÉ um prazer te conhecer!\n");
            Weapon arma_inicial = new Weapon("Faca_Simples");
            p1.Equipar_arma(arma_inicial);
            System.out.println("Stats: "+p1.gethp()+ " HP\n" + "arma atual: " + p1.getIDarma() + "\nSua arma causa: "+ p1.Get_Dano_Arma()+ " de Dano\nDurabilidade atual: "+ p1.Get_Durability());
        }
        else {
            System.out.println("Fala AlEk o bgl é intelcore mermo garai");
            Player p1 = new Player(nome,30);
            Weapon Marreta = new Weapon("Marreta");
            p1.Equipar_arma(Marreta);
            System.out.println("Stats: "+p1.gethp()+ " HP\n" + "arma atual: " + p1.getIDarma() + "\nSua arma causa: "+ p1.Get_Dano_Arma()+ " de Dano\nDurabilidade atual: "+ p1.Get_Durability());
        }

        scanner.close();
        //fechamos o scanner para evitar problemas de buffer e performance
    }
}
