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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ProgramaParImparSwing extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtValor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProgramaParImparSwing frame = new ProgramaParImparSwing();
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
	public ProgramaParImparSwing() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 233, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Valor:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(29, 41, 46, 19);
		contentPane.add(lblNewLabel);
		
		txtValor = new JTextField();
		txtValor.setBounds(85, 40, 86, 20);
		contentPane.add(txtValor);
		txtValor.setColumns(10);
		
		JLabel lblResultado = new JLabel("Resultado");
		lblResultado.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblResultado.setBounds(29, 153, 142, 25);
		contentPane.add(lblResultado);
		
		JButton btnVerificar = new JButton("Verificar");
		btnVerificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int v = Integer.parseInt(txtValor.getText());
				
				if (v % 2 == 0) {
					lblResultado.setText("O número " + Integer.toString(v) + " é par.");
				} else {
					lblResultado.setText("O número " + Integer.toString(v) + " é ímpar.");
				}
			}
		});
		btnVerificar.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnVerificar.setBounds(51, 71, 89, 31);
		contentPane.add(btnVerificar);
	}
}
