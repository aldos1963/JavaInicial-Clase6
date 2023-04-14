package Clase6;



public class MiCalculadora {

	public static void main(String[] args) {
		
		double resultado;
		
		System.out.print("80 x 3 = ");
		resultado = Calculadora.Multiplicar(80, 3);
		System.out.println(resultado);
		
		System.out.print("(150 + 180) / 3 = ");
		resultado = Calculadora.Dividir((Calculadora.Sumar(150, 180)),3);
		System.out.println(resultado);
		
		System.out.print("(90 - 50) * 15 = ");
		resultado = Calculadora.Multiplicar((Calculadora.Restar(90, 50)),15);
		System.out.println(resultado);
		
		System.out.print("(70 + 40) * 25 = ");
		resultado = Calculadora.Multiplicar((Calculadora.Sumar(70, 40)),25);
		System.out.println(resultado);
		
		

	}

}
