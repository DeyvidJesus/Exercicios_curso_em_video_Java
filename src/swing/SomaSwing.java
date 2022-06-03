package swing;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SomaSwing extends JFrame {

	private JPanel contentPane;
	private JTextField txtN1;
	private JTextField txtN2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SomaSwing frame = new SomaSwing();
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
	public SomaSwing() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 488, 152);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Calculadora");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(187, 11, 96, 22);
		contentPane.add(lblNewLabel);
		
		txtN1 = new JTextField();
		txtN1.setBounds(70, 55, 86, 20);
		contentPane.add(txtN1);
		txtN1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("+");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(166, 56, 11, 14);
		contentPane.add(lblNewLabel_1);
		
		txtN2 = new JTextField();
		txtN2.setColumns(10);
		txtN2.setBounds(187, 55, 86, 20);
		contentPane.add(txtN2);
		
		JLabel lblResultado = new JLabel("0");
		lblResultado.setHorizontalAlignment(SwingConstants.LEFT);
		lblResultado.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblResultado.setBounds(367, 55, 86, 17);
		contentPane.add(lblResultado);
		
		JButton btnSoma = new JButton("=");
		btnSoma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int n1 = Integer.parseInt(txtN1.getText());
				int n2 = Integer.parseInt(txtN2.getText());
				int soma = n1 + n2;
				lblResultado.setText(Integer.toString(soma));
			}
		});
		btnSoma.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnSoma.setBounds(293, 53, 54, 22);
		contentPane.add(btnSoma);
	}
}
