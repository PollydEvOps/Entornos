package recu13;
import java.util.Scanner;
import java.util.regex.*;

public class Recu13 {
//pollyanna soares da silva
	public static void main(String[] args) {
				// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

		String cadena1, cadena2;
		String cadenaInvertida = "";// no puede ser numero por ser string
		System.out.println("Introduce la primera cadena: ");
		cadena1 = s.nextLine();

		System.out.println("Introduce la segunda cadena: ");
		cadena2 = s.nextLine();

		// Comprobamos si ambas cadenas contienen solo letras minúsculas
		if (!cadena1.matches("^[a-z]+$") || !cadena2.matches("^[a-z]+$")) {
		    System.out.println("¡ERROR! Las dos cadenas deben contener solo letras minúsculas.");
		} else {
			// Mostrar los caracteres de la segunda cadena en posiciones pares
            System.out.println("Caracteres de la segunda cadena en posiciones pares:");
            for (int i = 0; i < cadena2.length(); i++) {
                // Comprobamos si el índice es par
                if (i % 2 == 0) {
                    // Si el índice es par, mostramos el carácter
                    System.out.println(cadena2.charAt(i));
                }
}
}
	}
	}