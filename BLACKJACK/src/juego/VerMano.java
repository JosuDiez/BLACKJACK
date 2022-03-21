package juego;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

public class VerMano extends JFrame {

	//***************************************************************************************
	//									DECLARACIONES VARIAS
	//***************************************************************************************
	private static final long serialVersionUID = 1741343950338037759L;
	private JPanel contentPane;
	
	private MANO mano = new MANO();

	
	
	JLabel lblCarta1_1;
	JLabel lblCarta1_2;
	JLabel lblCarta1_3;
	JLabel lblCarta1_4;
	JLabel lblCarta1_5;
	JLabel lblCarta1_6;
	JLabel lblCarta1_7;
	JLabel lblCarta1_8;
	JLabel lblCarta1_9;
	JLabel lblCarta1_10;
	JLabel lblCarta1_11;
	
	//***************************************************************************************
	//									MAIN
	//***************************************************************************************
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VerMano frame = new VerMano();
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
	public VerMano() {
		setBounds(100, 100, 929, 550);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblCarta1_11 = new JLabel("");
		lblCarta1_11.setBounds(90, 93, 111, 145);
		contentPane.add(lblCarta1_11);
		
		 lblCarta1_1 = new JLabel("");
		lblCarta1_1.setBounds(231, 93, 111, 145);
		contentPane.add(lblCarta1_1);
		
		 lblCarta1_2 = new JLabel("");
		lblCarta1_2.setBounds(383, 93, 111, 145);
		contentPane.add(lblCarta1_2);
		
		 lblCarta1_3 = new JLabel("");
		lblCarta1_3.setBounds(575, 93, 111, 145);
		contentPane.add(lblCarta1_3);
		
		 lblCarta1_4 = new JLabel("");
		lblCarta1_4.setBounds(731, 93, 111, 145);
		contentPane.add(lblCarta1_4);
		
		 lblCarta1_5 = new JLabel("");
		lblCarta1_5.setBounds(90, 232, 111, 145);
		contentPane.add(lblCarta1_5);
		 
		 lblCarta1_6 = new JLabel("");
		lblCarta1_6.setBounds(231, 232, 111, 145);
		contentPane.add(lblCarta1_6);
		
		 lblCarta1_7 = new JLabel("");
		lblCarta1_7.setBounds(383, 232, 111, 145);
		contentPane.add(lblCarta1_7);
		
		 lblCarta1_8 = new JLabel("");
		lblCarta1_8.setBounds(575, 232, 111, 145);
		contentPane.add(lblCarta1_8);
		
		 lblCarta1_9 = new JLabel("");
		lblCarta1_9.setBounds(731, 232, 111, 145);
		contentPane.add(lblCarta1_9);
		
		 lblCarta1_10 = new JLabel("");
		lblCarta1_10.setBounds(383, 355, 111, 145);
		contentPane.add(lblCarta1_10);
		
	}
	
	//***************************************************************************************
	//								GETTER + SETTER
	//***************************************************************************************

	public MANO getMano() {
		return mano;
	}

	public void setMano(MANO mano) {
		this.mano = mano;
	}
	
	//***************************************************************************************
	//									FUNCIONES
	//***************************************************************************************	
	
	public void verCartas() {
		
		
		
		if (mano.cartas.size() > 0) {
			
			lblCarta1_11.setIcon(mano.cartas.get(0).getIcono());
			
		} 
		
		if (mano.cartas.size() > 1) {
			
			lblCarta1_1.setIcon(mano.cartas.get(1).getIcono());

		}
		
		if (mano.cartas.size() > 2) {
			
			lblCarta1_2.setIcon(mano.cartas.get(2).getIcono());

		}
		
		if (mano.cartas.size() > 3) {
			
			lblCarta1_3.setIcon(mano.cartas.get(3).getIcono());

		}
		
		if (mano.cartas.size() > 4) {
			
			lblCarta1_4.setIcon(mano.cartas.get(4).getIcono());

		}
		
		if (mano.cartas.size() > 5) {
			
			lblCarta1_5.setIcon(mano.cartas.get(5).getIcono());

		}
		
		if (mano.cartas.size() > 6) {
			
			lblCarta1_6.setIcon(mano.cartas.get(6).getIcono());

		}
		
		if (mano.cartas.size() > 7) {
			
			lblCarta1_7.setIcon(mano.cartas.get(7).getIcono());

		}
		
		if (mano.cartas.size() > 8) {
			
			lblCarta1_8.setIcon(mano.cartas.get(8).getIcono());

		}
		
		if (mano.cartas.size() > 9) {
			
			lblCarta1_9.setIcon(mano.cartas.get(9).getIcono());

		}
		
		if (mano.cartas.size() > 10) {
			
			lblCarta1_10.setIcon(mano.cartas.get(10).getIcono());

		}
	}
}
