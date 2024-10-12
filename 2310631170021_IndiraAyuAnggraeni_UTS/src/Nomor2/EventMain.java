/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Nomor2;
import java.util.List;

/**
 *
 * @author I_PF4
 */
public class EventMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Kegiatan kegiatan1 = new Kegiatan("Seminar Teknologi", "Seminar tentang teknologi terkini", "10-10-2024", "Aula Utama", false);
        Kegiatan kegiatan2 = new Kegiatan("Workshop Pemrograman", "Workshop pemrograman Java", "12-10-2024", "Lab Komputer", false);
        
        // Buat koordinator
        Koordinator koordinator = new Koordinator("Dira", 101, "Kegiatan Awal", "Deskripsi Awal", "01-01-2024", "Lokasi Awal", true);

        // Tambah kegiatan ke koordinator
        koordinator.tambahKegiatan(kegiatan1);
        koordinator.tambahKegiatan(kegiatan2);

        // Koordinator mengelola kegiatan
        koordinator.mengelolaKegiatan();

        // Koordinator melaksanakan kegiatan
        koordinator.melaksanakanKegiatan();

        // Tampilkan detail kegiatan yang dikelola koordinator
        List<Kegiatan> daftarKegiatan = koordinator.getDaftarKegiatan();
        koordinator.tampilkanDetailKegiatan(daftarKegiatan);
    }
}
