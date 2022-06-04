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

public class VerificadorIdadeSwing extends JFrame {

	private JPanel contentPane;
	private JTextField txtAnoNasc;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VerificadorIdadeSwing frame = new VerificadorIdadeSwing();
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
	public VerificadorIdadeSwing() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 331, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ano de nascimento:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel.setBounds(34, 40, 116, 14);
		contentPane.add(lblNewLabel);
		
		txtAnoNasc = new JTextField();
		txtAnoNasc.setBounds(160, 38, 86, 20);
		contentPane.add(txtAnoNasc);
		txtAnoNasc.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Idade:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(47, 151, 103, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Situa\u00E7\u00E3o:");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1_1.setBounds(47, 176, 103, 14);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblIdade = new JLabel("0");
		lblIdade.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblIdade.setBounds(183, 151, 97, 14);
		contentPane.add(lblIdade);
		
		JLabel lblSituacao = new JLabel("<vazio>");
		lblSituacao.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblSituacao.setBounds(183, 176, 97, 14);
		contentPane.add(lblSituacao);
		
		JButton btnEnviar = new JButton("Enviar");
		btnEnviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int ano = Integer.parseInt(txtAnoNasc.getText());
				int idade = 2022 - ano;
				lblIdade.setText(Integer.toString(idade));
				
				String situacao = ((idade>=16 && idade<18) || (idade>70))?"É opcional":"Não é opcional";
				lblSituacao.setText(situacao);
			}
		});
		btnEnviar.setBounds(104, 77, 89, 23);
		contentPane.add(btnEnviar);
	}

}
