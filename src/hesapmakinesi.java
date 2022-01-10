import javax.swing.*;
import java.util.Scanner;

public class hesapmakinesi {
    public static void main(String[] args) {
        int sayı1, sayı2, select;
        Scanner input = new Scanner(System.in);
        int hak=3;
        for (int i = 1; i <= 3; i++) {
        System.out.print("ilk sayıyı giriniz =");
        sayı1 = input.nextInt();
        System.out.print("ikinci sayıyı giriniz =");
        sayı2 = input.nextInt();
        System.out.println("yapmak istedğiniz işlemi seçiniz\n" + "1-toplama\n" + "2-çıkarma\n" + "3-bölme\n" + "4-çarpma");



            select = input.nextInt();
            if (select <= 4 && select >= 1) {
                switch (select) {
                    case (1):
                        System.out.println("sayıların toplamları =" + (sayı1 + sayı2));
                        break;
                    case (2):
                        System.out.println("sayıların farkları=" + (sayı1 - sayı2));
                        break;
                    case (3):
                        System.out.println("sayıların bölümü=" + (sayı1 / sayı2));
                        break;
                    case (4):
                        System.out.println("sayıların çarpımı=" + (sayı1 * sayı2));
                        break;
                }
            } else{
                --hak;
                System.out.println("yanlıs bir seçim yaptınız tekrar deneyiniz kalan hakkınız"+hak);
        }}
    }
}
