import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

         Scanner input = new Scanner(System.in);

         double urun;

        System.out.println("lütfen ürün değerini giriniz:");
        urun = input.nextInt();
        System.out.println("kdvsiz fiyat: " + urun);
        urun = urun + (urun * 18/100);
        System.out.println("kdvli fiyat : "+urun);



        }
    }
