package Ejercicio4;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Ejercicio4 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private String resp = "";

	/**
	 * Create the frame.
	 */
	public Ejercicio4() {
		// contenedor
		setTitle("Operaciones");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// cerrar
		setBounds(100, 100, 456, 375);
		setVisible(true);
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);

		// Mensajes
		JLabel mensj = new JLabel("Eventos: ");
		mensj.setBounds(10, 144, 75, 13);
		contentPane.add(mensj);

		//acciones del mouse
		JTextArea textArea = new JTextArea();
		textArea.setBounds(73, 36, 332, 241);
		contentPane.add(textArea);
		textArea.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				resp += "Has entrado \n";
				textArea.setText(resp);
			}

		});
		textArea.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				resp += "Has clicado \n";
				textArea.setText(resp);
			}

		});
		textArea.addMouseListener(new MouseAdapter() {
			public void mouseExited(MouseEvent e) {
				resp += "Has salido \n";
				textArea.setText(resp);
			}

		});
		//scroll del text area
		JScrollPane scroll = new JScrollPane(textArea);
		scroll.setBounds(90, 20, 356, 275);
		contentPane.add(scroll);
		
	}
}
