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
    public int POTENCIAL (int NumeroBase)
    {
        int resultado = Pot(NumeroBase);
        return resultado;
    }
    int Pot (int NumeroBase)
    {
        int resultado = (int) Math.pow(NumeroBase, 2);
        return resultado;
    }
    
    double Multiplicacion(double n1,double n2){
        return n1*n2;
    }
    double Division(double n1,double n2){
        if(n2==0) return -1;
        return n1/n2;
    }
   
    public double potenciaCUBICA(double valor){
        return Math.pow(valor, 3);
    }
	
    public float RaizCuadrada(double numero){
        float resultado1 = (float) Math.round(Math.sqrt(numero));
        return resultado1;
    }

    public double raizCubica(double valor)
    {
        float retorno=(float) Math.round(Math.cbrt(valor)); 
        return retorno;
    }
}
