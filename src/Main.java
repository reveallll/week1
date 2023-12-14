import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

         Scanner input = new Scanner(System.in);

         int a,b;
         double c;

        System.out.println("birinci kenar :");
        a = input.nextInt();
        System.out.println("ikinci kenar : ");
        b = input.nextInt();

        c = Math.sqrt((a*a)+(b*b));
        System.out.println(c);


        }
    }
