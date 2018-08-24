/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1_grupo3;

/**
 *
 * @author Javier
 */
public class FACTORIAL {
      public double factorial (double numero){
        double factorial = 1;     
        
          while ( numero!=0) {
            factorial=factorial*numero;
            numero--;
          }
          System.out.println(factorial);
        
    return  factorial;
    }
}
