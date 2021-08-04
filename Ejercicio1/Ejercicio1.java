package Ejercicio1;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;

public class Ejercicio1 extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public Ejercicio1() {
		// contenedor
		setTitle("Ventana");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//cerrar
		setBounds(100, 100, 456, 375);
		setVisible(true);
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		//Etiqueta
		JLabel etiqueta = new JLabel("Etiqueta");
		etiqueta.setFont(new Font("Tahoma", Font.PLAIN, 45));
		etiqueta.setBounds(124, 91, 240, 113);
		contentPane.add(etiqueta);
		
		
	}
}
