package estudando;

abstract public class carro {
    protected double speed;
    protected String name;
    protected String typeFuel;
    //esse é pra saber se é hibrido, à gasolina, diesel, por aí vai.

//construtor
public carro(double speed, String name, String typeFuel){
    this.speed = speed;
    this.name = name;
    this.typeFuel = typeFuel;
}


//getters
public double getSpeed(){
    return speed;
}

public String getName(){
    return name;
}

public String getTypeFuel(){
    return typeFuel;
}

//setters

public void setSpeed(double speed){
    this.speed = speed;
}

public void setName(String name){
    this.name = name;
}

public void setTypeFuel(String typeFuel){
    this.typeFuel = typeFuel;
}

//método de teste

public String ronco(){
    return ("\nvruuum");
}

}
