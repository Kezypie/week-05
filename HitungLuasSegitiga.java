import java.util.Scanner;

public class HitungLuasSegitiga {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan alas segitiga: ");
        double alas = scanner.nextDouble();

        System.out.print("Masukkan tinggi segitiga: ");
        double tinggi = scanner.nextDouble();

        double luas = 0.5 * alas * tinggi;
        System.out.println("Luas segitiga adalah: " + luas);
        double keliling = alas + tinggi + luas;

        System.out.println("Luas: " + luas + "\n" + "Keliling: " + keliling);
    }
}