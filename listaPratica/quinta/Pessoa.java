package listaPratica.quinta;

public class Pessoa {
    private String nome;
    private int idade;
    private String cidade;

    //construtor 

    public Pessoa(String nome, int idade, String cidade){
        this.nome = nome;
        this.idade = idade;
        this.cidade = cidade;
    }

    //getters e setters
    public String getNome(){
        return nome;
    }

    public int getIdade(){
        return idade;
    }

    public String getCidade(){
        return cidade;
    }

    public void Setnome(String nome){
        this.nome = nome.toUpperCase();
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public void setCidade(String cidade){
        this.cidade = cidade.toUpperCase();
    }
}
