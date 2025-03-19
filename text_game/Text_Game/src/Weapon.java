public class Weapon {
    private String ID;
    private int Damage;
    private int durability;
    private String Type;

    //Construtor
    public Weapon(String ID){
        this.ID = ID.toUpperCase();
        //o uppercase parece que ajuda pra ficar mais fácil com strings
        this.Damage = 0;
        this.durability = 0;
        this.Type = null;

        //lista de armas abaixo

        if (ID.equals("Marreta")){
            SetDamage(30);
            SetDurability(400);
            Set_Type("Heavy");
        }

        if(ID.equals("Espada_Genérica")){
            SetDamage(10);
            SetDurability(200);
            Set_Type("Medium");
        }
    
        if(ID.equals("Faca_Simples")){
            SetDamage(5);
            SetDurability(150);
            Set_Type("Light");
        }
    }

    //Getters
    public String getID(){
        return ID;
    }

    public int getDamage(){
        return Damage;
    }

    public int getdurability(){
        return durability;
    }

    public String getType(){
        return Type;
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

    public void Set_Type(String Type){
        this.Type = Type;
    }

    //métodos extras

    public void Golpe(){
        //verificar o tipo da arma, para poder balancear
        //armas pesadas, vão dar 1 golpe por rodada
        //armas médias vao dar 2 golpes por rodadas
        //armas leves vão dar 3 golpes por rodada

        if(Type.equals("Heavy")){
            //1 tapa
            //desgasta arma

            for(int i=1;i!=0;i--){
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
        } else if(Type.equals("Medium")){
            //2 tapas
            //desgasta arma em cada tapa
            
            for(int i=2;i!=0;i--){
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

        } else if(Type.equals("Light")){
            //3 tapas
            //desgasta arma em cada tapa

            for(int i=3;i!=0;i--){
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

        //causar dano no alvo, desgastar arma
    }
}