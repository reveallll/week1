import java.util.Scanner;
public class vücut_kitle_endeksi {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("boyunu metre cinsinden giriniz: ");
        double boy = input.nextDouble();
        System.out.println("Kilonuzu kg cinsinden giriniz: ");
        double kılo = input.nextDouble();

        double vke = kılo / (boy * boy);
        System.out.println("vücut kitle endeksiniz : "+ vke);

    }

}