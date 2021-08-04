package Ejercicio3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;

public class Ejercicio3 extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel mensj1;
	private JLabel mensj2;
	private int cont1 = 0;
	private int cont2 = 0;

	/**
	 * Create the frame.
	 */
	public Ejercicio3() {
		// contenedor
		setTitle("Operaciones cont");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// cerrar
		setBounds(100, 100, 456, 375);
		setVisible(true);
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);

		// boton1
		JButton opcion1 = new JButton("opcion 1");
		opcion1.setBounds(231, 38, 85, 21);
		contentPane.add(opcion1);
		opcion1.addActionListener(new ActionListener() { // Cuando clique mostrara
			public void actionPerformed(ActionEvent e) {
				cont1++;
				String resp = "Has pulsado el boton 1: " + cont1 + " veces";
				mensj1.setText(resp);

			}
		});

		// boton2
		JButton opcion2 = new JButton("opcion 2");
		opcion2.setBounds(231, 65, 85, 21);
		contentPane.add(opcion2);
		opcion2.addActionListener(new ActionListener() { // Cuando clique mostrara
			public void actionPerformed(ActionEvent e) {
				cont2++;
				String resp = "Has pulsado el boton 2: " + cont2 + " veces";
				mensj2.setText(resp);
			}
		});
		
		// Mensajes
		mensj1 = new JLabel("Has pulsado el boton 1: ");
		mensj1.setBounds(10, 42, 205, 13);
		contentPane.add(mensj1);

		mensj2 = new JLabel("Has pulsado el boton 2: ");
		mensj2.setBounds(10, 69, 205, 13);
		contentPane.add(mensj2);

	}

}
