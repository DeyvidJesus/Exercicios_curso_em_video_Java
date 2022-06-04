package desafios.superCalculadora;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JSpinner;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SuperCalculadora extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SuperCalculadora frame = new SuperCalculadora();
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
	public SuperCalculadora() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 329);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SUPER CALCULADORA");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(113, 11, 207, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Informe um valor:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(66, 62, 117, 14);
		contentPane.add(lblNewLabel_1);
		
		JSpinner txtNum = new JSpinner();
		txtNum.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtNum.setBounds(191, 55, 59, 23);
		contentPane.add(txtNum);
		
		JLabel lblNewLabel_2 = new JLabel("Resto da divis\u00E3o por 2:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(10, 115, 141, 23);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblResto = new JLabel("0");
		lblResto.setForeground(Color.BLUE);
		lblResto.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblResto.setBounds(191, 115, 129, 23);
		contentPane.add(lblResto);
		
		JLabel lblNewLabel_2_1 = new JLabel("Eleva\u00E7\u00E3o ao cubo:");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2_1.setBounds(10, 149, 141, 23);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblElevacao = new JLabel("0");
		lblElevacao.setForeground(Color.BLUE);
		lblElevacao.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblElevacao.setBounds(191, 149, 129, 23);
		contentPane.add(lblElevacao);
		
		JLabel lblNewLabel_2_2 = new JLabel("Raiz quadrada:");
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2_2.setBounds(10, 183, 141, 23);
		contentPane.add(lblNewLabel_2_2);
		
		JLabel lblRaizQuadrada = new JLabel("0");
		lblRaizQuadrada.setForeground(Color.BLUE);
		lblRaizQuadrada.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblRaizQuadrada.setBounds(191, 183, 129, 23);
		contentPane.add(lblRaizQuadrada);
		
		JLabel lblNewLabel_2_3 = new JLabel("Raiz c\u00FAbica:");
		lblNewLabel_2_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2_3.setBounds(10, 217, 141, 23);
		contentPane.add(lblNewLabel_2_3);
		
		JLabel lblRaizCubica = new JLabel("0");
		lblRaizCubica.setForeground(Color.BLUE);
		lblRaizCubica.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblRaizCubica.setBounds(191, 217, 129, 23);
		contentPane.add(lblRaizCubica);
		
		JLabel lblNewLabel_2_4 = new JLabel("Valor absoluto:");
		lblNewLabel_2_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2_4.setBounds(10, 251, 141, 23);
		contentPane.add(lblNewLabel_2_4);
		
		JLabel lblValorAbsoluto = new JLabel("0");
		lblValorAbsoluto.setForeground(Color.BLUE);
		lblValorAbsoluto.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblValorAbsoluto.setBounds(191, 251, 129, 23);
		contentPane.add(lblValorAbsoluto);
		
		JButton btnCalc = new JButton("Calcular");
		btnCalc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num = (int) txtNum.getValue();
				
				double resto = num % 2;
				double elevacao = Math.pow(num, 3);
				double raizQuadrada = Math.sqrt(num);
				double raizCubica = Math.cbrt(num);
				double valorAbsoluto = Math.abs(num);
				
				lblResto.setText(Double.toString(resto));
				lblElevacao.setText(Double.toString(elevacao));
				lblRaizQuadrada.setText(Double.toString(raizQuadrada));
				lblRaizCubica.setText(Double.toString(raizCubica));
				lblValorAbsoluto.setText(Double.toString(valorAbsoluto));
			}
		});
		btnCalc.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnCalc.setBounds(271, 48, 89, 38);
		contentPane.add(btnCalc);
	}
}
