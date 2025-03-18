import java.util.Scanner; //importei a classe Scanner para dar "scanf" no teclado

public class First_Game {
    public static void main(String[] args) throws Exception {
        System.out.println("Seja bem vindo ao meu projeto de text rpg!");

        System.out.println("Qual o seu nome?\n");

        //escanear teclado e criar objeto player com esse nome

        Scanner scanner = new Scanner(System.in);
        //criamos o objeto scanner para ler a entrada do teclado
        String nome = scanner.next();
        //escaneamos a string que view (sem pular espaço) e guardamos na variável string nome

        
        Player p1 = new Player(nome,15,"punhos");

        System.out.println("Olá "+ nome +"!\nÉ um prazer te conhecer!\n");
        System.out.println("Stats: "+p1.gethp()+ " HP\n" + "arma atual: " + p1.getarma());
        
    }
}
