import java.util.Scanner;

public class Invert {
    private String text;
    private Scanner ler = new Scanner(System.in);
    public Invert(){
        text = ler.next();
    }
    String inverter(){
        char[] invertida = text.toCharArray();
        for(int i = text.length();i > text.length()/2;i--){
            char letra = invertida[i - 1];
            invertida[i - 1] = invertida[text.length() - i];
            invertida[text.length() - i] = letra;
        }
        String transformada = new String(invertida);
        return transformada;
    }
}
