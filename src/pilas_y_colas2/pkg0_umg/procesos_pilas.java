/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilas_y_colas2.pkg0_umg;

import java.util.LinkedList;
import java.util.Random;
import java.util.Stack;

/**
 *
 * @author Geovany Vasquez
 */
public  class procesos_pilas {
    
     public static void numerosr(){
     Stack pila = new Stack();
     Random ran = new Random();
        int u = 0;
        int desde = -10000000, hasta = 10000000;
        //int array[];
        //array = new int[1000000];
        pila.push(Integer.toString(u));
       // int numero[];
       // numero = new int[1000000];
        for (int i = 0; i <= 1000000; i++) {
            u = ran.nextInt(hasta - desde + 1) + desde;
               pila.push(Integer.toString(u));
            //array[i] = u;
            //System.out.println(i + ",  " + array[i]);
            while (!pila.empty()){
            pila.pop();
            }
            
        }
 }
  public static void numerosc(){
   LinkedList cola=new LinkedList();//Usamos LinkedList
   Random ran = new Random();
        int u = 0;
          int desde = -10000000, hasta = 10000000; 
              for (int i = 0; i <= 1000000; i++) {
            u = ran.nextInt(hasta - desde + 1) + desde;
            cola.add(u);
               
        System.out.println("Cola llena: " + cola);
        
        while(cola.poll()!=null){      
            cola.peek();        
        }        
        System.out.println(cola.peek());   
    }
  
  }
}
