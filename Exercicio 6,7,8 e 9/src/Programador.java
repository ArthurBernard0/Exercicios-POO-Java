public class Programador extends Funcionario{

    Programador(String nome, double salario) {
        super(nome, salario);
    }

    public double calcularBonus(){
        return salario * 0.10;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Salario: " + salario;
    }
}
