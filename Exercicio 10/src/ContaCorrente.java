public class ContaCorrente extends ContaBancaria{

    ContaBancaria conta;

    ContaCorrente(String numero, double saldo, Cliente cliente) {
        super(numero, saldo, cliente);
    }
    @Override
    public double saque() {
        return super.saque();


    }

    @Override
    public double renderJuros() {
        return 0;
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
