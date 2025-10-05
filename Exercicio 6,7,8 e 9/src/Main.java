import javax.xml.transform.Source;
import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main (String[] args){

        List<Funcionario> funcionarios = new ArrayList<>();

        funcionarios.add(new Programador("Arthur", 2000));
        funcionarios.add(new Gerente("Aira", 3000));
        funcionarios.add(new Programador("Jairo", 6000));
        funcionarios.add(new Gerente("Arthur", 8000));

        Autenticador.autenticar();

        for (Funcionario i : funcionarios) {
            System.out.println();
            System.out.println("Nome: "+i.nome);
            System.out.println("Salário: R$ "+String.format("%.2f", i.salario));
            System.out.println("Bônus calculado: R$ "+String.format("%.2f", i.calcularBonus()));
            System.out.println("----------------------------------------------");

        }




    }
}
