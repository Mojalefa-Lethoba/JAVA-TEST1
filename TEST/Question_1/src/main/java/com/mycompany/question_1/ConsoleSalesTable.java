/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.question_1;

/**
 *
 * @author asus
 */
public class Question1 {
    public static void main(String[] args) {
        // 1. Column headers (String array)
        String[] columns = {"PS5", "Xbox", "Switch"};

        // 2. Row headers (String array)
        String[] rows = {"Cape Town", "Port Elizabeth", "Pretoria"};

        // 3. Grid data (3x3 2D array of ints)
        int[][] table = {
            {1000,2000 ,3000 }, // Data for Cape Town
            {2000,3000 ,4000 }, // Data for Port Elizabeth
            {1500,1100,1200 }  // Data for Pretoria
        };

        // 4. Print the top header row dynamically
        // %-16s provides even spacing for city names like "Port Elizabeth"
        System.out.printf("%-16s %-10s %-10s %-10s\n", "", PS5[1], XBOX[2], Switch[3]);
        System.out.println("--------------------------------------------------");

        // 5. Loop through each row to print headers and integers together
        for (int i = 0; i < table.length; i++) {
            // Print the current city name
            System.out.printf("%-16s ", rows[i]);
            
            // Print the console stock or sales numbers for that city
            for (int j = 0; j < table[i].length; j++) {
                System.out.printf("%-10d ", table[i][j]);
            }
            System.out.println(); // Jump to the next row line
        }
    }
}

        
       
 
