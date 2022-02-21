/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilas_y_colas2.pkg0_umg;

import java.util.Scanner;
import pilas_y_colas2.pkg0_umg.procesos_pilas;
/**
 *
 * @author Geovany Vasquez
 */
public class Pilas_y_colas20_UMG extends procesos_pilas {
public static void menu() {
        Scanner in = new Scanner(System.in);
        int a;
        do {

            System.out.println("1, pilas");
            System.out.println("2, colas");
            System.out.println("3, salir");
            System.out.println("Digite opcion: ");
            a = in.nextInt();

            switch (a) {
                case 1: 
                    numerosr();
                    break;
                   
                case 2:
                    numerosc();
                   break;
            }
        } while (a != 3);
    }

    /**
     * @param args the command line arguments
     */
 
    public static void main(String[] args) {
   // TODO code application logic here
       menu();
       
    }
}

 