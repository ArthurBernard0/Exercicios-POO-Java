import java.util.Scanner;
public class Main {

    public static void main (String[] args){

        Cliente cliente1 = new Cliente("Chico Science","12312312312");
        ContaCorrente contaCorrente = new ContaCorrente("123123",2000,cliente1);
        ContaPoupanca contaPoupanca = new ContaPoupanca("321321",3000,cliente1);

        //System.out.println(cliente1);
       // System.out.println(contaCorrente);
       // System.out.println(contaPoupanca);
        //contaCorrente.deposito();
       //contaPoupanca.deposito();
       // contaCorrente.saque();
       // contaPoupanca.saquePoupanca();
       // contaPoupanca.renderJuros();






    }
}
