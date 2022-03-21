package juego;

import javax.swing.ImageIcon;

public class CARTA {

	//***************************************************************************************
	//								DECLARACIONES VARIAS
	//***************************************************************************************

	private int numero;
	private int valor;
	private int palo;
	// para los palos: 1 = treboles (clubs), 2 = diamantes (diamonds), 3 = corazones(hearts) 4 = picas(spades)
	private ImageIcon icono = new ImageIcon();
	
	
	//***************************************************************************************
	// 									CONSTRUCTORES
	//***************************************************************************************

	public CARTA () {
		this.numero = 0;
		this.valor = 0;
		this.palo = 0;
	}
	
	public CARTA (CARTA c) {
		this.numero = c.numero;
		this.valor = c.valor;
		this.palo = c.palo;
	}
	
	public CARTA ( int numero,
				   int palo) {
		
		this.numero = numero;
		this.valor = darValor(numero);
		this.palo = palo;
		
	}
	
	//***************************************************************************************
	//										FUNCIONES
	//***************************************************************************************

	/**
	 * 
	 * Recibe un numero de carta y devuelve el valor que le corresponda a esta
	 * 
	 * @param numero (numero de carta)
	 * @return valor (valor correspondiente) 
	 */
	public int darValor (int numero) {
		if (numero > 10) {
			return 10;
		} else {
			return numero;
		}
		
	}
	
	/**
	 * Busca en la carpeta baraja y elige la carta con el palo y el numero correspondiente. 
	 * 
	 * 
	 */
	public void iconoCarta () {
		
		String paloString = Integer.toString(palo);
		String numeroString = Integer.toString(numero);
		
		String cadena = "BARAJA/" + paloString + "_" + numeroString + ".png"; 
		this.icono = new ImageIcon(cadena);
		
		this.icono = JOSUTECA.tamañoIcono(this.icono, 111, 145);
		}
	
	//***************************************************************************************
	//									GETTER + SETTER
	//***************************************************************************************

	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	public int getPalo() {
		return palo;
	}
	public void setPalo(int palo) {
		this.palo = palo;
	}
	public ImageIcon getIcono() {
		return icono;
	}

	public void setIcono(ImageIcon icono) {
		this.icono = icono;
	}
	
	
	
	
}
