/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Soal1;
import java.util.Scanner;

/**
 *
 * @author Indira
 */
public class MahasiswaMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  

        System.out.println("NPM : ");
        String NPM = input.nextLine();

        System.out.println("Nama Mahasiswa : ");
        String namaMahasiswa = input.nextLine();

        System.out.println("Nilai Kehadiran : ");
        double nilaiKehadiran = input.nextDouble();

        System.out.println("Nilai Tugas : ");
        double nilaiTugas = input.nextDouble();

        System.out.println("Nilai UTS : ");
        double nilaiUTS = input.nextDouble();

        System.out.println("Nilai UAS : ");
        double nilaiUAS = input.nextDouble();

        Mahasiswa mahasiswa = new Mahasiswa(NPM, namaMahasiswa, nilaiKehadiran, nilaiTugas, nilaiUTS, nilaiUAS);
        double nilaiAkhir = mahasiswa.hitungNilaiAkhir();

        String nilai = NilaiMahasiswa.tentukanNilai(nilaiAkhir);
        String keterangan = NilaiMahasiswa.tentukanKeterangan(nilaiAkhir);

        System.out.println();
        System.out.println("NPM Mahasiswa : " + mahasiswa.getNPM());
        System.out.println("Nama Mahasiswa : " + mahasiswa.getNamaMahasiswa());
        System.out.println("Nilai Rata-rata : " + nilaiAkhir);
        System.out.println("Nilai : " + nilai);
        System.out.println("Keterangan : " + keterangan);
    }
}
