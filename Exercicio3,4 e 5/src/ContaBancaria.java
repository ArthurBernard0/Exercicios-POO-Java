public class ContaBancaria{

    private float numero;
    private double saldo;
    public Cliente cliente;
    double saldoInicial = saldo;

    ContaBancaria(float numero,double saldo){
        this.numero = numero;
        this.saldo = saldo;
        this.saldoInicial = saldo;

    }
    public void depositar(double valor){

    }

    public void sacar(double valor){

    }

    public double getSaldo(){
        return saldo;

    }

    public float getNumero(){
        return numero;
    }

    public void setNumero(){
        this.numero = numero;
    }

    public void setSaldo(){
        this.saldo = saldo;
    }


}
