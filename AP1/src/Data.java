import org.graalvm.compiler.nodes.calc.IntegerDivRemNode;

public class Data {
    public static int getDia(String data){
        String dia = data.substring(0, 2);
        int diaInt = Integer.parseInt(dia);
        if(diaInt > 0 && diaInt <31){
            return diaInt;
        }
        
        return 0;   
    }

    public static int getMes(String data){
        if(getValido(data)){
        
            String mes = data.substring(3, 5);
            int mesInt = Integer.parseInt(mes);

            if(mesInt > 0 && mesInt <13){
                return mesInt;
            }
            return 0;
        } else {
            return 0;
        }
    }

    public static boolean getValido(String data){
        if(data.length()==10){
            if(data.charAt(2)=='/' && data.charAt(5)=='/'){
                return true;
            } else{
                return false;
            }
        } else {
            return false;
        }
    }
}
