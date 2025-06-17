package listaPratica.sexta;

public class Funcionario {

    private String nome;
    private String departamento;
    private double salario;

    //construtor
    public Funcionario(String nome, String departamento, double salario){
        this.nome = nome;
        this.departamento = departamento;
        this.salario = salario;
    }

    //getters e setters

    public String getNome(){
        return nome;
    }

    public String getDepartamento(){
        return departamento;
    }

    public double getSalario(){
        return salario;
    }

    public void setNome(String nome){
        this.nome = nome.toUpperCase();
    }

    public void setDepartamento(String departamento){
        this.departamento = departamento.toUpperCase();
    }

    public void setSalario(double salario){
        this.salario = salario;
    }
}
