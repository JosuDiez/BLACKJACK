package juego;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class partida extends JFrame implements ActionListener{

	//***************************************************************************************
	//									DECLARACIONES VARIAS
	//***************************************************************************************

	JButton btnPlantarse;
	JButton btnMano;
	JButton btnPEDIR;
	JLabel lblTexto;
	JButton btnManoCrupier;
	JMenuItem mntmNuevaPartida;
	JMenu mnSalir;
	JMenuItem mntmMenu;
	JMenuItem mntmSalir;
	
	MANO manoJugador = new MANO();
	MANO manoCrupier = new MANO();
	
	BARAJA baraja = new BARAJA();
	
	VerMano vermano = new VerMano();
	VerMano vermanoCrupier = new VerMano();
		
	boolean plantado = false;
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4525435837890497724L;
	private JPanel contentPane;
	private JLabel lblCrupier;
	private JLabel lblCrupierAccion;
	private JLabel lblPuntiacion;
	private JLabel lblPuntuacionCrupier;
	private JLabel lblImagenCrupier;
	
	
	static partida frame = new partida();

	//***************************************************************************************
	//										MAIN
	//***************************************************************************************

	
	/**
	 * Iniciliza la partida
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					 frame = new partida();
					ImageIcon icono = new ImageIcon("mesa.jpg");
					frame.getContentPane().add(new JLabel(icono));
					frame.setVisible(true);
					frame.setResizable(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	//***************************************************************************************
	//									CONSTRUCTOR
	//***************************************************************************************

	
	public partida() {
		
		
		baraja.barajar();
		
		manoJugador = new MANO();
		manoCrupier = new MANO();
		
		manoJugador.añadirCarta(baraja.cojerCarta()); 
		manoJugador.añadirCarta(baraja.cojerCarta()); 
		
		manoCrupier.añadirCarta(baraja.cojerCarta()); 
		manoCrupier.añadirCarta(baraja.cojerCarta()); 
		
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		setBounds(100, 100, 593, 384);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Partida");
		menuBar.add(mnNewMenu);
		
		 mntmNuevaPartida = new JMenuItem("Nueva partida");
		mnNewMenu.add(mntmNuevaPartida);
		mntmNuevaPartida.addActionListener(this);
		
		 mnSalir = new JMenu("Salir");
		menuBar.add(mnSalir);
		
		
		 mntmMenu = new JMenuItem("Volver al menu");
		mnSalir.add(mntmMenu);
		mntmMenu.addActionListener(this);
		
		 mntmSalir = new JMenuItem("Salir");
		 mntmSalir.addActionListener(this);
		mnSalir.add(mntmSalir);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnPEDIR = new JButton("Pedir carta");
		
		btnPEDIR.addActionListener(this);
		 
		 lblPuntuacionCrupier = new JLabel("New label");
		 lblPuntuacionCrupier.setBounds(478, 144, 45, 13);
		 contentPane.add(lblPuntuacionCrupier);
		 
		 lblPuntiacion = new JLabel("New label");
		 lblPuntiacion.setBounds(478, 108, 45, 13);
		 contentPane.add(lblPuntiacion);
		 
		 lblCrupierAccion = new JLabel("Esperando");
		 lblCrupierAccion.setHorizontalAlignment(SwingConstants.CENTER);
		 lblCrupierAccion.setBounds(187, 14, 152, 13);
		 contentPane.add(lblCrupierAccion);
		 
		 lblCrupier = new JLabel("CRUPIER:");
		 lblCrupier.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		 lblCrupier.setHorizontalAlignment(SwingConstants.CENTER);
		 lblCrupier.setBounds(10, 13, 269, 13);
		 contentPane.add(lblCrupier);
		
		 lblTexto = new JLabel("INICIO");
		 lblTexto.setHorizontalAlignment(SwingConstants.CENTER);
		 lblTexto.setBounds(70, 303, 416, 13);
		 contentPane.add(lblTexto);
		btnPEDIR.setBounds(34, 261, 102, 21);
		contentPane.add(btnPEDIR);
		
		 btnPlantarse = new JButton("Plantarse");
		btnPlantarse.setBounds(155, 261, 109, 21);
		contentPane.add(btnPlantarse);
		
		btnPlantarse.addActionListener(this);
		
		 btnMano = new JButton("Ver mano");
		btnMano.setBounds(424, 261, 118, 21);
		contentPane.add(btnMano);
		
		 btnManoCrupier = new JButton("Mano Crupier");
		btnManoCrupier.setBounds(281, 261, 125, 21);
		contentPane.add(btnManoCrupier);
		btnManoCrupier.addActionListener(this);
		
		JLabel lblNewLabel = new JLabel("PUNTUACION:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(355, 108, 90, 13);
		contentPane.add(lblNewLabel);
		
		JLabel lblCrupier_1 = new JLabel("CRUPIER:");
		lblCrupier_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblCrupier_1.setBounds(355, 144, 90, 13);
		contentPane.add(lblCrupier_1);
		
		lblImagenCrupier = new JLabel("");
		lblImagenCrupier.setBounds(45, 78, 234, 145);
		contentPane.add(lblImagenCrupier);
		
		ImageIcon ImagenCrupier = new ImageIcon("imagenes/crupier.png");
		ImagenCrupier = JOSUTECA.tamañoIcono(ImagenCrupier, 234, 145);
		lblImagenCrupier.setIcon(ImagenCrupier);
		
		
		
		btnMano.addActionListener(this);
		
		manoJugador.calcularPuntuacion();
		manoCrupier.calcularPuntuacion();
		lblPuntiacion.setText(Integer.toString(manoJugador.getPuntuacion()));  
		lblPuntuacionCrupier.setText(Integer.toString(manoCrupier.getPuntuacion()));
		
		vermano.setTitle("Mano Jugador");
		vermanoCrupier.setTitle("Mano Crupier");
	}

	//***************************************************************************************
	//									ACTION PERFORMER
	//***************************************************************************************

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		//++++++++++++++++++++++++++++++++++++++++++++++++++++
		//boton pedir: coje una carta de la baraja y la añade a la mano del jugador
		if (e.getSource().equals(btnPEDIR) && !plantado) {
			int numero = manoJugador.cartas.size() + 1; 
			lblTexto.setText("Pides carta numero " + numero);
			
			manoJugador.añadirCarta(baraja.cojerCarta());
			crupier();
			
			actualizarMano(vermano, manoJugador);
			actualizarMano(vermanoCrupier, manoCrupier);
		//++++++++++++++++++++++++++++++++++++++++++++++++++++
		//boton mano: crea una ventana vermano de jugador si esta no existe
		} else if (e.getSource().equals(btnMano)) {
			
			actualizarMano(vermano, manoJugador);
			vermano.setLocation( 650,100 );
			vermano.setVisible(true);
		//++++++++++++++++++++++++++++++++++++++++++++++++++++
		//boton mano crupier: crea una ventana vermano de crupier si esta no existe
		} else if (e.getSource().equals(btnManoCrupier)) {
			
			actualizarMano(vermanoCrupier, manoCrupier);
			vermanoCrupier.setLocation( 650,100 );
			vermanoCrupier.setVisible(true);
		//++++++++++++++++++++++++++++++++++++++++++++++++++++
		// boton plantarse: impide que el jugador siga pidiendo cartas y determina quien a ganado	
		} else if (e.getSource().equals(btnPlantarse)) {
			lblTexto.setText("Te has plantado");
			
			
			//------------------------------------
			//Sistema que permite al crupier continuar jugando hasta acabar la partida
			  while (manoCrupier.getPuntuacion() <= 16) {
				  crupier(); // funcion que controla las acciones del crupier
				  }
			 //-----------------------------------
			 //Comprueba quien a ganado a traves de ganador(), añade a la puntuacion del main una victoria o derrota dependiendo del resultado	y cambia el texto
			if (!plantado) {	
				if (ganador()) {
					lblTexto.setText("has ganado"); 
					MAIN.frame.ganadas = MAIN.frame.ganadas + 1; //cambia el contador de ganadas 
					MAIN.frame.lblGanadas.setText(Integer.toString(MAIN.frame.ganadas)); // actualiza la etiqueta ganadas del main
			 	
				} else {
					lblTexto.setText("has perdido"); 
					MAIN.frame.perdidas = MAIN.frame.perdidas + 1; // cambia el contador de perdidas
					MAIN.frame.lblPerdidas.setText(Integer.toString(MAIN.frame.perdidas)); // actualiza la etiqueta perdidas del main
				}
			 //-----------------------------------		
			}
			
			plantado = true; // activa un booleano que impedira al jugador continuar jugando despues de plantarse
		//++++++++++++++++++++++++++++++++++++++++++++++++++++
		//boton salir (MENU): cierra la aplicacion
		} else if (e.getSource().equals(mntmSalir)) {
			System.exit(0);
		//++++++++++++++++++++++++++++++++++++++++++++++++++++
		//boton menu (MENU): vuelve a hacer el main visible y cieera esta partida	
		} else if (e.getSource().equals(mntmMenu)) {
			MAIN.frame.setVisible(true);
			this.dispose();
		//++++++++++++++++++++++++++++++++++++++++++++++++++++
		//boton nueva partida (MENU): Llama a la funcion nuevaPartida	
		} else if (e.getSource().equals(mntmNuevaPartida)) {
			
			MAIN.frame.nuevaPartida();//cierra la partida actual en caso de que haya alguna y habre una nueva
		}
		//++++++++++++++++++++++++++++++++++++++++++++++++++++
		//Seccion que se activa con cualquier boton
		manoJugador.calcularPuntuacion(); 
		 //-----------------------------------		
		 //Comprueba que le jugador no se pase de 21
		if (manoJugador.getPuntuacion() > 21 && !plantado) {
			lblTexto.setText("has perdido");
			plantado = true;
			MAIN.frame.perdidas = MAIN.frame.perdidas + 1;
			MAIN.frame.lblPerdidas.setText(Integer.toString(MAIN.frame.perdidas));
			
		}
		 //-----------------------------------		

		lblPuntiacion.setText(Integer.toString(manoJugador.getPuntuacion())); //actualiza la etiqueta con la puntuacion del jugador  
		lblPuntuacionCrupier.setText(Integer.toString(manoCrupier.getPuntuacion())); //actualiza la etiqueta con la puntuacion del crupier  

		//++++++++++++++++++++++++++++++++++++++++++++++++++++
	}
	
	//***************************************************************************************
	//									FUNCIONES
	//***************************************************************************************

	//++++++++++++++++++++++++++++++++++++++++++++++++++++
	/**
	 * Funcion que controla las acciones del crupier. En caso de que su puntuacion sea menor de 16 coje otra carta de lo contrario se planta
	 */
	public void crupier () {
		manoCrupier.calcularPuntuacion();
		if (manoCrupier.getPuntuacion() <= 16) {
			
			manoCrupier.añadirCarta(baraja.cojerCarta()); 
			lblCrupierAccion.setText("Coje Carta");

		} else if (manoCrupier.getPuntuacion() > 16) {
			lblCrupierAccion.setText("Plantado");
		}
	}

	//++++++++++++++++++++++++++++++++++++++++++++++++++++
	/**
	 * Comprueba cuantos puntos les faltan para llegar a 21 tanto al crupier como al jugador. Compara cuanto les falta, 
	 * si al jugador le falta menos y no se a pasado de 21 o si el crupier se a pasado de 21 y el jugador no, gana el jugador,
	 *  de lo contrario el jugador pierde . 
	 *  
	 *  En caso de empate se considera derrota.
	 * 
	 * @return devuelve TRUE si el jugador a ganado de lo contrario FALSE
	 */
	public boolean ganador () {
		int faltaJugador = 0;
		int faltaCrupier = 0;
		manoJugador.calcularPuntuacion();
		manoCrupier.calcularPuntuacion();
		
		  for (int i = manoJugador.getPuntuacion(); i <= 21; i++) {
			  faltaJugador++; 
			  }
		  
		  for (int i = manoCrupier.getPuntuacion(); i <= 21 ; i++) {
			  faltaCrupier++; 
			  }
		 
		if ((faltaJugador < faltaCrupier && manoJugador.getPuntuacion() <=21) || (manoCrupier.getPuntuacion() > 21 && manoJugador.getPuntuacion() <= 21)) {
			return  true;
		} else {
			return false;
		}
	}
	
	//++++++++++++++++++++++++++++++++++++++++++++++++++++
	/**
	 * 
	 * actualiza la ventana vermano con la nueva mano
	 * @param vermano: la ventana vermano a actualizar 
	 * @param mano : la mano con la que se tiene que actualizar la ventana
	 */
	public void actualizarMano (VerMano vermano, MANO mano) {
		mano.iconos();
		
		vermano.setMano(mano);
		vermano.verCartas();
	}
	
	
}
