import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws ParseException {
        Teclado teclado = new Teclado();

        teclado.lerString("Digite o seu nome:");
        teclado.lerString();

        teclado.lerChar("Digite o seu sexo:");
        teclado.lerChar();

        teclado.lerInt("Digite um número");
        teclado.lerInt();


        teclado.lerDouble("Digite seu cpf:");
        teclado.lerDouble();

        teclado.lerFloat("Digite o preço do produto");
        teclado.lerFloat();//OK ALL

        Email.validaEmail(); //OK
        Telefone.validaTelefone(); //OK        
        Data1.confirmaData(null);//OK
        Data1.converteData(null);//OK
        Digito.validaDigito(); //OK


    }
}
