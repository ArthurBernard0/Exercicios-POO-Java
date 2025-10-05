import java.util.Scanner;

public abstract class ContaBancaria {

    String numero;
    double saldo;
    Cliente cliente;
    Scanner scanner = new Scanner(System.in);
    double saque;
    double deposito;

    ContaBancaria(String numero, double saldo, Cliente cliente){
        this.numero = numero;
        this.saldo = saldo;
        this.cliente = cliente;

    }

    public double saque(){

        System.out.println("Digite o valor do saque: ");
        saque = scanner.nextShort();
        double juros =  saque * 0.05;
        double saldoFinal = saldo - (saque + juros);
        System.out.println("Seu saldo atual é de: "+ saldoFinal);
        return saque;
    }

    public abstract double renderJuros();

    public double deposito(){

        System.out.println("Digite o valor do deposito: ");
        deposito = scanner.nextShort();
        double saldoFinal = deposito + saldo;
        System.out.println("Seu saldo atual é de: "+ saldoFinal);
        return deposito;
    }

}

