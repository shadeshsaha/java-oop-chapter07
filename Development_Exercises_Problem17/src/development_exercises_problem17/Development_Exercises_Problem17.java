/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package development_exercises_problem17;

/**
 *
 * @author Shadesh
 */

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Development_Exercises_Problem17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int min = 0;
        int max = 9;
        
        System.out.print("Enter first input: ");
        int i1 = sc.nextInt();
        
        System.out.print("Enter second input: ");
        int i2 = sc.nextInt();

        System.out.print("Enter third input: ");
        int i3 = sc.nextInt();
        
        int r1 = ThreadLocalRandom.current().nextInt(min, max + 1);
        int r2 = ThreadLocalRandom.current().nextInt(min, max + 1);
        int r3 = ThreadLocalRandom.current().nextInt(min, max + 1);
        
        Development_Exercises_Problem17 obj = new Development_Exercises_Problem17();
        String m1 = obj.checkMatch(r1, r2, r3, i1, 1);
        String m2 = obj.checkMatch(r1, r2, r3, i2, 2);
        String m3 = obj.checkMatch(r1, r2, r3, i3, 3);
        System.out.println(r1 + " " + r2 + " " + r3);
        System.out.println(m1 + " " + m2 + " " + m3);

    }
    
    public String checkMatch(int r1, int r2, int r3, int input, int position) {
        String message = "";
        
        if(position == 1) {
            if(r1 == input) {
                message = "Fermi";
            }
            else if(r2 == input || r3 == input) {
                message = "Pico";
            }
            else {
                message = "Nano";
            }
        }
        else if(position == 2) {
            if(r2 == input) {
                message = "Fermi";
            }
            else if(r1 == input || r3 == input) {
                message = "Pico";
            }
            else {
                message = "Nano";
            }
        }
        else if(position == 3) {
            if(r3 == input) {
                message = "Fermi";
            }
            else if(r1 == input || r2 == input) {
                message = "Pico";
            }
            else {
                message = "Nano";
            }
        }
        return message;
    }				
}
