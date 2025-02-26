public class Teste {
    public static void main(String[] args){
        Marombeiro Balestrini = new Marombeiro(112.25, 10);
        Marombeiro Cariani = new Marombeiro(100.00, 20);

        Balestrini.AnaliseCorpo();
        Cariani.AnaliseCorpo();
}
}

class Marombeiro {
    private double peso;
    private int porc_gordura;

    public Marombeiro(double peso, int porc_gordura){
        this.peso = peso;
        this.porc_gordura = porc_gordura;
    }

    public void AnaliseCorpo(){
        System.out.println("ele está pesando " + peso);
        System.out.println("e tem " + porc_gordura + "% de gordura.");
        System.out.println("=============");
    }
}
