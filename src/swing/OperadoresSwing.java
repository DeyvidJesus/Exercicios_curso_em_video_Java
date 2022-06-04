package swing;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class OperadoresSwing extends JFrame {

	private JPanel contentPane;
	private JTextField txtNumerador;
	private JTextField txtDenominador;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OperadoresSwing frame = new OperadoresSwing();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public OperadoresSwing() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Numerador:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel.setBounds(31, 35, 78, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Denominador:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(31, 74, 90, 14);
		contentPane.add(lblNewLabel_1);
		
		txtNumerador = new JTextField();
		txtNumerador.setBounds(131, 32, 86, 20);
		contentPane.add(txtNumerador);
		txtNumerador.setColumns(10);
		
		txtDenominador = new JTextField();
		txtDenominador.setBounds(131, 71, 86, 20);
		contentPane.add(txtDenominador);
		txtDenominador.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Divis\u00E3o:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_2.setBounds(51, 179, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Raiz:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_3.setBounds(51, 215, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblResultado1 = new JLabel("00");
		lblResultado1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblResultado1.setBounds(125, 179, 46, 14);
		contentPane.add(lblResultado1);
		
		JLabel lblResultado2 = new JLabel("00");
		lblResultado2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblResultado2.setBounds(125, 215, 46, 14);
		contentPane.add(lblResultado2);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float numerador = Float.parseFloat(txtNumerador.getText());
				float denominador = Float.parseFloat(txtDenominador.getText());
				
				float divisao = numerador / denominador;
				double raiz = Math.sqrt(numerador);
				
				lblResultado1.setText(Float.toString(divisao));
				lblResultado2.setText(Double.toString(raiz));
			}
		});
		btnCalcular.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnCalcular.setBounds(82, 118, 89, 31);
		contentPane.add(btnCalcular);
	}
}
