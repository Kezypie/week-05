import java.util.Scanner;

public class operators {

    public static void main(String[] args) {
       Scanner ns = new Scanner(System.in);

       double nMTK, nFisika, nBiologi;

         System.out.print("Masukkan Nilai MTK: ");
            nMTK = ns.nextDouble();

         System.out.print("Masukkan Nilai Fisika: ");
            nFisika = ns.nextDouble();

         System.out.print("Masukkan Nilai Biologi: ");
            nBiologi = ns.nextDouble();

            if (nMTK == 90 &&  nFisika > 90) {
                System.out.println("Anda Pintar");
            } else {
                System.out.println("Anda kurang Pintar");
            }
            if (nMTK >=  90 && nBiologi != 90) {
                System.out.println("Anda Pintar");
            } else {
                System.out.println("Anda kurang Pintar");
            }
            ns.close();
    }
}
