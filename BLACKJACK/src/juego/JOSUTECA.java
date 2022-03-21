package juego;

import java.awt.Image;

import javax.swing.ImageIcon;

public class JOSUTECA {
	
	/*
	 * public static String generadorCodigos(int numberOfWords) { String[]
	 * randomStrings = new String[numberOfWords]; Random random = new Random(); for
	 * (int i = 0; i < numberOfWords; i++) { char[] word = new
	 * char[random.nextInt(8) + 3]; // words of length 3 through 10. (1 and 2 letter
	 * words are // boring.) for (int j = 0; j < word.length; j++) { word[j] =
	 * (char) ('a' + random.nextInt(26)); } randomStrings[i] = new String(word); }
	 * 
	 * String ret = randomStrings.toString(); ret =
	 * ret.replaceAll("Ljava.lang.String;@", ""); return ret; }
	 */

//***********************************************************************************************************************************************	
//GENERA CODIGOS (STRING) DEL TAMAÑO QUE SE LE INDIQUE. LETRAS + NUMEROS 	
	public static String generadorCodigos(int n) {
		char[] cadena = new char[n];

		for (int i = 0; i < n; i++) {
			cadena[i] = (char) (generadorNumeros(97, 121));
		}
		String ret = cadena.toString();
		return ret.replaceAll("C@", "");

	}

//***********************************************************************************************************************************************
//GENERA NOMBRES (STRING) DEL TAMAÑO QUE SE LE INDIQUE. SOLO LETRAS	
	public static String generadorNombres(int n) {
		char[] cadena = new char[n];

		for (int i = 0; i < n; i++) {
			cadena[i] = (char) (generadorNumeros(97, 121));
		}

		return String.valueOf(cadena);

	}

//***********************************************************************************************************************************************
//GENERA PRECIOS (DOUBLE) DE 0 A 100. CON DOS DIGITOS (CENTIMOS)	
	public static double generadorPrecios() {

		double random = (Math.random() * (Math.random() * 100));
		double round = Math.round(random * 100);
		return round / 100;
	}

//***********************************************************************************************************************************************
//GENERA NUMEROS (INT) EN EL RANGO QUE SE LE INDIQUE. INI ES EL LIMITE INFERIOR Y FIN EL LIMITE SUPERIOR	
	public static int generadorNumeros(int ini, int fin) {

		int z = fin - ini;
		int o = 0;

		while (z > 0) {
			o++;
			z = z / 10;
		}

		int multi = 1;
		for (int i = 1; i < o; i++) {
			multi = multi * 10;
		}

		int n = fin++;

		do {
			n = (int) (((Math.random() * (multi * 10))) + ini);

		} while (n > fin);

		return n;
	}

//***********************************************************************************************************************************************
//GENERA UN BOOLEANO ALEATORIO. TRUE/FALSE	
	public static boolean generadorbooleano() {
		int n = (int) (Math.random() * 10);
		if (n > 5) {
			return true;
		} else {
			return false;
		}
	}


//***********************************************************************************************************************************************
//CAMBIA EL TAMAÑO DE UN ICONO 

	public static ImageIcon tamañoIcono (ImageIcon icono, int ancho, int alto) {
		
		
		Image imagen = icono.getImage();
		Image imagenEditada = imagen.getScaledInstance(ancho, alto, java.awt.Image.SCALE_SMOOTH) ;
		icono = new ImageIcon(imagenEditada);
		return icono;
	}
}
//***********************************************************************************************************************************************

	
	