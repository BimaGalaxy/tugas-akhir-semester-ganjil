package tugasakhirsemesterganjil;

import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author Galaxy
 */
public class MainProgram {

    // method atau function untuk menampilkan tanggal
    public static void tanggal() {
        int menit, jam, hari, bulan, tahun;
        GregorianCalendar date = new GregorianCalendar();
        String namabulan[] = { "Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September",
                "Oktober", "November", "Desember" };
        menit = date.get(Calendar.MINUTE);
        jam = date.get(Calendar.HOUR_OF_DAY);
        hari = date.get(Calendar.DAY_OF_MONTH);
        bulan = date.get(Calendar.MONTH);
        tahun = date.get(Calendar.YEAR);
        System.out.println("Pemesanan tanggal: " + hari + " " + namabulan[bulan] + " " + tahun);
        System.out.println("jam              : " + jam + ":" + menit);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean x;
        // Pemilihan tukang
        System.out.println("=========[Tukang online]==========");
        System.out.println("----------------------------------");
        System.out.println("==========[Pilih tukang]==========");
        System.out.println("- Epan kopling   | - Inad karbu\n- Akbar silinder | - Disca radiator");
        System.out.println("==================================");
        System.out.print("Tukang : ");
        String tukang = input.nextLine();

        // Array penampung biodata tukang
        String[] nama = { "Epan kopling", "Akbar silinder", "Inad karbu", "Disca radiator" };
        String[] keahlian = { "Saya ahli merusak rumah", "Saya ahli membangun rumah", "Saya bisa ngopi",
                "Saya bisa bore up motor" };
        int[] harga = { 100000000, 150000, 100000, 200000 };
        String[][] kelompok = { nama, keahlian };
        int[][] kelompok2 = { harga };
        int terdaftar = 0;

        // menampilkan biodata tukang
        for (int i = 0; i < 4; i++) {
            if (tukang.equalsIgnoreCase(kelompok[0][i])) {
                System.out.println("=========[biodata tukang]=========");
                System.out.println(("Nama tukang   : " + kelompok[0][i] + "\nKeahlian      : " + kelompok[1][i]
                        + "\nHarga perhari : " + kelompok2[0][i]));
                System.out.println("==================================");

                // konfirmasi pesanan
                System.out
                        .print("Apa anda yakin ingin memesan tukang ini?\n'ketik true jika iya, false jika tidak' : ");
                x = input.nextBoolean();

                if (x == true) {
                    System.out.println("-----------------------------------");
                    System.out.println("berapa hari anda ingin menyewa tukang ini?");
                    System.out.print("hari: ");
                    int hari = input.nextInt();
                    System.out.println("-----------------------------------");
                    System.out.println("=======[Konfirmasi pesanan]========");

                    tanggal(); // digunakan untuk memanggil method tanggal dan jam

                    System.out.println(("Nama tukang      : " + kelompok[0][i]) + "\ntotal hari       : " + hari
                            + " hari" + ("\nTotal harga      : " + kelompok2[0][i] * hari));
                    System.out.println("==================================");
                    terdaftar = 1;
                } else {
                    System.out.println("Baiklah terimakasih!");
                    terdaftar = 1;
                }
            }
        }
        if (terdaftar < 1) { // untuk jika nama yang diinput user tidak terdapat dalam data
            System.out.println("Nama tidak terdaftar di majelis pertukangan");
        }

    }
}
