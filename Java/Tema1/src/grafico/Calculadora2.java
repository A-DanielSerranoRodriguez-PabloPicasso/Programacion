package grafico;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Calculadora2 {

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
					Calculadora2 window = new Calculadora2();
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
	public Calculadora2() {
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
		
		JLabel lblTitulo = new JLabel("Calculadora");
		lblTitulo.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setBounds(135, 12, 179, 41);
		frame.getContentPane().add(lblTitulo);
		
		JLabel lblTituloNum1 = new JLabel("Número 1");
		lblTituloNum1.setBounds(12, 75, 94, 25);
		frame.getContentPane().add(lblTituloNum1);
		
		txtNum1 = new JTextField();
		txtNum1.setBounds(91, 65, 234, 45);
		frame.getContentPane().add(txtNum1);
		txtNum1.setColumns(10);
		
		JLabel lblTituloNum2 = new JLabel("Número 2");
		lblTituloNum2.setBounds(12, 136, 94, 25);
		frame.getContentPane().add(lblTituloNum2);
		
		txtNum2 = new JTextField();
		txtNum2.setBounds(91, 122, 234, 45);
		frame.getContentPane().add(txtNum2);
		txtNum2.setColumns(10);
		
		JLabel lblResultado = new JLabel("");
		lblResultado.setBounds(12, 220, 418, 36);
		frame.getContentPane().add(lblResultado);
		JButton btnSuma = new JButton("+");
		btnSuma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1 = Double.parseDouble(txtNum1.getText());
				double num2 = Double.parseDouble(txtNum2.getText());
				lblResultado.setText("Resultado: " + String.valueOf(num1+num2));
			}
		});
		btnSuma.setBounds(336, 69, 41, 36);
		frame.getContentPane().add(btnSuma);
		
		JButton btnResta = new JButton("-");
		btnResta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1 = Double.parseDouble(txtNum1.getText());
				double num2 = Double.parseDouble(txtNum2.getText());
				lblResultado.setText("Resultado: " + String.valueOf(num1-num2));
			}
		});
		btnResta.setBounds(389, 69, 41, 36);
		frame.getContentPane().add(btnResta);
		
		JButton btnMultiplicacion = new JButton("*");
		btnMultiplicacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1 = Double.parseDouble(txtNum1.getText());
				double num2 = Double.parseDouble(txtNum2.getText());
				lblResultado.setText("Resultado: " + String.valueOf(num1*num2));
			}
		});
		btnMultiplicacion.setBounds(336, 117, 41, 36);
		frame.getContentPane().add(btnMultiplicacion);
		
		JButton btnDivision = new JButton("/");
		btnDivision.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1 = Double.parseDouble(txtNum1.getText());
				double num2 = Double.parseDouble(txtNum2.getText());
				if (num2==0) {
					lblResultado.setText("Resultado: infinito. No se puede dividir entre 0");
				} else
				lblResultado.setText("Resultado: " + String.valueOf(num1/num2));
			}
		});
		btnDivision.setBounds(389, 117, 41, 36);
		frame.getContentPane().add(btnDivision);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSalir.setBounds(336, 163, 94, 45);
		frame.getContentPane().add(btnSalir);
	
	}

}
