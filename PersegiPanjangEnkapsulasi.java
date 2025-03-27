/*
 * Nama Pembuat : Daffiq Trie Octorino
 * NIM          : 2401083003
 * Nama Program : 
 */

package tka_daffiqtrieoctorino;


public class PersegiPanjangEnkapsulasi {
private int panjang;
    private  int lebar;
    private static int JumlahObjek = 0;
    
    public PersegiPanjangEnkapsulasi (){
        this.panjang = 0;
        this.lebar = 0;
        JumlahObjek++;
    }

    public PersegiPanjangEnkapsulasi(int panjangBaru, int lebarBaru){
    this.panjang = panjangBaru;
    this.lebar = lebarBaru;
    JumlahObjek++;
 }
    public void setPanjang(int panjangBaru){
    this.panjang = panjangBaru;
    }  
    public int getPanjang() {
    return panjang;
    }  

    public void setLebar(int lebarBaru){
    this.lebar = lebarBaru;
    }  
    public int getLebar() {
    return lebar;
    }
   
    public static int getJumlahObjek() {
    return JumlahObjek;
    }
    
    public int getLuas() {
    return panjang * lebar;
    }
    
    public int getKeliling() {
    return 2 *(panjang + lebar);
    }
}
