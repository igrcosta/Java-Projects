public class Player {
    private String nome = "Cleitim";
    private int hp = 15;
    private String arma = "punhos";

    //construtor
    public Player(String nome, int hp, String arma){
        this.nome = nome.toUpperCase();
        this.hp = hp;
        this.arma = arma.toUpperCase();
        //o uppercase parece que ajuda pra ficar mais fácil com strings
    }

    //getters e setters
    public String getarma() {
        return this.arma;
    }

    public String getnome() {
        return this.nome;
    }

    public int gethp(){
        return this.hp;
    }

    //
}
