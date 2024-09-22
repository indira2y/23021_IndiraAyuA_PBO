/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg23021_indiraayuanggraeni_tugasp4;

/**
 *
 * @author indira
 */
public class RumusBeraksi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Rumus r = new Rumus(2, 3, 5);
        Rumus r1 = new Rumus (3);

            System.out.println("Balok");
            System.out.println("Luas permukaan Balok : "+r.LuasBalok());
            System.out.println("Volume Balok: "+ r.VolumeBalok());

            System.out.println("Kubus");
            System.out.println("Luas Permukaan Kubus : "+r1.LuasKubus());
            System.out.println("Luas Lingkaran : "+r1.VolumeKubus());
             
    }
    
}
