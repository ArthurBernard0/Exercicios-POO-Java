public class Pessoa {

    String nome;
    int idade;

    Pessoa(String nome,int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public void Apresentar(){
        System.out.println("Olá, meu nome é "+nome+" e tenho "+idade+" anos");


    }

}


