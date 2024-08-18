import java.util.Scanner;

public class Media {
    Scanner scanner = new Scanner(System.in);
    int numProvas;
    int[] notas;
    public Media(){
        System.out.println("Quantas provas você fez?");
        numProvas = scanner.nextInt();
        notas = new int[numProvas];
    }



    void nota(){
        int total = 0;
        for(int i = 0; i < numProvas; i++){
            System.out.printf("Digite a nota %d\n",(i+1));
            notas[i] = scanner.nextInt();
            total += notas[i];
        }
        System.out.println("A média é: " + total/numProvas);
    }
}
