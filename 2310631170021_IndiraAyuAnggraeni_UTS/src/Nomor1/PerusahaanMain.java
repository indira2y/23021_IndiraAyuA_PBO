/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Nomor1;

/**
 *
 * @author I_PF4
 */
public class PerusahaanMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Karyawan karyawan1 = new Karyawan("001", "Indira", "Developer", "Karawang", 24, 5000000);
        Karyawan karyawan2 = new Karyawan("002", "Dira", "Designer", "Bandung", 25, 10000000);

        // Membuat objek Manajer
        Manajer manajer1 = new Manajer("003", "Ayu", "Manager", "Bali", 30, 2000000, 1000000);

        // Menambahkan karyawan ke dalam tim manajer
        manajer1.tambahKaryawan(karyawan1);
        manajer1.tambahKaryawan(karyawan2);

        // Menampilkan informasi manajer dan timnya
        System.out.println("Informasi Manajer:");
        manajer1.tampilkanInfo();

        // Menampilkan jumlah hari kerja karyawan1
        System.out.println("\nJumlah hari kerja karyawan dalam sebulan: " + karyawan1.hitungHariKerja());

        // Polimorfisme: Manajer sebagai Pengelola dan Pekerja
        System.out.println("\nManajer sebagai Pengelola:");
        Pengelola pengelola = manajer1;
        pengelola.mengelolaKaryawan();

        System.out.println("\nManajer sebagai Pekerja:");
        Pekerja pekerja = manajer1;
        pekerja.bekerja();

    }
    
}
