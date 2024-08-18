import java.util.Scanner;

public class Array {
    private int[] num = new int[5];
    private Scanner scanner = new Scanner(System.in);
    public Array(){
        for(int i = 0; i < 5 ; i++){
            System.out.println("\tDigite um numero para colocar no array:");
            num[i]=scanner.nextInt();
        }
    }
    void mostrar(){
        for(int i = 0; i <5; i++){
            System.out.printf("\tnum[%d]=%d  ",i,num[i]);
        }
        System.out.println();
    }
}
