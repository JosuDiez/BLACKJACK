package juego;

import java.util.ArrayList;

public class BARAJA {

	//***************************************************************************************
	// 								DECLARACIONES VARIAS
	//***************************************************************************************

	ArrayList<CARTA> cartas = new ArrayList<>();

	//***************************************************************************************
	//									 CONSTRUCTORES	
	//***************************************************************************************

	public BARAJA () {
		
		rellenar();
	}
	
	//***************************************************************************************
	//										FUNCIONES
	//***************************************************************************************

	
	/**
	 * 
	 * inserta una copia de cada carta de la baraja en el arraylist (en orden)
	 */
	public void rellenar () {
		
		for (int i = 1; i <= 4;i++ ) {
			
			
			for (int j = 1; j <= 13; j++) {
				
				CARTA carta = new CARTA(j,i);
				cartas.add(carta);
			}
		}
	}
	
	/**
	 * 
	 *  Randomiza las posiciones de las cartas dentro del arraylist
	 */
	public void barajar () {
		int posicion = 0;
		int numero = cartas.size();
		numero = numero - 2;
		for (int i = 0; i < cartas.size(); i++) {
						
			posicion = JOSUTECA.generadorNumeros(0, numero);
			cartas.set(posicion,( cartas.set(i, cartas.get(posicion)) ));
			
			
		}
	}
	
	/**
	 * 
	 * elimina la carta que se le pasa del array
	 * @param objeto  carta
	 */
	public void quitarCarta (CARTA c) {
		cartas.remove(c);
	}
	
	/**
	 * elimina la carta que se le indique
	 * @param numero de la carta 
	 */
	public void quitarCarta (int n) {
		cartas.remove(n);
	}
	
	/**
	 * 
	 * vacia por completo la baraja
	 */
	public void vaciar () {
		cartas.removeAll(cartas);
	}
	
	/**
	 * 
	 *  te permite cojer la primera carta de la baraja. 
	 *  Elimina la primera carta del arraylist y la devuelve en el return
	 * @return la carta en la posicion 0
 	 */
	
	public CARTA cojerCarta () {
		CARTA carta = new CARTA();
		carta = cartas.get(0);
		cartas.remove(0);
		
		return carta;
	}
	
}
