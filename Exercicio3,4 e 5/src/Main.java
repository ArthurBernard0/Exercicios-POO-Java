import javax.xml.transform.Source;

public class Main {

    public static void  main (String[] args){

    Cliente cliente1 = new Cliente("Arthur", "71502273411");
    ContaBancaria conta1 = new ContaBancaria(123123, 2000);
    Cliente cliente2 = new Cliente("Adelma", "04239135494");
    ContaBancaria conta2 = new ContaBancaria(321321, 4000);

        System.out.println("Cliente: "+cliente1+"\n"+
                           "Conta: "+ conta1.getNumero()+"\n"+
                           "Saldo: "+ conta1.getSaldo());



    }
}
