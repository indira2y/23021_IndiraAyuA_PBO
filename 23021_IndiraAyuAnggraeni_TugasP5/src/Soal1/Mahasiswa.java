/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Soal1;

/**
 *
 * @author Indira
 */
public class Mahasiswa {
    private String NPM;
    private String namaMahasiswa;
    private double nilaiKehadiran;
    private double nilaiTugas;
    private double nilaiUTS;
    private double nilaiUAS;
    
    public Mahasiswa (String NPM, String namaMahasiswa, double nilaiKehadiran, double nilaiTugas, double nilaiUTS, double nilaiUAS){
        this.NPM = NPM;
        this.namaMahasiswa = namaMahasiswa;
        this.nilaiKehadiran = nilaiKehadiran;
        this.nilaiTugas = nilaiTugas;
        this.nilaiUTS = nilaiUTS;
        this.nilaiUAS = nilaiUAS;
    }
    
    public double hitungNilaiAkhir() {
        return (0.10 * nilaiKehadiran) + (0.20 * nilaiTugas) + (0.30 * nilaiUTS) + (0.40 * nilaiUAS);
    }
    
    public String getNPM (){
        return NPM;
    }
    
    public String getNamaMahasiswa (){
        return namaMahasiswa;
    }
}
