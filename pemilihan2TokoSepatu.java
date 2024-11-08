
import java.util.Scanner;

public class pemilihan2TokoSepatu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String merek, kategori;
        int ukuran, harga = 0;

        System.out.println("---------------------------------");
        System.out.println("           Toko Sepatu           ");
        System.out.println("---------------------------------");
        System.out.println("    Converse Slip On/High Top");
        System.out.println("    Ukuran Slip On = 36-40");
        System.out.println("    Ukuran Hih Top = 41-44");
        System.out.println("---------------------------------");
        System.out.println("    Sketcher Woman/Man");
        System.out.println("    Ukuran Woman = 36-41");
        System.out.println("    Ukuran Man   = 41-44");
        System.out.println("---------------------------------");
        System.out.println("    Nike Kids/Adult");
        System.out.println("    Ukuran Kids  = 36-40");
        System.out.println("    Ukuran adult = 41-44");
        System.out.println("---------------------------------");
        System.out.print("Masukkan Merek = ");
        merek = sc.nextLine();
        System.out.print("Masukkan Kategori = ");
        kategori = sc.nextLine();
        System.out.print("Masukkan Ukuran = ");
        ukuran = sc.nextInt();

        if (merek.equalsIgnoreCase("Converse")){
            if (kategori.equalsIgnoreCase("Slip On") && (ukuran >= 36 && ukuran <= 40 )){
                harga = 800000;
            } else if (kategori.equalsIgnoreCase("High Top") && (ukuran >= 40 && ukuran <= 44)) {
                harga = 1200000;
            }
        }else if (merek.equalsIgnoreCase("Sketcher")) {
            if (kategori.equalsIgnoreCase("Woman") && (ukuran >= 36 && ukuran <= 41)){
                harga = 1000000;
            } else if (kategori.equalsIgnoreCase("Man") && (ukuran >= 40 && ukuran <= 44)) {
                harga = 1500000;
            }
        }
        if (harga > 0) {
            System.out.println("Harga sepatu adalah = Rp." + harga);
        } else {
            System.out.println("Yang anda pilih tidak ada, Silahkan anda lihat lagi");
        }
        sc.close();
    }
}
