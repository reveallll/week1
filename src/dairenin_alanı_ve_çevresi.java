import java.util.Scanner;
public class dairenin_alanı_ve_çevresi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("yarıçapı giriniz:");
        int r = input.nextInt();
        double pi = 3.14;
        double cevre = 2 * pi * r;
        double alan = pi * r * r;

        System.out.println("çevre : " + cevre);
        System.out.println("alan : "+ alan);







    }
}
