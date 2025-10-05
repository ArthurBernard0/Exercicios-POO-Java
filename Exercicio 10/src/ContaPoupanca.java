public class ContaPoupanca extends ContaBancaria{

    ContaBancaria conta;

    ContaPoupanca(String numero, double saldo, Cliente cliente) {
        super(numero, saldo, cliente);
    }


    public double saquePoupanca() {
        System.out.println("Digite o valor do saque: ");
        saque = scanner.nextShort();
        double saldoFinal = saldo - saque;
        System.out.println("Seu saldo atual é de: "+ saldoFinal);
        return saque;



    }

    @Override
    public double renderJuros(){
        double somaJuros = saldo * 0.2;
        double saldoFinal = somaJuros + saldo;
        System.out.println("Seu saldo é de : "+ saldoFinal);
        return somaJuros;
    }

    @Override
    public double deposito() {
        return super.deposito();
    }

    @Override
    public String toString() {
        return "Numero: " + numero + ", Saldo: " + saldo;
    }
}
