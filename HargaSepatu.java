import java.util.Scanner;

public class HargaSepatu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("Masukkan merk sepatu (Converse/sketcher/nike): ");
        String merek = scanner.nextLine();
        System.out.println("Masukkan kategori sepatu (Slip on/High top/Woman/Man/Kids/Adult): ");
        String kategori = scanner.nextLine();
        System.out.println("Masukkan ukuran sepatu: ");
        int ukuran = scanner.nextInt();

        int harga = 0;
     
        // Converse
        if (merek.equalsIgnoreCase("Converse")) {
            harga = 800000;
        } else if (kategori.equalsIgnoreCase("High top") && (ukuran >= 40 && ukuran <= 44)) {
            harga = 1200000;
        }
        
        // Sketcher
        else if (merek.equalsIgnoreCase("Sketcher")) {
            if (kategori.equalsIgnoreCase("Woman") && (ukuran >= 41 && ukuran <= 44)) {
                harga = 1000000;
            } else if (kategori.equalsIgnoreCase("Man") && (ukuran >= 41 && ukuran <= 44)) {

            }
        }
        
        // Nike
        else if (merek.equalsIgnoreCase("Nike")) {
            if  (kategori.equalsIgnoreCase("Kids") && (ukuran >= 40 && ukuran <= 44)) {
                harga = 1500000;
            }
        }

        if (harga > 0) {
            System.out.println(" Harga sepatu : Rp " + harga);
        } else {
            System.out.println("kombinasi merek, kategori, dan ukiran tidak ditemukan");
        }
        scanner.close();
    }
}
