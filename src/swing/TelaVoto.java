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
import javax.swing.SwingConstants;

public class TelaVoto extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtAno;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaVoto frame = new TelaVoto();
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
	public TelaVoto() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 241, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ano nascimento:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel.setBounds(10, 35, 97, 14);
		contentPane.add(lblNewLabel);
		
		txtAno = new JTextField();
		txtAno.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtAno.setBounds(117, 32, 86, 20);
		contentPane.add(txtAno);
		txtAno.setColumns(10);
		
		JLabel lblResultado = new JLabel("Resultado");
		lblResultado.setHorizontalAlignment(SwingConstants.CENTER);
		lblResultado.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblResultado.setBounds(10, 127, 193, 20);
		contentPane.add(lblResultado);
		
		JButton btnVoto = new JButton("Verificar");
		btnVoto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int ano = Integer.parseInt(txtAno.getText());
				int i = 2022 - ano;
				
				if (i < 16) {
					lblResultado.setText("Não pode votar.");
				} else if ((i >= 16 && i <18) || (i > 70)) {
						lblResultado.setText("Voto opcional.");
					} else {
						lblResultado.setText("Voto obrigatório.");
					}
				}
			});
		btnVoto.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnVoto.setBounds(49, 78, 89, 23);
		contentPane.add(btnVoto);
	}
}
