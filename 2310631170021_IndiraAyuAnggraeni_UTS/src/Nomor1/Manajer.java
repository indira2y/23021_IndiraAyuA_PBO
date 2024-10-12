/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Nomor1;
/**
 *
 * @author Indira Ayu Anggareni - 2310631170021
 */
public class Manajer extends Karyawan implements Pengelola, Pekerja {
    private Karyawan[] tim;
    private int jumlahKaryawan;
    private final int MAKS_KARYAWAN = 10;
    private double bonus;

    public Manajer(String idKaryawan, String nama, String jabatan, String alamat, int umur, double gaji, double bonus) {
        super(idKaryawan, nama, jabatan, alamat, umur, gaji);  // Memperbaiki nama variabel sesuai parameter
        this.tim = new Karyawan[MAKS_KARYAWAN];
        this.jumlahKaryawan = 0;
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public void tambahKaryawan(Karyawan karyawan) {
        if (jumlahKaryawan < MAKS_KARYAWAN) {
            tim[jumlahKaryawan] = karyawan;
            jumlahKaryawan++;
        } else {
            System.out.println("Tim penuh, tidak bisa menambah karyawan.");
        }
    }

    public void hapusKaryawan(Karyawan karyawan) {
        boolean ditemukan = false;
        for (int i = 0; i < jumlahKaryawan; i++) {
            if (tim[i].equals(karyawan)) {
                tim[i] = tim[jumlahKaryawan - 1]; // Pindahkan karyawan terakhir ke posisi yang dihapus
                tim[jumlahKaryawan - 1] = null;  // Hapus referensi ke karyawan yang terakhir
                jumlahKaryawan--;
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Karyawan tidak ditemukan dalam tim.");
        }
    }

    public void mengelolaKaryawan() {
        System.out.println("Manajer sedang mengelola tim karyawan.");
        for (int i = 0; i < jumlahKaryawan; i++) {
        }
    }

    public void bekerja() {
        System.out.println("Manajer sedang bekerja mengelola proyek.");
    }

    public void tampilkanInfo() {
        super.tampilkanInfo();  // Memanggil method dari superclass Karyawan
        System.out.println("Bonus: " + bonus);
        for (int i = 0; i < jumlahKaryawan; i++) {
        }
    }
}


