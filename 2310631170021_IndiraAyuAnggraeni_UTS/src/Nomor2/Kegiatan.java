/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Nomor2;
import java.util.List;

/**
 *
 * @author Indira Ayu Anggraeni - 2310631170021
 */
public class Kegiatan {
    private String namaKegiatan;
    private String deskripsi;
    private String tanggal;
    private String lokasi;
    private boolean status;

    public Kegiatan(String namaKegiatan, String deskripsi, String tanggal, String lokasi, boolean status) {
        this.namaKegiatan = namaKegiatan;
        this.deskripsi = deskripsi;
        this.tanggal = tanggal;
        this.lokasi = lokasi;
        this.status = status;
    }

    public String getNamaKegiatan() {
        return namaKegiatan;
    }

    public void tampilkanDetailKegiatan(List<Kegiatan> daftarKegiatan) {
        if (daftarKegiatan.isEmpty()) {
            System.out.println("Tidak ada kegiatan yang tersedia.");
        } else {
            for (Kegiatan kegiatan : daftarKegiatan) {
                System.out.println("Nama Kegiatan: " + kegiatan.getNamaKegiatan());
                System.out.println("Deskripsi: " + kegiatan.deskripsi);
                System.out.println("Tanggal: " + kegiatan.tanggal);
                System.out.println("Lokasi: " + kegiatan.lokasi);
                System.out.println("Status: " + (kegiatan.status ? "Selesai" : "Belum Selesai"));
                System.out.println("------------------------------");
            }
        }
    }
}
