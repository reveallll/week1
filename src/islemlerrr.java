import java.util.Scanner;

public class islemlerrr {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("lütfen ilk sayınızı giriniz : ");
        double a = input.nextDouble();
        System.out.println("lütfen ikinci sayınızı giriniz : ");
        double b = input.nextDouble();
        System.out.println("Lütfenün üçüncü sayınızı giriniz : ");
        double c = input.nextDouble();

        double sonuc = a + b*c - b ;
        System.out.println("sonucunuz = " + sonuc);

    }
}