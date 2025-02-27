public class Teste {
    public static void main(String[] args){
        Marombeiro Balestrini = new Marombeiro(112.25, 10);
        Marombeiro Cariani = new Marombeiro(100.00, 20);

        Balestrini.AnaliseCorpo();
        Cariani.AnaliseCorpo();

        Cariani.Cardio();

        Anilha[] anilhas;
        anilhas = new Anilha[3];

        anilhas[0] = new Anilha(10);

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

    public void Cardio(){
        System.out.println("vamos fazer um cardio com o Cariani!");
        int n_gordura=porc_gordura-5;
        System.out.print("Cariani tinha " + porc_gordura + " e agora tem " + n_gordura + " de gordura em seu corpo");
        porc_gordura=n_gordura;
        System.out.println("\nConfirmando, Cariani tem agora "+porc_gordura+"de porcentagem de gordura");
    }
}

class Anilha {
    private int peso;

    public Anilha(int peso)
}

