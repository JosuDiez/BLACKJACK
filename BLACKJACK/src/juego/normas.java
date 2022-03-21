package juego;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import java.awt.Font;

public class normas extends JFrame {

	//***************************************************************************************
	//								DECLARACIONES VARIAS
	//***************************************************************************************

	private static final long serialVersionUID = 5279520122500708584L;
	private JPanel contentPane;

	//***************************************************************************************
	//										MAIN
	//***************************************************************************************

	
	/**
	 * inicia la ventana
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					normas frame = new normas();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	//***************************************************************************************
	//									CONSTRUCTOR							
	//***************************************************************************************


	/**
	 * constructor de normas
	 */
	public normas() {
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 408, 688);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea txtrObjetivoElObjetivo = new JTextArea();
		txtrObjetivoElObjetivo.setEditable(false);
		txtrObjetivoElObjetivo.setFont(new Font("Courier New", Font.PLAIN, 14));
		txtrObjetivoElObjetivo.setText("OBJETIVO:\r\nEl objetivo del juego consiste en\r\nacercarse lo maximo posible a 21 \r\npuntos sin pasarse. \r\n\r\nCARTAS/PUNTUACION:\r\n\r\nCada carta tiene el valor del \r\nnumero que representa, con la \r\nexcepcion de las figuras, las \r\ncuales valen 10 puntos. Se empieza \r\ncon dos cartas y en cada ronda se \r\npuede elegir si pedir una carta\r\n mas o plantarse con las que \r\nse tiene.\r\n\r\nCRUPIER:\r\n\r\nEl crupier juega en nombre \r\nde la casa. Si tiene menos de \r\n16 puntos esta obligado a \r\ncojer carta mientras que si\r\ntiene 17 o mas debe \r\nplantarse. Si se tiene la \r\nmisma puntuacion que el \r\ncrupier se considera \r\nvictoria de la casa.  ");
		txtrObjetivoElObjetivo.setBounds(30, 38, 301, 525);
		contentPane.add(txtrObjetivoElObjetivo);
	}
}
