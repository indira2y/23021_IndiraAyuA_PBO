/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg23021_indira_praktikum_tugas2;

/**
 *
 * @author indira
 */
public class Nilai {
    String NPM;
    String Nama;
    double nilaiAbsen;
    double nilaiTugas;
    double nilaiUTS;
    double nilaiUAS;
    double nilaiAkhir;
    
    public void Nilai (String NPM, String Nama, double nilaiAbsen, double nilaiTugas, double nilaiUTS, double nilaiUAS){
        this.NPM = NPM;
        this.Nama = Nama;
        this.nilaiAbsen = nilaiAbsen;
        this.nilaiTugas = nilaiTugas;
        this.nilaiUTS = nilaiUTS;
        this.nilaiUAS = nilaiUAS;
        
        this.nilaiAkhir = (nilaiAbsen * 0.1) + (nilaiTugas * 0.2) + (nilaiUTS * 0.3) + (nilaiUAS * 0.4);
    }  
    
    public void CetakNilai(){
        System.out.println("NPM         : " + NPM);
        System.out.println("Nama        : " + Nama);
        System.out.println("Nilai Absen : " + nilaiAbsen);
        System.out.println("Nilai Tugas : " + nilaiTugas);
        System.out.println("Nilai UTS   : " + nilaiUTS);
        System.out.println("Nilai UAS   : " + nilaiUAS);
        System.out.println("Nilai Akhir : " + nilaiAkhir);
    }
}
