/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg23021_indiraayuanggraeni_tugasp2;

/**
 *
 * @author indira
 */
public class Bingo {
    private String lirikbingo;
    private String bingo;
    
    public Bingo(){
        this.lirikbingo = "\nThere was a farmer who had a dog, \nAnd Bingo was his name-o.";
        this.bingo = "B-I-N-G-O";
    }
    
    public void nyanyikanLaguBingo(){
        for (int i = 0; i <= 5; i++){
            System.out.println(lirikbingo);
            for (int j = 0; j < 3; j++){
                for (int k = 0; k < i; k++){
                    System.out.print("(Clap)");
                }
                if (i < 5){
                    System.out.println(bingo.substring(i * 2));
                } else {
                    System.out.println();
                }
            }
            System.out.println("And Bingo was his name-o. \n");
        }
    }
}
