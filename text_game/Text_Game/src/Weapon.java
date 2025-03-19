public class Weapon {
    private String ID;
    private int Damage;
    private int durability;

    //Construtor
    public Weapon(String ID, int Damage, int durability){
        this.ID = ID.toUpperCase();
        //o uppercase parece que ajuda pra ficar mais fácil com strings
        this.Damage = Damage;
        this.durability = durability;
    }

    //getters
    public String getID(){
        return ID;
    }

    public int getDamage(){
        return Damage;
    }

    public int getdurability(){
        return durability;
    }

    //Setters

    public void SetID(String ID){
        this.ID = ID.toUpperCase();
    }

    public void SetDamage(int damage){
        this.Damage = damage;
    }

    public void SetDurability(int durability){
        this.durability = durability;
    }

    //métodos extras

    public void Golpe(){
        //causar dano no alvo, desgastar arma

        //parte para desgastar arma
        if(durability > 0){
            durability -= 5;
            //diminuir vida de inimigo
            System.out.println("Você causou "+ Damage +" de dano no alvo");
            System.out.println("Durabilidade atual da arma: "+durability);
        } else if (durability == 0){
            System.out.println("Arma quebrada, nenhum dano causado");
        }
    }

    
}