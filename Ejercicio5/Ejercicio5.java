package Ejercicio5;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;

public class Ejercicio5 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private String resp = "";

	/**
	 * Create the frame.
	 */
	public Ejercicio5() {
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

		// acciones del mouse
		JTextArea textArea = new JTextArea();
		textArea.setBounds(95, 34, 332, 241);
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
		// scroll del text area
		JScrollPane scroll = new JScrollPane(textArea);
		scroll.setBounds(90, 20, 356, 275);
		contentPane.add(scroll);

		// Boton para limpiar el textArea
		JButton limpiar = new JButton("Limpiar");
		limpiar.setBounds(0, 167, 85, 21);
		contentPane.add(limpiar);
		limpiar.addActionListener(new ActionListener() { // Cuando clique borrara
			public void actionPerformed(ActionEvent e) {
				resp = "";
				textArea.setText(resp);
			}
		});
	}

}
