/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg23021_indiraayuanggraeni_tugasp3;

/**
 *
 * @author indira
 */
public class MatematikaInheritance {
    Matematika2 mtk2 = new Matematika2();
    /**
     * @param args the command line arguments
     */
    public void OperasiAritmatika (int a, int b) {
        System.out.println("Pertambahan " + a + " + " + b + " : " + mtk2.pertambahan(a, b));
        System.out.println("Pengurangan " + a + " - " + b + " : " + mtk2.pengurangan(a, b));
        System.out.println("Perkalian " + a + " x " + b + " : " + mtk2.perkalian(a, b));
        System.out.println("Pembagian " + a + " / " + b + " : " + mtk2.pembagian(a, b));
        System.out.println("Modulus " + a + " % " + b + " : " + mtk2.modulus(a, b));
    }
    
    public static void main(String[] args) {
        MatematikaInheritance mtkInherit = new MatematikaInheritance ();
        mtkInherit.OperasiAritmatika(10, 5);
    }
} 
