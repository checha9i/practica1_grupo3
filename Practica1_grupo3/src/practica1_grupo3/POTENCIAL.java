/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1_grupo3;

/**
 *
 * @author Jorge
 */
public class POTENCIAL 
{
    
    public POTENCIAL (int NumeroBase)
    {
        int resultado = Pot(NumeroBase);
        System.out.println(NumeroBase + " elevado a la 2 es igual a " + resultado);
    }
    
    int Pot (int NumeroBase)
    {
        int resultado = (int) Math.pow(NumeroBase, 2);
        return resultado;
    }
    
    public double potenciaCUBICA(double valor){
        return Math.pow(valor, 3);
    }
    
}
