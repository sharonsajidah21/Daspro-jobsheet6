import java.util.Scanner;

public class PemilihanPercobaan321 {
    public static void main(String[] args) {
        Scanner input15 = new Scanner(System.in);
        String kategori;
        int penghasilan, gajiBersih;
        double Pajak = 0;

        System.out.println("Masukkan kategori : ");
        kategori = input15.nextLine();
        System.out.println("Masukkan Besarnya Penghasilan : ");
        penghasilan = input15.nextInt();

        if (kategori.equals("pekerja")); {
            if (penghasilan <= 2000000)
                Pajak = 0.1;
            else if (penghasilan <= 3000000)
                Pajak = 0.15;
            else 
                Pajak = 0.2;
            gajiBersih = (int) (penghasilan - (Pajak * penghasilan));
            System.out.println("Penghasilan Bersih : " + gajiBersih);
        } if (kategori.equals("pembisnis")) {
            if (penghasilan <= 3500000)
                Pajak = 0.15;
            else if (penghasilan <= 3500000)
                Pajak = 0.2;
            else 
                Pajak = 0.25;
            gajiBersih = (int) (penghasilan - (Pajak * penghasilan));
            System.out.println("Penghasilan bersih : " + gajiBersih);
        } else  
            System.out.println("Masukkan kategori salah ");
    } 
}
