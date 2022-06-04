package desafios;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import java.awt.Font;
import java.awt.Color;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EquacaoSegundoGrau extends JFrame {

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
					EquacaoSegundoGrau frame = new EquacaoSegundoGrau();
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
	public EquacaoSegundoGrau() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 586, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(188, 11, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("<html>x <sup>2</sup> +</html");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(115, 75, 38, 20);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("x +");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1.setBounds(213, 81, 30, 14);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("= 0");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_2.setBounds(299, 78, 46, 14);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblA = new JLabel("A");
		lblA.setForeground(Color.RED);
		lblA.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblA.setBounds(221, 128, 17, 14);
		contentPane.add(lblA);
		
		JLabel lblB = new JLabel("B");
		lblB.setForeground(Color.RED);
		lblB.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblB.setBounds(135, 128, 17, 14);
		contentPane.add(lblB);
		
		JLabel lblC = new JLabel("C");
		lblC.setForeground(Color.RED);
		lblC.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblC.setBounds(266, 128, 23, 14);
		contentPane.add(lblC);
		
		JLabel lblNewLabel_2_3 = new JLabel("<html><sup>2</sup> - 4 .</html>");
		lblNewLabel_2_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2_3.setBounds(162, 126, 46, 16);
		contentPane.add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_2_4 = new JLabel("<html>&Delta; =</html>");
		lblNewLabel_2_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2_4.setBounds(106, 128, 30, 14);
		contentPane.add(lblNewLabel_2_4);
		
		JLabel lblNewLabel_2_2_1 = new JLabel(".");
		lblNewLabel_2_2_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2_2_1.setBounds(241, 128, 17, 14);
		contentPane.add(lblNewLabel_2_2_1);
		
		JSpinner txtA = new JSpinner();
		txtA.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				lblA.setText(txtA.getValue().toString());
			}
		});
		txtA.setBounds(59, 75, 38, 20);
		contentPane.add(txtA);
		
		JSpinner txtB = new JSpinner();
		txtB.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				lblB.setText(txtB.getValue().toString());
			}
		});
		txtB.setBounds(163, 75, 40, 20);
		contentPane.add(txtB);
		
		JSpinner txtC = new JSpinner();
		txtC.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				lblC.setText(txtC.getValue().toString());
			}
		});
		txtC.setBounds(251, 75, 38, 20);
		contentPane.add(txtC);
		
		JPanel panResultado = new JPanel();
		panResultado.setBounds(355, 24, 186, 203);
		contentPane.add(panResultado);
		panResultado.setLayout(null);
		
		JLabel lblvalorDedelta = new JLabel("<html>Valor de &Delta; :</html>");
		lblvalorDedelta.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblvalorDedelta.setBounds(10, 29, 74, 14);
		panResultado.add(lblvalorDedelta);
		
		JLabel lblNewLabel_2 = new JLabel("Tipo de ra\u00EDzes :");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(10, 108, 101, 14);
		panResultado.add(lblNewLabel_2);
		
		JLabel lblRaizes = new JLabel("0");
		lblRaizes.setForeground(Color.BLUE);
		lblRaizes.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblRaizes.setBounds(20, 133, 156, 14);
		panResultado.add(lblRaizes);
		
		JLabel lblDelta = new JLabel("0");
		lblDelta.setForeground(Color.BLUE);
		lblDelta.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDelta.setBounds(20, 54, 64, 14);
		panResultado.add(lblDelta);
		
		panResultado.setVisible(false);

		JButton btnNewButton = new JButton("<html>Calcular &Delta;</html>");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a = Integer.parseInt(txtA.getValue().toString());
				int b = Integer.parseInt(txtB.getValue().toString());
				int c = Integer.parseInt(txtC.getValue().toString());
				
				double d = Math.pow(b, 2) - 4 * a * c;
				
				lblDelta.setText(String.format("%.2f", d));
				
				if (d<0) {
					lblRaizes.setText("Não existem raízes reais.");
				} else {
					lblRaizes.setText("Existem raízes reais."); 
				}
				
				panResultado.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.setBounds(143, 173, 100, 23);
		contentPane.add(btnNewButton);
	}
}
