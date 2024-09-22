/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg23021_indiraayuanggraeni_tugasp4;

/**
 *
 * @author indira
 */
public class Rumus {
    double p, l, t, s;
    
    public Rumus(double p, double l, double t) {
    this.p = p;
    this.l = l;
    this.t = t;
     }
     public Rumus(double s) {
     this.s = s;
    
     }
     
     public double LuasBalok(){
     return 2*(p*l + l*t + p*l) ;
     }
     
     public double VolumeBalok(){
     return p*l*t ;
     }
     
     public double LuasKubus(){
     return s*s*s ;
     }
     
     public double VolumeKubus(){
     return 6*s*s;
     }
}
