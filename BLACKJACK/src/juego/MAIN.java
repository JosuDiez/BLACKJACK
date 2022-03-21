package juego;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.UIManager;

public class MAIN extends JFrame implements ActionListener{

	//***************************************************************************************
	//									DECLARACIONES VARIAS
	//***************************************************************************************

	private static final long serialVersionUID = 3270916087724653998L;
	private JPanel contentPane;
	JButton btnNuevaPartida;
	JButton btnSalir;
	JLabel lblGanadas;
	JLabel lblPerdidas;
	JLabel lblGanadasTXT;
	JLabel lblPerdidasTXT;
	JPanel panelPuntuacion;
	
	partida part = new partida();
	normas normas = new normas();
	
	static MAIN frame = new MAIN();
	
	private JButton btnNormas;
	int ganadas = 0;
	int perdidas = 0;
	private JLabel lblInicio;
	private JLabel lblInicio2;
	
	//***************************************************************************************
	// 										MAIN
	//***************************************************************************************

	/**
	 * Inicia la aplicacion
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame.setTitle("BlackJack");
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	//***************************************************************************************
	//										CONSTRUCTOR
	//***************************************************************************************

	/**
	 * Create the frame.
	 */
	public MAIN() {
		
		setBounds(100, 100, 796, 520);
		contentPane = new JPanel();
		contentPane.setBackground(UIManager.getColor("CheckBox.background"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnNuevaPartida = new JButton("Nueva partida");
		
		btnNuevaPartida.addActionListener(this);
		btnNuevaPartida.setBounds(116, 353, 127, 53);
		contentPane.add(btnNuevaPartida);
		
		 btnSalir = new JButton("Salir");
		btnSalir.setBounds(515, 353, 127, 53);
		contentPane.add(btnSalir);
		
		 lblGanadas = new JLabel("0");
		lblGanadas.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblGanadas.setBounds(708, 53, 45, 13);
		contentPane.add(lblGanadas);
		
		 lblPerdidas = new JLabel("0");
		lblPerdidas.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPerdidas.setBounds(708, 99, 45, 13);
		contentPane.add(lblPerdidas);
		
		 lblGanadasTXT = new JLabel("GANADAS");
		lblGanadasTXT.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblGanadasTXT.setBounds(587, 55, 84, 13);
		contentPane.add(lblGanadasTXT);
		
		 lblPerdidasTXT = new JLabel("PERDIDAS");
		lblPerdidasTXT.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPerdidasTXT.setBounds(587, 101, 84, 13);
		contentPane.add(lblPerdidasTXT);
		
		 panelPuntuacion = new JPanel();
		panelPuntuacion.setBounds(560, 30, 212, 122);
		contentPane.add(panelPuntuacion);
		
		btnNormas = new JButton("Normas");
		btnNormas.setBounds(315, 353, 127, 53);
		contentPane.add(btnNormas);
		
		lblInicio = new JLabel("New label");
		lblInicio.setBackground(Color.WHITE);
		lblInicio.setBounds(192, 30, 333, 122);
		contentPane.add(lblInicio);
		ImageIcon iconoInicio = new ImageIcon("imagenes/inicio3.png");
		iconoInicio = JOSUTECA.tamañoIcono(iconoInicio, 333, 122);
		lblInicio.setIcon(iconoInicio);
		
		lblInicio2 = new JLabel("New label");
		lblInicio2.setBounds(281, 173, 150, 122);
		contentPane.add(lblInicio2);
		 iconoInicio = new ImageIcon("imagenes/inicio2.png");
		 iconoInicio = JOSUTECA.tamañoIcono(iconoInicio, 173, 122);
		 lblInicio2.setIcon(iconoInicio);
		
		btnNormas.addActionListener(this);
		
		btnSalir.addActionListener(this);
		
		
	}

	//***************************************************************************************
	//									ACTION PERFORMER
	//***************************************************************************************

	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		//++++++++++++++++++++++++++++++++++++++++++++++++++++++++
		//Controla el boton nueva partida: crea una nueva ventana partida, destruye la partida anterior
		if (e.getSource().equals(btnNuevaPartida)) {
			nuevaPartida();
		//++++++++++++++++++++++++++++++++++++++++++++++++++++++++	
		//Controla el boton salir: Cierra la aplicacion
		} else if (e.getSource().equals(btnSalir)) {
			frame.dispose();
			System.exit(0);
		//++++++++++++++++++++++++++++++++++++++++++++++++++++++++
		//Controla el boton normas: crea una nueva ventana normas	
		} else if (e.getSource().equals(btnNormas)) {
			normas.dispose();
			normas = new normas();
			normas.setTitle("Normas");
			normas.setVisible(true);
		}
		
	}
	
	//***************************************************************************************
	// 										FUNCIONES
	//***************************************************************************************

	/**
	 * 
	 * Crea una una ventana partida y esconde la main
	 */
	public void nuevaPartida () {
		part.dispose();
		part.vermano.dispose();
		part.vermanoCrupier.dispose();
		part = new partida();
		part.setTitle("partida");
		part.setVisible(true);
		frame.setVisible(false);
	}
}
