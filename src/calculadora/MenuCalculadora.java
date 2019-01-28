package calculadora;

import java.util.Scanner;

public class MenuCalculadora {
	private static int opcion;
	
	public int elegirOperacion() {
		Scanner sc = new Scanner(System.in);
		System.out.println("1.- Sumar   2.-Restar   3.-Multiplicacion    4.- Division");
		opcion=sc.nextInt();
		return opcion;
	}

}
