import java.util.Scanner;

public class Maiusculo {
    private String text;
    private Scanner ler = new Scanner(System.in);
    public Maiusculo(){
        text = ler.next();
    }
    String transformar(){
        return text.toUpperCase();
    }
}
