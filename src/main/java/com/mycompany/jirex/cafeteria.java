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
public class cafeteria {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        System.out.println("\n[1] - hotdog {10}");
        System.out.println("[2] - ham {20}");
        System.out.println("[3] - egg {15}");
        
        Scanner input = new Scanner(System.in);
        int order = 4;
       
        
        while (order >= 4) {
            System.out.println("Enter Your Order:");
            order = input.nextInt();
            
        }
        System.out.println("Enter Quantity:");
            int quantity = input.nextInt();

            float discount = 0.12f;
            double total = 0;
            if (order == 1) {
            total = quantity * 10;
            } else if (order == 2) {
                total = quantity * 20;
            } else if (order == 3) {
                total = quantity * 15;
            }
            System.out.println("Enter Age:");
            int age = input.nextInt();
            if (age >= 12 && age <= 18) {
                double discounted = total * discount;
                System.out.println("12% Discount:"+ discounted );
                total = total - discounted;
            }
            System.out.println("Total:" + total);
            double change = -1;

            while (change <= -1) {
                System.out.println("Enter payment:");
                int payment = input.nextInt();
                change = payment - total;

            } 
            if (change > 0) {
                System.out.println("Change:" + change);
            }
        
        
        
    }
}
