import java.util.Scanner;

public class taksimetre {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Gittiğiniz km'yi giriniz:");
        int a = input.nextInt();
        double ucret = 10 + (a * 2.20);
        ucret = (ucret <= 20) ? 20 : ucret;

        System.out.println("ücret : " + ucret);





    }



}
