// package jobsheet5;
import java.util.Scanner;
public class Tugas3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String jenisPengguna;
        int jumlahSks;
        String pesanAkses;
        System.out.println("--- Cek Akses WIFI Kampus ---");
        System.out.println("Masukkan jenis pengguna (dosen/mahasiswa/lain): ");
        jenisPengguna = sc.nextLine().toLowerCase();
        if (jenisPengguna.equals("dosen")) {
            System.out.println("Masukkan jumlah SKS yang diambil");
            int sks = sc.nextInt();
            if (sks >= 12) {
                System.out.println("Akses wifi diberikan(mahasiswa)");
            } else {
                System.out.println("Akses ditolak, SKS kurang dari 12");
            }
        } else {
            System.out.println("Akses ditolak");
        }
    }
}