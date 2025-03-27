/*
 * Nama Pembuat : Daffiq Trie Octorino
 * NIM          : 2401083003
 * Nama Program : 
 */

package tka_daffiqtrieoctorino;


public class TestBank {
public static void main(String[] args) {

        Bank bank = new Bank();
        
        bank.tambahNasabah("Andi", "Sucipto", new Tabungan(20000)); 
        bank.tambahNasabah("Budi", "Pratama");                     
        bank.tambahNasabah("Candra", "Dinata", new Tabungan(15000)); 
        bank.tambahNasabah("Dede", "Kusuma", new Tabungan(25000));  
        bank.tambahNasabah("Dede", "Andika");                      
        bank.tambahNasabah("Budi", "Dirgantara", new Tabungan(30000)); 

        System.out.println("Daftar semua nasabah:");
        for (int i = 0; i < bank.getJumlahNasabah(); i++) {
            Nasabah nasabah = bank.getNasabah(i);
            System.out.println("Indeks " + i + ": " + nasabah);
        }
        System.out.println("Total jumlah nasabah: " + bank.getJumlahNasabah());

        System.out.println("\nInformasi nasabah pada indeks ke-3:");
        Nasabah nasabahIndeks3 = bank.getNasabah(3);
        if (nasabahIndeks3 != null) {
            System.out.println(nasabahIndeks3);
        } else {
            System.out.println("Nasabah tidak ditemukan pada indeks ke-3.");
        }

        System.out.println("\nMencari nasabah dengan nama Candra Dinata:");
        int indeksCandra = bank.searchNasabah("Candra", "Dinata");
        if (indeksCandra != -1) {
            System.out.println("Nasabah ditemukan pada indeks: " + indeksCandra);
            System.out.println(bank.getNasabah(indeksCandra));
        } else {
            System.out.println("Nasabah dengan nama Candra Dinata tidak ditemukan.");
        }

        System.out.println("\nMencari nasabah dengan nama awal Dede:");
        int[] indeksDede = bank.searchNasabah("Dede");
        if (indeksDede.length > 0) {
            System.out.println("Nasabah dengan nama awal Dede ditemukan pada indeks:");
            for (int indeks : indeksDede) {
                System.out.println("Indeks " + indeks + ": " + bank.getNasabah(indeks));
            }
        } else {
            System.out.println("Tidak ada nasabah dengan nama awal Dede.");
        }

        System.out.println("\nMencari nasabah dengan nama awal Budi:");
        int[] indeksBudi = bank.searchNasabah("Budi");
        if (indeksBudi.length > 0) {
            System.out.println("Nasabah dengan nama awal Budi ditemukan pada indeks:");
            for (int indeks : indeksBudi) {
                System.out.println("Indeks " + indeks + ": " + bank.getNasabah(indeks));
            }
        } else {
            System.out.println("Tidak ada nasabah dengan nama awal Budi.");
        }
    }
}
