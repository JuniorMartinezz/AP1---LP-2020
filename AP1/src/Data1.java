import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Data1 {
    public static String confirmaData(String data) {
        Scanner scanner = new Scanner(System.in);
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

            System.out.println("Digite a data desejada:");
            String dataRecebida = scanner.next();

            sdf.setLenient(false);
            sdf.parse(dataRecebida);

            System.out.println("Data válida");
            return dataRecebida;
        } catch (ParseException ex) {
            System.out.println("Data inválida");
            return null;

        }
    }

    public static String converteData(String data){
        Scanner scanner = new Scanner(System.in);
        System.out.println("insira a data desejada:");
        String dataLida = scanner.next();
        if(dataLida.charAt(2) == '/' && dataLida.charAt(5) == '/') {
            String dia = dataLida.substring(0, 2); //22/10/2020
            String mes = dataLida.substring(3, 5);
            String ano = dataLida.substring(6, 10);
            String dataConvertida = mes + "/" + dia + "/" + ano;
            System.out.println(dataConvertida);
            return dataConvertida;
        } else {
            System.out.println("Data inválida");
            return null;
        }        
    }
}