package Ejercicio2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;


public class Ejercicio2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private String mensaje;
	private JLabel etiqueta;
	
	/**
	 * Create the frame.
	 */
	public Ejercicio2() {
		// contenedor
		setTitle("Opciones ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//cerrar
		setBounds(100, 100, 456, 375);
		setVisible(true);
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		//boton1
		JButton opcion1 = new JButton("opcion1");
		opcion1.setBounds(231, 38, 85, 21);
		contentPane.add(opcion1);
		opcion1.addActionListener(new ActionListener() { // Cuando clique mostrara
			public void actionPerformed(ActionEvent e) {
				mensaje = "Has pulsado: opcion 1";
				etiqueta.setText(mensaje);
			}
		});
		
		//boton2
		JButton opcion2 = new JButton("opcion2");
		opcion2.setBounds(231, 65, 85, 21);
		contentPane.add(opcion2);
		opcion2.addActionListener(new ActionListener() { // Cuando clique mostrara
			public void actionPerformed(ActionEvent e) {
				mensaje = "Has pulsado: opcion 2";
				etiqueta.setText(mensaje);
			}
		});
		
		//etiqueta
		etiqueta = new JLabel("Has pulsado: ");
		etiqueta.setBounds(42, 57, 150, 13);
		contentPane.add(etiqueta);
		
	}
}
