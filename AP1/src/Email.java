import java.util.Scanner;

public class Email {
    public static String validaEmail(){
        Scanner scanner = new Scanner(System.in);   
        
        System.out.println("Digite o seu email:");
        String email = scanner.next(); 

        if(email.matches("\\w+@\\w+\\.\\w{2,3}\\.*\\w*")){
            System.out.println("email válido");
            return email;
        }else{
            System.out.println("email inválido!");
            return null;
        }
    }
}
