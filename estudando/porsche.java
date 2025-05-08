package estudando;

public class porsche extends carro {

    //construtor auxiliar
    public porsche(double speed, String name, String typeFuel){
        super(speed, name, typeFuel);
        //com o super, estou chamando o construtor da classe pai
    }
    
    //método para override

    @Override public String ronco(){
        return ("\nVRAAAAAMM");
    }


}
