// package jobsheet;

import java.util.Scanner;

public class ifCetakKRS19 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("---Cetak KRS---");
       System.out.print("Apakah ukt sudah lunas? (true/false): ");
       boolean lunas = sc.nextBoolean();
    //    System.out.println(lunas ? "Pembayaran UKT sudah terverifikasi" : "Registrasi ditolak. Silakan lunasi UKT terlebih dahulu");
       if (lunas){
        System.out.println("Pembayaran UKT sudah terverifikasi");
        System.out.println("Silahkan cetak KRS dan minta tanda tangan DPA");
       } else {
        System.out.println("“Registrasi ditolak. Silakan lunasi UKT terlebih dahulu");
       }

       // Ternary Operator
       System.out.println("\n-- Versi Ternary Operator --");
       String pesan = lunas ? "Pembayaran UKT terverifikasi\nSilahkan cetak KRS dan minta tanda tangan DPA"
                               : "Registrasi ditolak. Silahkan Lunasi UKT terlebih dahulu";
      System.out.println(pesan);
      sc.close();

}
}
