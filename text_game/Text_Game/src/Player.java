public class Player {
    //propriedades
    private String nome;
    private int hp;
    private String arma;

    //construtor
    public Player(String nome, int hp, String arma){
        this.nome = nome.toUpperCase();
        this.hp = hp;
        this.arma = arma.toUpperCase();
        //o uppercase parece que ajuda pra ficar mais fácil com strings
    }

    //getters
    public String getarma() {
        return this.arma;
    }

    public String getnome() {
        return this.nome;
    }

    public int gethp(){
        return this.hp;
    }

    //Setters
    public void Setarma(String arma){
        this.arma = arma.toUpperCase();
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
