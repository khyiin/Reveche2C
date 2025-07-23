
package javaapplication29;

import java.util.Scanner;


public class JavaApplication29 {

    
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        
        String name;
        int year;
        
        System.out.print("Enter your name:");
        name = sc.nextLine();
        
        System.out.print("Enter birth year:");
        year= sc.nextInt();
        
        System.out.println("Hello "+name+" your age is "+(2025-year));
        
        if ((2025-year) >=18) {
           System.out.println("Votable");
         
        } else {
            System.out.println("Minority");
        }
        
        
    }
    
}
 