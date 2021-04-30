package mundo;

import java.util.*;

public class Jugador {
	
	private String nombre;
	private char marca;
	Scanner scan;
	
	public Jugador (char m, int num) {
		scan = new Scanner( System.in );
		System.out.print("Ingrese el nombre del jugador"+num+": ");
		nombre = scan.next();
		marca = m;
	}
	
	public char darMarca ( ) {
		return marca;
	}
	
	public String darNombre ( ) {
		return nombre;
	}

}
