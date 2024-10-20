/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg23021_indiraayuanggraeni_tugasp7;
import java.util.Scanner;

/**
 *
 * @author I_PF4
 */
public class TokoSerbaAda {
    public static void main(String[] args) {
        String[] kodeBarangList = {"a001", "a002", "a003", "a004", "a005"};
        String[] namaBarang = {"Buku", "Pensil", "Pulpen", "Penggaris", "Karton"};
        int[] hargaBarang = {3000, 4000, 5000, 6000, 2000};

        Scanner input = new Scanner(System.in);

        // Input Jumlah Barang yang akan dibeli
        System.out.print("Masukkan jumlah barang yang akan dibeli: ");
        int jumlahBeli = input.nextInt();

        // Inisialisasi array untuk menyimpan input
        String[] kodeBarang = new String[jumlahBeli];
        int[] jumlahBeliArray = new int[jumlahBeli];

        // Input data barang
        for (int i = 0; i < jumlahBeli; i++) {
            System.out.println("Data barang ke-" + (i + 1));
            System.out.print("Masukkan kode barang (a001-a005): ");
            kodeBarang[i] = input.next();

            // Validasi kode barang
            while (!isValidKodeBarang(kodeBarang[i], kodeBarangList)) {
                System.out.println("Kode barang tidak valid. Masukkan ulang.");
                System.out.print("Masukkan kode barang (a001-a005): ");
                kodeBarang[i] = input.next();
            }

            System.out.print("Masukkan jumlah beli: ");
            jumlahBeliArray[i] = input.nextInt();
        }

        // Menampilkan output
        System.out.println("\n Toko Serba Ada ");
        System.out.println("\n**********************");
        System.out.println("No   Kode Barang   Nama Barang   Harga    Jumlah Beli   Jumlah Bayar");

        int totalBayar = 0;

        for (int i = 0; i < jumlahBeli; i++) {
            int index = getIndexFromKode(kodeBarang[i], kodeBarangList);
            int totalHargaBarang = hargaBarang[index] * jumlahBeliArray[i];
            totalBayar += totalHargaBarang;

            System.out.println("==========================================================================");
            System.out.printf("%-5d%-14s%-14s%-14d%-13d%-13d\n", (i + 1), kodeBarang[i], namaBarang[index], hargaBarang[index], jumlahBeliArray[i], totalHargaBarang);
        }
        System.out.println("==========================================================================");
        System.out.println("\nTotal Harga: " + totalBayar);
        System.out.println("==========================================================================");
    }

    // Validasi kode barang (a001-a005)
    static boolean isValidKodeBarang(String kode, String[] kodeBarangList) {
        for (String k : kodeBarangList) {
            if (kode.equals(k)) {
                return true;
            }
        }
        return false;
    }

    // Mendapatkan indeks barang berdasarkan kode barang
    static int getIndexFromKode(String kode, String[] kodeBarangList) {
        for (int i = 0; i < kodeBarangList.length; i++) {
            if (kodeBarangList[i].equals(kode)) {
                return i;
            }
        }
        return -1;  // Tidak ditemukan
    }
}
