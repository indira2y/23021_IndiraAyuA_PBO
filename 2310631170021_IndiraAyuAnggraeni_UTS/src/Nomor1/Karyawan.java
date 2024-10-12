/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Nomor1;

/**
 *
 * @author Indira Ayu Anggraeni - 2310631170021
 */
public class Karyawan {
    private String idKaryawan;
    private String nama;
    private String jabatan;
    private String alamat;
    private int umur;
    private double gaji;
    
    public Karyawan (String idKaryawan, String nama, String jabatan, String alamat, int umur, double gaji) {
        this.idKaryawan = idKaryawan;
        this.nama = nama;
        this.jabatan = jabatan;
        this.alamat = alamat;
        this.umur = umur;
        this.gaji = gaji;
    }
    
    public String getIdKaryawan (String idKaryawan){
        return idKaryawan;
    }
    
    public void setIdKaryawan (String idKaryawan) {
        this.idKaryawan = idKaryawan;
    }
    
    public void setNama (String nama) {
        this.nama = nama;
    }
    
    public String getJabatan () {
        return jabatan;
    }
    public void setJabatan (String jabatan) {
        this.jabatan = jabatan;
    }
   
    public String getAlamat () {
        return alamat;
    }   
    public void setAlamat (String alamat) {
        this.alamat = alamat;
    }
    
    public int getUmur (){
        return umur;
    }
    public void setUmur (int umur) {
        this.umur = umur;
    }
    
    public double getGaji () {
        return gaji;
    }
    
    public void setGaji (double gaji) {
        this.gaji = gaji;
    }
    
    public void tampilkanInfo () {
        System.out.println ("ID KARYAWAN: " +  idKaryawan);
        System.out.println ("NAMA: " +  nama);
        System.out.println ("JABATAN: " +  jabatan);
        System.out.println ("ALAMAT: " +  alamat);
        System.out.println ("UMUR " +  umur);
        System.out.println ("GAJI: " +  gaji);
    }
    
    //Metode ini untuk menghitung jumlah hari kerja Karyawan dalam satu bulan
    public int hitungHariKerja () {
        int hariKerja = 0;
        for (int i = 1; i <= 30; i++) {
            //Jika hari ke 6 (sabtu) dan hari ke 7 (minggu) libur
            if (i % 7 != 6 && i % 7 != 0) {
                hariKerja++;
            }
        }
        return hariKerja;
    }
}
