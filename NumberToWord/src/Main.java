import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number==0){
            System.out.println("zero");
        } else if (number<10) {
            switch (number){
                case 1 :System.out.println("one");  break;
                case 2 :System.out.println("two");  break;
                case 3 :System.out.println("three");break;
                case 4 :System.out.println("four"); break;
                case 5 :System.out.println("five"); break;
                case 6 :System.out.println("six");  break;
                case 7 :System.out.println("seven");break;
                case 8 :System.out.println("eight");break;
                case 9 :System.out.println("nine"); break;
            }
        } else if (number<20) {
            switch (number){
                case 10 :System.out.println("ten");      break;
                case 11 :System.out.println("eleven");   break;
                case 12 :System.out.println("twelve");   break;
                case 13 :System.out.println("thirteen"); break;
                case 14 :System.out.println("fourteen"); break;
                case 15 :System.out.println("fifteen");  break;
                case 16 :System.out.println("sixteen");  break;
                case 17 :System.out.println("seventeen");break;
                case 18 :System.out.println("eighteen"); break;
                case 19 :System.out.println("nineteen"); break;
            }
        }else if (number<100){
            int tens=number/10;
            int units=number%10;

            switch (tens){
                case 2 :System.out.println("twenty"); break;
                case 3 :System.out.println("thirty"); break;
                case 4 :System.out.println("forty");  break;
                case 5 :System.out.println("fifty");  break;
                case 6 :System.out.println("sixty");  break;
                case 7 :System.out.println("seventy");break;
                case 8 :System.out.println("eighty"); break;
                case 9 :System.out.println("ninety"); break;
            }
            if (units !=0){
                System.out.print(" ");
                switch (units){
                    case 1 :System.out.println("one");  break;
                    case 2 :System.out.println("two");  break;
                    case 3 :System.out.println("three");break;
                    case 4 :System.out.println("four"); break;
                    case 5 :System.out.println("five"); break;
                    case 6 :System.out.println("six");  break;
                    case 7 :System.out.println("seven");break;
                    case 8 :System.out.println("eight");break;
                    case 9 :System.out.println("nine"); break;
                }
            }else {
                System.out.println();
            }
        } else if (number<1000) {
            int hundreds=number/100;
            int remainder=number%100;

            switch (hundreds){
                case 1 :System.out.print("one");  break;
                case 2 :System.out.print("two");  break;
                case 3 :System.out.print("three");break;
                case 4 :System.out.print("four"); break;
                case 5 :System.out.print("five"); break;
                case 6 :System.out.print("six");  break;
                case 7 :System.out.print("seven");break;
                case 8 :System.out.print("eight");break;
                case 9 :System.out.print("nine"); break;
            }
            System.out.print(" hundred ");

            if (remainder<10){
                switch (remainder){
                    case 1 :System.out.println("one");  break;
                    case 2 :System.out.println("two");  break;
                    case 3 :System.out.println("three");break;
                    case 4 :System.out.println("four"); break;
                    case 5 :System.out.println("five"); break;
                    case 6 :System.out.println("six");  break;
                    case 7 :System.out.println("seven");break;
                    case 8 :System.out.println("eight");break;
                    case 9 :System.out.println("nine"); break;
                }
            } else if (remainder<20) {
                switch (remainder){
                    case 10 :System.out.println("ten");      break;
                    case 11 :System.out.println("eleven");   break;
                    case 12 :System.out.println("twelve");   break;
                    case 13 :System.out.println("thirteen"); break;
                    case 14 :System.out.println("fourteen"); break;
                    case 15 :System.out.println("fifteen");  break;
                    case 16 :System.out.println("sixteen");  break;
                    case 17 :System.out.println("seventeen");break;
                    case 18 :System.out.println("eighteen"); break;
                    case 19 :System.out.println("nineteen"); break;
                }
            }else {
                int tens=remainder/10;
                int units=remainder%10;

                switch (tens){
                    case 2 :System.out.print("twenty"); break;
                    case 3 :System.out.print("thirty"); break;
                    case 4 :System.out.print("forty");  break;
                    case 5 :System.out.print("fifty");  break;
                    case 6 :System.out.print("sixty");  break;
                    case 7 :System.out.print("seventy");break;
                    case 8 :System.out.print("eighty"); break;
                    case 9 :System.out.print("ninety"); break;
                }
                if (units !=0){
                    System.out.print(" ");
                    switch (units){
                        case 1 :System.out.println("one");  break;
                        case 2 :System.out.println("two");  break;
                        case 3 :System.out.println("three");break;
                        case 4 :System.out.println("four"); break;
                        case 5 :System.out.println("five"); break;
                        case 6 :System.out.println("six");  break;
                        case 7 :System.out.println("seven");break;
                        case 8 :System.out.println("eight");break;
                        case 9 :System.out.println("nine"); break;
                    }
                }else {
                    System.out.println();
                }
            }
        }else {
            System.out.println("number is out of range!");
        }
    }
}