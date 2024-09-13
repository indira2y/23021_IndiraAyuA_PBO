/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg23021_indiraayuanggraeni_tugasp3;

/**
 *
 * @author indira
 */
public class KonversiSuhu {
    public void CelciusToFahrenheit (float suhu) {
        float f = (suhu * 9/5) + 32;
        System.out.println ("Celcius= " + suhu + "\t--->" + "\tFahrenheit= " +f);
    }
    
    public void CelciusToReamur (float suhu) {
        float r = suhu * 4/5;
        System.out.println ("Celcius= " + suhu + "\t--->" + "\tReamur= " +r);
    }
}
