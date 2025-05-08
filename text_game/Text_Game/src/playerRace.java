public class playerRace{
    //lista de atributos
    protected int hp;
    protected String race;

    //construtor
    public playerRace(int hp, String race){
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

    //método que vai dar cada skill baseado na raça que o player escolher
    public void raceSkills(){
        
    }

}
