import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x = scanner.nextInt();
        
        int sum=0;
        for (int i=1 ; i<=x/2 ; i++){
            if (x%i==0){
                sum +=i;
            }
        }
        if (sum==x){
            System.out.println(x + " is a perfect number");
        }else {
            System.out.println(x + " is not a perfect number");
        }
    }
}