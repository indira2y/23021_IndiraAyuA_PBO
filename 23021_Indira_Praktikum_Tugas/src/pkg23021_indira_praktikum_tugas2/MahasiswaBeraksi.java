/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg23021_indira_praktikum_tugas2;

/**
 *
 * @author indira
 */
public class MahasiswaBeraksi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa("Ayu", "Informatika", 3);
        Mahasiswa mhs2 = new Mahasiswa("Zaidan", "Informatika", 5);
        Mahasiswa mhs3 = new Mahasiswa("Yudan", "Informatika", 7);
        
        mhs1.membaca();
        mhs2.nyontek();
        mhs3.modifikasi();
    }
    
}
