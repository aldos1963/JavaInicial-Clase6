package Clase6;

public class Calculadora {
	
	public static double Sumar(double unNumero, double otroNumero) {
    	return unNumero + otroNumero;
	}
	
    public static double Restar(double unNumero, double otroNumero) {
    	return unNumero - otroNumero;
	}

    public static double Multiplicar(double unNumero, double otroNumero) {
    	return unNumero * otroNumero;
	}
    
    public static double Dividir (double unNumero, double otroNumero) {
    	if (otroNumero == 0) {
    		System.out.println("No es posible una división por cero.");
    	    return 0.00;}
        else
    		{return unNumero / otroNumero;}
 	 }
    	    
  }
  

