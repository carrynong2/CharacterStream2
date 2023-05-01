/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package characterstream2;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class LAB5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = s.nextLine();
        System.out.println("Hello " + name);
        System.out.print("Enter your weight: ");
        double w = s.nextDouble();
        System.out.print("Enter your height: ");
        double h = s.nextDouble();
        System.out.println(w * h);
    }

}
