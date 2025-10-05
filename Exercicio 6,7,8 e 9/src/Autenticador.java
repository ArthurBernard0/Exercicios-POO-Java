import java.util.Scanner;

public interface Autenticador{

    float senha = 123;

    Scanner scanner = new Scanner(System.in);

    public static boolean autenticar(){

        System.out.println("Usuario Autenticado");
        return true;

    }
}
