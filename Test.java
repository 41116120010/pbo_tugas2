/*
 * Nama Pembuat : Daffiq Trie Octorino
 * NIM          : 2401083003
 * Nama Program : Test Transfer
 */

package tka_daffiqtrieoctorino;


public class Test {
public static void main(String[] args) {
        Nasabah nasabah1 = new Nasabah("Pak", "Daffiq");
        Tabungan tabungan1 = new Tabungan(10000);
        nasabah1.setTabungan(tabungan1);

        Nasabah nasabah2 = new Nasabah("Buk", "Dedek");
        Tabungan tabungan2 = new Tabungan(20000);
        nasabah2.setTabungan(tabungan2);

        System.out.println("Nasabah 1: " + nasabah1);
        System.out.println("Nasabah 2: " + nasabah2);

        nasabah1.getTabungan().simpanUang(4000);
        System.out.println("Saldo Nasabah 1 setelah menabung (4000) : " + nasabah1.getTabungan().getSaldo());

        nasabah2.getTabungan().simpanUang(7000);
        System.out.println("Saldo Nasabah 2 setelah menabung (7000): " + nasabah2.getTabungan().getSaldo());

        if (nasabah1.getTabungan().ambilUang(5000)) {
            System.out.println("Saldo Nasabah 1 setelah mengambil uang (5000) : " + nasabah1.getTabungan().getSaldo());
        } else {
            System.out.println("Nasabah 1 gagal mengambil uang. Saldo tidak mencukupi.");
        }

        if (nasabah2.getTabungan().ambilUang(6000)) {
            System.out.println("Saldo Nasabah 2 setelah mengambil uang (6000) : " + nasabah2.getTabungan().getSaldo());
        } else {
            System.out.println("Nasabah 2 gagal mengambil uang. Saldo tidak mencukupi.");
        }

        if (nasabah2.getTabungan().transfer(nasabah1.getTabungan(), 1000)) {
            System.out.println("Transfer saldo Buk Dedek ke Pak Daffiq (1000) ");
        } else {
            System.out.println("Transfer gagal. Saldo Nasabah tidak mencukupi.");
        }

        System.out.println("Saldo akhir Nasabah 1: " + nasabah1.getTabungan().getSaldo());
        System.out.println("Saldo akhir Nasabah 2: " + nasabah2.getTabungan().getSaldo());
    }     
}

