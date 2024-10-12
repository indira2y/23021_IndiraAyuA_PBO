/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Nomor2;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Indira Ayu Anggraeni - 2310631170021
 */
public class Koordinator extends Kegiatan implements PengelolaKegiatan, PelaksanaKegiatan {
    private String namaKoordinator;
    private int idKoordinator;
    private List<Kegiatan> daftarKegiatan;

    // Konstruktor Koordinator
    public Koordinator(String namaKoordinator, int idKoordinator, String namaKegiatan, String deskripsi, String tanggal, String lokasi, boolean status) {
        super(namaKegiatan, deskripsi, tanggal, lokasi, status);  // Pewarisan dari kelas Kegiatan
        this.namaKoordinator = namaKoordinator;
        this.idKoordinator = idKoordinator;
        this.daftarKegiatan = new ArrayList<>();
    }

    public void mengelolaKegiatan() {
        System.out.println(namaKoordinator + " sedang mengelola kegiatan.");
    }

    public void melaksanakanKegiatan() {
        System.out.println(namaKoordinator + " sedang melaksanakan kegiatan.");
    }

    public void tambahKegiatan(Kegiatan kegiatan) {
        daftarKegiatan.add(kegiatan);
    }

    public List<Kegiatan> getDaftarKegiatan() {
        return daftarKegiatan;
    }
}
