public class Gerente extends Funcionario implements Autenticador{

    Autenticador autenticar;


    Gerente(String nome, double salario) {
        super(nome, salario);
    }

    public double calcularBonus(){
        return salario * 0.15;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Salario: " + salario;
    }


    
}
