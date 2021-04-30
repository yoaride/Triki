package interfaz;

import java.util.*;
import mundo.*;

public class Interfaz {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Jugador j1 = new Jugador('X', 1);
		Jugador j2 = new Jugador('O', 2);
		Tablero t = new Tablero();
		Scanner scan = new Scanner(System.in);
		String posicion;
		int turno=1;
		boolean check1,checkw;
		
		t.impTablero();
		
		checkw = false;
		while (checkw==false) {
			switch (turno) {
			case 1:
				check1 = false;
				while (check1==false) {
					System.out.print(j1.darNombre()+" ingrese la posicion escojida: ");
					posicion = scan.next();
					check1 = t.modificar(posicion, j1.darMarca());
				}
				t.impTablero();
				checkw = t.win(j1.darMarca(), j1.darNombre());
				turno=2;
				break;
			case 2:
				check1 = false;
				while (check1==false) {
					System.out.print(j2.darNombre()+" ingrese la posicion escojida: ");
					posicion = scan.next();
					check1 = t.modificar(posicion, j2.darMarca());
				}
				t.impTablero();
				checkw = t.win(j2.darMarca(), j2.darNombre());
				turno=1;
				break;
			}
		}
		scan.close();
		
	}
	
}
