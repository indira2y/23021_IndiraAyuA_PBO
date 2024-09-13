/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg23021_indiraayuanggraeni_tugasp3;

/**
 *
 * @author indira
 */
public class KonversiSuhu2 extends KonversiSuhu {
    public void FahrenheitToReamur (float suhu) {
        float ftor = (suhu - 32) * 4/9;
        System.out.println ("Fahrenheit= " + suhu + " --->" + "\tReamur= " +ftor);
    }
}
