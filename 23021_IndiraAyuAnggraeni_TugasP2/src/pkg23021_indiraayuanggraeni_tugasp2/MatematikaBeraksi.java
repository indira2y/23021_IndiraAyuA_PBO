/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg23021_indiraayuanggraeni_tugasp2;

/**
 *
 * @author indira
 */
public class MatematikaBeraksi {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String [] args){
        Matematika hitung = new Matematika();
        
        System.out.println("================================");
        System.out.println("OPERASI ARITMATIKA");
        System.out.println("================================");
        System.out.println("Pertambahan : 20 + 10 = " + hitung.pertambahan(20, 10));
        System.out.println("Pengurangan : 10 - 5 = " + hitung.pengurangan(10, 5));
        System.out.println("Perkalian   : 10 * 3 = " + hitung.perkalian(10, 3));
        System.out.println("Pembagian   : 21 / 2 = " + hitung.pembagian(21, 2));
        }
    }
