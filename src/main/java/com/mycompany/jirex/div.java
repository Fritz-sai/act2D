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
public class div {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
         Scanner input = new Scanner(System.in);
        System.out.println("Enter First Number:");
        int p1 = input.nextInt();
        System.out.println("Enter Second Number 2:");
        int p2 = input.nextInt();
        
        int result = p1 / p2;
        System.out.println("Result:" + result);
    }
}
