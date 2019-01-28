package calculadora;

import java.util.Scanner;
//Programa hecho por Juanjo Chica, hecho para el ejerciciode práctica de Git
public class Main {

	
	private static int a,b,opcion;
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		MenuCalculadora menu = new MenuCalculadora();
		opcion= menu.elegirOperacion();
		
		System.out.print("Introduzca el primer número a operar: ");
		a = sc.nextInt();
		System.out.print("Introduzca el segundo número a operar: ");
		b =sc.nextInt();
		
		if (opcion==1) {
		Suma sumar = new Suma();
		System.out.println("Suma= " + sumar.suma(a,b) );
		}
		if(opcion==2) {
		Resta operacionResta = new Resta();
		System.out.print("Resta= "+ operacionResta.restar(a,b));
		}
		if(opcion==3) {
			Multiplicacion operacion = new Multiplicacion();
			System.out.print("Multiplicación= "+ operacion.multiplicar(a,b));
			}
		if(opcion==4) {
			Division operacion = new Division();
			System.out.print("MDivision= "+ operacion.dividir(a,b));
			}
		
	}

}
