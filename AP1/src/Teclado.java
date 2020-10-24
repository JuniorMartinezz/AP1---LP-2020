import java.util.Scanner;

public class Teclado {
        Scanner scanner = new Scanner(System.in);

        public String lerString(){
            return lerString("Digite uma string:");
        }

        public String lerString(String msg){
            System.out.println(msg);
            return scanner.next();
        }

        public char lerChar(){
            System.out.println("Digite um caractere:");
            return scanner.next().charAt(0);
        }
        
        public char lerChar(String msg){
            System.out.println(msg);
            return scanner.next().charAt(0);
        }

        public int lerInt(){
            System.out.println("Digite um inteiro:");
            return scanner.nextInt();
        }

        public int lerInt(String msg){
            System.out.println(msg);
            return scanner.nextInt();
        }

        public double lerDouble(){
            System.out.println("Digite um double:");
            return scanner.nextDouble();
        }

        public double lerDouble(String msg){
            System.out.println(msg);
            return scanner.nextDouble();
        }

        public float lerFloat(){
            System.out.println("Digite um Float:");
            return scanner.nextFloat();
        }

        public float lerFloat(String msg){
            System.out.println(msg);
            return scanner.nextFloat();
        }
}
