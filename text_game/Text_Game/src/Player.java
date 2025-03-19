public class Player {
    //propriedades
    private String nome;
    private int hp;
    private Weapon arma;

    //construtor
    public Player(String nome, int hp) 
    // no parênteses eu n coloquei a classe de arma, já que vai começar com null
    {
        this.nome = nome.toUpperCase(); //o uppercase parece que ajuda pra ficar mais fácil com strings
        this.hp = hp;
        this.arma = null;
    }

    //getters
    public String getarma() {
        return arma.getID();
    }

    public String getnome() {
        return nome;
    }

    public int gethp(){
        return this.hp;
    }

    //Setters
    public void Equipar_arma(Weapon nova_arma){
        this.arma = nova_arma;
        System.out.println(arma.getID() +" equipada ao inventário de "+ nome);
    }
    //por enquanto, vou deixar as armas apenas como strings, mas quero no futuro, 
    //colocar as armas como sendo objetos que instanciamos no player, para assim,
    //guardar cada atributo de cada arma e ter uma enorme lista de armas

    public void SetHP(int hp){
        this.hp = hp;
    }

    public void Setnome(String nome){
        this.nome = nome.toUpperCase();
    }
}
