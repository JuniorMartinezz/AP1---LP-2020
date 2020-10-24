import java.util.Scanner;

public class Telefone {
    public static String validaTelefone(){
        Scanner scanner = new Scanner(System.in);   
        
        System.out.println("Digite o seu telefone:");
        String telefone = scanner.next();

        if(telefone.matches("\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d")){
            System.out.println("Número válido");
            return telefone;
        }else{
            System.out.println("Número inválido");
            return null;
        }
    }
}
