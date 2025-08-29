/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.jirex;
import java.util.Scanner;


/**
 *
 * @author CL3-PC30
 */
public class jir {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("ROck [ 1 ]");
        System.out.println("Paper [ 2 ]");
        System.out.println("Scissors [ 3 ]");
        System.out.println("Enter Player 1:");
        int p1 = input.nextInt();
        System.out.println("Enter Player 2:");
        int p2 = input.nextInt();
        
        if (p1 == 1 && p2 == 1) {
            System.out.println("draw");
            
        } else if (p1 == 1 && p2 == 2) {
            System.out.println("Player 2 Win");
            
        }else if (p1 == 1 && p2 == 3) {
            System.out.println("Player 1 win");
            
        }else if (p1 == 2 && p2 == 1) {
              System.out.println("Player 2 win");
            
        }else if (p1 == 2 && p2 == 2) {
              System.out.println("Draw");
            
        }else if (p1 == 2 && p2 == 3) {
              System.out.println("Player 1 win");
            
        }else if (p1 == 3 && p2 == 1) {
              System.out.println("Player 2 win");
            
        }else if (p1 == 3 && p2 == 2) {
              System.out.println("Player 1 win");
            
        }else if (1 == 3 && 2 == 3) {
              System.out.println("Draw");
        }else {
            System.out.println("Invalid Number");
        }
    }
}
