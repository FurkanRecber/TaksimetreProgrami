import java.util.Scanner;

public class TaksimetreProgrami {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Başlangıç ücreti 10 TL, KM başı ücret 2.20 TL, en düşük ücret 20 TL
        double km, total;
        System.out.print("Mesafeyi KM cinsinden yazınız: ");
        km = input.nextDouble();

        total = (km * 2.20) + 10;
        total = (total < 20) ? 20 : total;
        System.out.printf("Toplam Tutar: " + "%.2f" + " TL",total);
    }
}
