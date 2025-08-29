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
public class CheckingAge {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter YOur Age:");
        int p1 = input.nextInt();
        if (p1 <= 17 && p1 >= 5) {
            System.out.println("Your not Allowed To vote");
        } else if (p1 >= 18 && p1 < 100) {
            System.out.println("Your Allowed To vote");
        }else {
            System.out.println("Invalid Number");
        }
    }
}
