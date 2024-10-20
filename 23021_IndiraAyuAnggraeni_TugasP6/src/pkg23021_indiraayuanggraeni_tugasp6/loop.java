/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg23021_indiraayuanggraeni_tugasp6;

/**
 *
 * @author indira
 */
public class loop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Menghitung Deret bilangan prima dan bukan dari 0 - 20
        System.out.println("Deret bilangan prima dan bukan dari 0 - 20:");
        for (int i = 0; i <= 20; i++) {
            if (isPrime(i)) {
                System.out.println(i + " adalah bilangan prima");
            } else {
                System.out.println(i + " bukan bilangan prima");
            }
        }

        // Menghitung Deret bilangan ganjil dan genap dari 0-20
        System.out.println("Deret bilangan ganjil dan genap dari 0-20:");
        for (int i = 0; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " adalah bilangan genap");
            } else {
                System.out.println(i + " adalah bilangan ganjil");
            }
        }

        // Mengurutkan Huruf Z - A
        System.out.println("Huruf Z - A:");
        char[] huruf = new char[26];
        for (int i = 0; i < 26; i++) {
            huruf[i] = (char) ('Z' - i);
        }
        for (int i = 0; i < 26; i++) {
            System.out.println(huruf[i]);
        }

        // Menyanyikan Lagu "Anak Ayam Turun N"
        System.out.println("Lagu \"Anak Ayam Turun N\"");
        int anakAyam = 10;
        while (anakAyam > 0) {
            System.out.println("Anak ayam turun " + anakAyam);
            System.out.println("Mati satu tinggal " + (anakAyam - 1));
            anakAyam--;
        }
        System.out.println("Anak ayam habis");
    }

    private static boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }   
}
