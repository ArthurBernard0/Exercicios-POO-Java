public class Cliente {

    String nome;
    String cpf;


    Cliente(String nome, String cpf){
        this.cpf = cpf;
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Cpf: " + cpf;
    }
}
