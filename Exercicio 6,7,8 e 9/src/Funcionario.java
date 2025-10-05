public abstract class Funcionario {

    String nome;
    double salario;

    public Funcionario(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Salario: " + salario;
    }

    public abstract double calcularBonus ();


}

