/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg23021_indira_praktikum_tugas2;

/**
 *
 * @author indira
 */
public class Mahasiswa {
    String nama;
    String prodi;
    int semester;
    
    public Mahasiswa (String nama, String prodi, int semester){
        this.nama = nama;
        this.prodi = prodi;
        this.semester = semester;
    }
    
    void membaca (){
        System.out.println(nama + " dari prodi " + prodi + " semester " + semester + " sedang membaca modul praktikum PBO.");
    }
    
    void nyontek (){
        System.out.println("Saudara " + nama + " dari prodi " + prodi + " semester " + semester + " terlihat mecontek pada saat ujian PBO berlangsung.");
    }
    
    void modifikasi (){
        System.out.println(nama + " dari prodi " + prodi + " semester " + semester + " melakukan modifikasi pada website agar tidak monoton.");
    }
}
