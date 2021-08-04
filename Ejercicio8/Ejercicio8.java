package Ejercicio8;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ejercicio8 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField cantConvertir;
	private JButton convertor;

	/**
	 * Create the frame.
	 */
	public Ejercicio8() {
		// contenedor
		setTitle("Convertor");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// cerrar
		setBounds(100, 100, 382, 289);
		setVisible(true);
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);

		// Mensajes
		JLabel cant = new JLabel("Cantidad a convertir: ");
		cant.setBounds(23, 32, 141, 13);
		contentPane.add(cant);

		JLabel res = new JLabel("Resultado: ");
		res.setBounds(23, 66, 80, 13);
		contentPane.add(res);

		JLabel resultadoConv = new JLabel("");
		resultadoConv.setBounds(174, 66, 96, 13);
		contentPane.add(resultadoConv);

		// campo texto
		cantConvertir = new JTextField();
		cantConvertir.setBounds(174, 29, 96, 19);
		contentPane.add(cantConvertir);
		cantConvertir.setColumns(10);

		//Notones de conversion
		convertor = new JButton("Euros a pesetas");
		convertor.setBounds(23, 99, 126, 21);
		contentPane.add(convertor);
		convertor.addActionListener(new ActionListener() { // Cuando clique mostrara el resultado
			public void actionPerformed(ActionEvent e) {
				String canti = cantConvertir.getText();
				double cantEuros = Double.parseDouble(canti);
				double calculo = (cantEuros * 166.387);
				String texto = String.valueOf(calculo);
				resultadoConv.setText(texto);
			}

		});

		JButton convertorP = new JButton("Pesetas a euros");
		convertorP.setBounds(174, 99, 131, 21);
		contentPane.add(convertorP);
		convertorP.addActionListener(new ActionListener() { // Cuando clique mostrara el resultado
			public void actionPerformed(ActionEvent e) {
				String canti = cantConvertir.getText();
				double cantPesetas = Double.parseDouble(canti);
				double calculo = (cantPesetas * 0.006);
				String texto = String.valueOf(calculo);
				resultadoConv.setText(texto);
			}

		});

		//boton de borrar
		JButton borrar = new JButton("Limpiar");
		borrar.setBounds(118, 146, 80, 21);
		contentPane.add(borrar);
		borrar.addActionListener(new ActionListener() { // Cuando clique limpiara
			public void actionPerformed(ActionEvent e) {
				String texto = "";
				cantConvertir.setText(texto);
				resultadoConv.setText(texto);
				
			}

		});
		
	}

}
