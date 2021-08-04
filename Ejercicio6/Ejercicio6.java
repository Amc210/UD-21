package Ejercicio6;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;

public class Ejercicio6 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField alturaT;
	private JTextField pesoT;
	private JTextField textField;

	/**
	 * Create the frame.
	 */
	public Ejercicio6() {
		// contenedor
		setTitle("IMC");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// cerrar
		setBounds(100, 100, 382, 289);
		setVisible(true);
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);

		// Mensajes
		JLabel altura = new JLabel("Altura (metros): ");
		altura.setBounds(23, 32, 96, 13);
		contentPane.add(altura);

		JLabel kg = new JLabel("Peso (kg): ");
		kg.setBounds(23, 66, 80, 13);
		contentPane.add(kg);

		JLabel imc = new JLabel("IMC: ");
		imc.setBounds(23, 100, 61, 13);
		contentPane.add(imc);

		// Introducir datos
		alturaT = new JTextField();
		alturaT.setBounds(129, 29, 96, 19);
		contentPane.add(alturaT);
		alturaT.setColumns(10);

		pesoT = new JTextField();
		pesoT.setBounds(129, 63, 96, 19);
		contentPane.add(pesoT);
		pesoT.setColumns(10);

	

		//boton para calcular
		JButton calcular = new JButton("Calcular IMC");
		calcular.setBounds(118, 143, 110, 21);
		contentPane.add(calcular);
		
		JLabel imcT = new JLabel("");
		imcT.setBounds(129, 100, 153, 13);
		contentPane.add(imcT);
		calcular.addActionListener(new ActionListener() { // Cuando clique mostrara
			public void actionPerformed(ActionEvent e) {
				String altura = alturaT.getText();
				String peso = pesoT.getText();
				double alturaI = Double.parseDouble(altura);
				double pesoI = Double.parseDouble(peso);
				double cuadradoAltura = Math.pow(alturaI, 2);
				double resul = pesoI/(Math.pow(alturaI, cuadradoAltura));
				String total = String.valueOf(Math.round(resul*100.0)/100.0);
				imcT.setText(total);
			}

		});
	}

}
