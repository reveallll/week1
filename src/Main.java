import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

         Scanner input = new Scanner(System.in);

         int mat,fiz,geo;

        System.out.println("mat notunuzu giriniz");
        mat = input.nextInt();
        System.out.println("fiz notunuzu giriniz");
        fiz = input.nextInt();
        System.out.println("geo notunuzu giriniz");
        geo = input.nextInt();

       int toplam = mat + fiz + geo;
       double sonuc = toplam / 3.0;

       String str = (sonuc) >= 50 ? "Geçtiniz" : "Kaldınız";
        System.out.println(str);



        }
    }
