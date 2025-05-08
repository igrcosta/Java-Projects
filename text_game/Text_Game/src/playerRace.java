public class playerClass{
    //lista de atributos
    protected int hp;
    protected String race;

    //construtor
    public playerClass(int hp, String race){
        this.hp = hp;
        this.race = race.toUpperCase();
    }

    //getters
    public int getHp(){
        return hp;
    }

    public String getRace(){
        return race;
    }

    //setters
    public void setHp(int hp){
        this.hp = hp;
    }

    public void setRace(String race){
        this.race = race.toUpperCase();
    }

    //métodos
}
