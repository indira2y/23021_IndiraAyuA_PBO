/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg23021_indiraayuanggraeni_tugasp9;
import java.util.ArrayList;

/**
 *
 * @author I_PF4
 */
public class InputDataMahasiswa {
    private ArrayList<Mahasiswa> listMahasiswa;

    public InputDataMahasiswa() {
        listMahasiswa = new ArrayList<>();
    }

    public void simpanMahasiswa(String NIM, String Nama, String Alamat, String MataKuliah, double Nilai1, double Nilai2, double Nilai3, double Nilai4, double Nilai5) {
        Mahasiswa mahasiswa = new Mahasiswa(NIM, Nama, Alamat, MataKuliah, Nilai1, Nilai2, Nilai3, Nilai4, Nilai5);
        listMahasiswa.add(mahasiswa);
    }
    
    public void hapusMahasiswa(int index) {
        if (index >= 0 && index < listMahasiswa.size()) {
            listMahasiswa.remove(index);
        }
    }

    public ArrayList<Mahasiswa> getAllMahasiswa() {
        return listMahasiswa;
    }
}
