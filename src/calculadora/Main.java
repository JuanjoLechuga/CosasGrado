package calculadora;

import java.util.Scanner;
//Programa hecho por Juanjo Chica, hecho para el ejerciciode pr�ctica de Git
public class Main {

	
	private static int a,b,opcion;
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		MenuCalculadora menu = new MenuCalculadora();
		opcion= menu.elegirOperacion();
		
		System.out.print("Introduzca el primer n�mero a operar: ");
		a = sc.nextInt();
		System.out.print("Introduzca el segundo n�mero a operar: ");
		b =sc.nextInt();
		
		if (opcion==1) {
		Suma sumar = new Suma();
		System.out.println("Suma= " + sumar.suma(a,b) );
		}
		if(opcion==2) {
		Resta operacionResta = new Resta();
		System.out.print("Resta= "+ operacionResta.restar(a,b));
		}

	}

}
