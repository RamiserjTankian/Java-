/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class Practica1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        float []estudiantes = new float [50];
        int []cedula = new int [50];
        float []genero = new float [50];
        float []trabajo = new float [50];
        float []sueldo = new float [50];
        
        int estu= 0;
        System.out.print("Ingresa el numero de estudiantes a registrar: ");
        estu = scanner.nextInt();
                 
        if( estu  <= 50) {                     
        }else
             System.out.print("Imposible registrar mas de 50 estudiantes");
                             
        System.out.print("Ingresa los datos por orden (ENTER) para continuar:");
           for (int c=0;c<estu;c++);
           System.out.print("Ingresa la CEDULA");
           cedula [c] = scanner.nextInt();
           
           
                



        
    }
}
    
 
