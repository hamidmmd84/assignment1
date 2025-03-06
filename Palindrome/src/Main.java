import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        
        int r,m=0;
        int temp=n;
        while (n>0){
            r=n%10;
            m=m*10+r;
            n/=10;
        }
        if (temp==m) {
            System.out.println(m + " is a palindrome number");
        }else {
            System.out.println(m +" is not a palindrome number");
        }
    }
}