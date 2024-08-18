import java.util.Scanner;

public class Palindromo {
    String text;
    private Scanner scanner = new Scanner(System.in);
    public Palindromo(){
        System.out.println("digite a palavra para verificar se é um palindromo:");
        text = scanner.next();
    }
    void vericar() {
        boolean verificador = true;
        for (int i = 0, i2 = text.length() - 1; i < text.length() / 2; i++, i2--) {
            if (text.charAt(i2) != text.charAt(i)) {
                verificador = false;
            }
        }
    if(verificador)
        System.out.println("É um palíndromo");
    else
        System.out.println("Não é um palídormo");
    }
}
