/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg23021_indiraayuanggraeni_tugasp2;

/**
 *
 * @author indira
 */
public class Matematika implements OperasiAritmatika{
    
    public int pertambahan (int a, int b){
        return a + b;
    }
    
    public int pengurangan (int a, int b){
        return a - b;
    }
    
    public int perkalian (int a, int b){
        return a * b;
    }
    
    public int pembagian (int a, int b){
        if (b != 0){
            return a/b;
        }
        
        System.out.println ("Pembagi tidak boleh nol");
        return 0;
    }
}

    
