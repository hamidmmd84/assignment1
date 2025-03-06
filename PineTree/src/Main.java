import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();


        for (int i=1 ; i<=number ; i++){
            for (int j=i ; j<=number ; j++){
                System.out.print(" ");
            }
            for (int j=1 ; j<=(2*i-1) ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i=1 ; i<=(number/2) ; i++){
            for (int j=1 ; j<=number ; j++){
                System.out.print(" ");
            }
            System.out.println("*");
        }
    }
}