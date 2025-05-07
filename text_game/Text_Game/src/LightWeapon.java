public class LightWeapon extends Weapon {
    public LightWeapon (String Name){
        super(Name);
        this.Damage = 5;
        this.durability = 150;
    }

    @Override
    public void attack(){
        if(durability >0){
            durability-=2;
            System.out.println("\nBruh");
            System.out.println("\n Dano Causado: " + Damage + "\nDurabilidade restante: " + durability);
        }
        else {
            System.out.println("\nSua arma foi jogar no vasco!");
        }
    }
}
