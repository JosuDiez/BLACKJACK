package juego;

import java.util.ArrayList;

public class MANO {

	
	ArrayList<CARTA> cartas = new ArrayList<>();
	int puntuacion = 0;
	
	public MANO () {
		
	}
	
	
	//***************************************************************************************
	//										FUNCIONES	
	//***************************************************************************************

	/**
	 * 
	 * añade una carta a la mano
	 * 
	 * @param un objeto carta (la carta a añadir)
	 */
	public void añadirCarta (CARTA c) {
		cartas.add(c);
	}
	
	/**
	 * 
	 * Elimina todas las cartas de la mano
	 */
	public void vaciarMano () {
		cartas.removeAll(cartas);
	}

	/**
	 * 
	 * Calcula la puntuacion de la mano
	 *  
	 * Recorre el arraylist sumando la puntuacion de cada carta
	 */
	public void calcularPuntuacion () {
		this.puntuacion = 0;
		for (CARTA cart: cartas) {
			this.puntuacion = this.puntuacion + cart.getValor();
		}
	}
	
	/**
	 * 
	 * Pasa por todas las cartas poniendoles los iconos correspondientes
	 */
	public void iconos () {
		for (int i = 0; i < cartas.size(); i++) {
			cartas.get(i).iconoCarta();
		}
	}

	//***************************************************************************************
	//									GETTER + SETTER
	//***************************************************************************************

	public ArrayList<CARTA> getCartas() {
		return cartas;
	}

	public void setCartas(ArrayList<CARTA> cartas) {
		this.cartas = cartas;
	}

	public int getPuntuacion() {
		return puntuacion;
	}

	public void setPuntuacion(int puntuacion) {
		this.puntuacion = puntuacion;
	}
	
//***************************************************************************************
	
}

