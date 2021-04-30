package mundo;

public class Tablero {
	
	public char a1,a2,a3,b1,b2,b3,c1,c2,c3;
	
	public Tablero ( ) {
		a1 = '-';
		a2 = '-';
		a3 = '-';
		b1 = '-';
		b2 = '-';
		b3 = '-';
		c1 = '-';
		c2 = '-';
		c3 = '-';
	}
	
	public boolean modificar (String p, char m) {
		boolean check;
		if (p.equals("a1") && a1=='-') {
			a1=m; check = true;
		}
		else if (p.equals("b1") && b1=='-') {
			b1=m; check = true;
		}
		else if (p.equals("c1") && c1=='-') {
			c1=m; check = true;
		}
		else if (p.equals("a2") && a2=='-') {
			a2=m; check = true;
		}
		else if (p.equals("b2") && b2=='-') {
			b2=m; check = true;
		}
		else if (p.equals("c2") && c2=='-') {
			c2=m; check = true;
		}
		else if (p.equals("a3") && a3=='-') {
			a3=m; check = true;
		}
		else if (p.equals("b3") && b3=='-') {
			b3=m; check = true;
		}
		else if (p.equals("c3") && c3=='-') {
			c3=m; check = true;
		}
		else {
			System.out.println("Esa posicion no es valida o ya fue escojida ingrese una direccion valida");
			check = false;
		}
		
		return check;
	}
	
	public boolean win ( char m, String n) {
		boolean flag;
		if ((a1==m && b1==m && c1==m) || (a2==m && b2==m && c2==m) || (a3==m && b3==m && c3==m)) {
			flag = true;
			System.out.println("El jugador "+n+" es el ganador\n 　　　FELICITACIONES!!!!!!");
		}else if ((a1==m && a2==m && a3==m) || (b1==m && b2==m && b3==m) || (c1==m && c2==m && c3==m)) {
			flag = true;
			System.out.println("El jugador "+n+" es el ganador\n 　　　FELICITACIONES!!!!!!");
		}else if ((a1==m && b2==m && c3==m) || (a3==m && b2==m && c1==m)) {
			flag = true;
			System.out.println("El jugador "+n+" es el ganador\n 　　　FELICITACIONES!!!!!!");
		}else if(a1!='-' && a2!='-' && a3!='-' && b1!='-' && b2!='-' && b3!='-' && c1!='-' && c2!='-' && c3!='-') {
			flag = true;
			System.out.println("　　　EMPATE!!!!!! bien jugado");
		}else {
			flag = false;
		}
		return flag;
	}
	
	public void impTablero () {
		System.out.println(" 	 a b c \n");
		System.out.println("1	|"+a1+"|"+b1+"|"+c1+"|");
		System.out.println("2	|"+a2+"|"+b2+"|"+c2+"|");
		System.out.println("3	|"+a3+"|"+b3+"|"+c3+"|");
	}
}
