package pboif2.pkg10116416.uts.tabungan;
/**
 * @author
 * Nama  : RIYAN BAHAR
 * Kelas : PBOIF2
 * NIM   : 10116416
 * Deskripsi Program : Program penarikan uang
*/

import Bank.Tabungan; // import from tabungan
import java.util.Scanner;
public class UTSIF210116416RIYANBAHAR {   
    public static void main(String[] args) {
        // inst. object
        Scanner scan = new Scanner(System.in);
        Tabungan tabungan = new Tabungan();
        
        // var
        int kredit;
        
        System.out.print("===Program Penarikan Uang====\n");
        System.out.printf("Masukkan Saldo Awal : "); tabungan.Tabungan(scan.nextInt());
        System.out.printf("Jumlah uang yang diambil : "); kredit = scan.nextInt();
        System.out.printf("Saldo Anda Sekarang : %d\n",tabungan.ambilUang(kredit));
        
    }
    
}
