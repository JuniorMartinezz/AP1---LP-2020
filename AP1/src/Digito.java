import java.util.Scanner;

public class Digito {
    public static String validaDigito(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite aqui:");
        String dado = scanner.next();

        if(dado.matches("\\d{1,}")){
            System.out.println("É um número!");
            return dado;
        }else{
            System.out.println("Não é um número!");
            return null;
        }
    }
}
