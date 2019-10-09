/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118005.latihan19.saldotabungan;

/**
 *
 * @author USER
 
 * NAMA : Rycho Rantung
 * KELAS : IF1
 * NIM : 10118005
 * Deskripsi Program :Program berisi program yang menampilkan saldo tabungan
 */
public class IF110118005Latihan19SaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double saldoAwal = 2500000;
        double bunga = 0.15;
        double saldoNow = saldoAwal + (saldoAwal * bunga);
        int lamaBulan = 6;
        
        for (int i = 1; i <= lamaBulan; i++, saldoNow+=(saldoNow*bunga)){
            System.out.println("Saldo di bulan ke-" + (i) + " Rp. " + saldoNow);
            
    }
    }   
}
