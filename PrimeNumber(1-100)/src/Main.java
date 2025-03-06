//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        for (int i=2 ; i<=100 ; i++){
            boolean isprime=true;
            for (int j=2 ; j*j<=i ; j++){
                if (i%j==0){
                    isprime=false;
                    break;
                }
            }
            if (isprime){
                System.out.println( i + " ");
            }
        }
    }
}