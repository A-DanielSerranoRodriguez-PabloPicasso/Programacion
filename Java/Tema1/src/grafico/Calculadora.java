package grafico;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculadora {

	private JFrame frame;
	private JTextField txtNum1;
	private JTextField txtNum2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora window = new Calculadora();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculadora() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNumero1 = new JLabel("Primer número:");
		lblNumero1.setBounds(12, 12, 141, 36);
		frame.getContentPane().add(lblNumero1);
		
		JLabel lblNumero2 = new JLabel("Segundo número:");
		lblNumero2.setBounds(12, 60, 115, 28);
		frame.getContentPane().add(lblNumero2);
		
		txtNum1 = new JTextField();
		txtNum1.setBounds(115, 20, 114, 21);
		frame.getContentPane().add(txtNum1);
		txtNum1.setColumns(10);
		
		txtNum2 = new JTextField();
		txtNum2.setBounds(125, 64, 114, 21);
		frame.getContentPane().add(txtNum2);
		txtNum2.setColumns(10);
		
		JLabel lblTituloResultado = new JLabel("Resultado:");
		lblTituloResultado.setBounds(12, 220, 74, 28);
		frame.getContentPane().add(lblTituloResultado);
		
		JLabel lblResultado = new JLabel("");
		lblResultado.setBounds(79, 220, 317, 28);
		frame.getContentPane().add(lblResultado);
		
		JButton btnSuma = new JButton("Suma");
		btnSuma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1 = Double.parseDouble(txtNum1.getText());
				double num2 = Double.parseDouble(txtNum2.getText());
				
				lblResultado.setText(String.valueOf(num1+num2));
			}
		});
		btnSuma.setBounds(291, 17, 120, 27);
		frame.getContentPane().add(btnSuma);
		
		JButton btnResta = new JButton("Resta");
		btnResta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1 = Double.parseDouble(txtNum1.getText());
				double num2 = Double.parseDouble(txtNum2.getText());
				
				lblResultado.setText(String.valueOf(num1-num2));
			}
		});
		btnResta.setBounds(291, 56, 120, 27);
		frame.getContentPane().add(btnResta);
		
		JButton btnMultiplicacion = new JButton("Multiplicación");
		btnMultiplicacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1 = Double.parseDouble(txtNum1.getText());
				double num2 = Double.parseDouble(txtNum2.getText());
				
				lblResultado.setText(String.valueOf(num1*num2));
			}
		});
		btnMultiplicacion.setBounds(291, 95, 120, 27);
		frame.getContentPane().add(btnMultiplicacion);
		
		JButton btnDivision = new JButton("División");
		btnDivision.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1 = Double.parseDouble(txtNum1.getText());
				double num2 = Double.parseDouble(txtNum2.getText());
				
				lblResultado.setText(String.valueOf(num1/num2));
			}
		});
		btnDivision.setBounds(291, 134, 120, 27);
		frame.getContentPane().add(btnDivision);
	}
}
