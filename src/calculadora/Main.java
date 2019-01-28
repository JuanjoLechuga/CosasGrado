package calculadora;

import java.util.Scanner;

public class Main {

	
	private static int a,b;
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca el primer número a operar: ");
		a = sc.nextInt();
		System.out.print("Introduzca el segundo número a operar: ");
		b =sc.nextInt();
		
		Suma sumar = new Suma();
		System.out.println("Suma= " + sumar.suma(a,b) );
		
		Resta operacionResta = new Resta();
		System.out.print("Resta= "+ operacionResta.restar(a,b));
		

	}

}
