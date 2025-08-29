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
public class operations {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("ADDITION [1]");
        System.out.println("SUBTRACTION [2]");
        System.out.println("DIVISION [3]");
        System.out.println("MULTIPLICATION [4]");
        System.out.println("Enter Operation:");
        int p1 = input.nextInt();
        if(p1 == 1) {
            System.out.println("Enter First Number:");
            int num1 = input.nextInt();
            System.out.println("Enter Second Number 2:");
            int num2 = input.nextInt();
        
            int result = num1 + num2;
            System.out.println("Result:" + result);
        } else if(p1 == 2) {
            System.out.println("Enter First Number:");
            int num1 = input.nextInt();
            System.out.println("Enter Second Number 2:");
            int num2 = input.nextInt();
        
            int result = num1 - num2;
            System.out.println("Result:" + result);
        }else if(p1 == 3) {
            System.out.println("Enter First Number:");
            int num1 = input.nextInt();
            System.out.println("Enter Second Number 2:");
            int num2 = input.nextInt();
        
            float result = num1 / num2;
            System.out.println("Result:" + result);
        }else if(p1 == 4) {
            System.out.println("Enter First Number:");
            int num1 = input.nextInt();
            System.out.println("Enter Second Number 2:");
            int num2 = input.nextInt();
        
            int result = num1 * num2;
            System.out.println("Result:" + result);
        }else {
             System.out.println("Invalid Operation Number" );
        }
    }
}
