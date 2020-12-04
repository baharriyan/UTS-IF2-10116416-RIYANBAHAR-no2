package Bank;
/**
 * @author
 * Nama  : RIYAN BAHAR
 * Kelas : PBOIF2
 * NIM   : 10116416
 * Deskripsi Program : Program penarikan uang
 */
public class Tabungan {
    private int saldo;
    
    public void Tabungan(int saldo){
        this.saldo = saldo;
    }
    
    public int ambilUang(int jumlah){
        return this.saldo - jumlah;
    } 
}
