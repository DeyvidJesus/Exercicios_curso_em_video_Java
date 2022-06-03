package desafios.calculadoraIdade;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.Date;
import java.awt.event.ActionEvent;

public class TelaIdade extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaIdade frame = new TelaIdade();
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
	public TelaIdade() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ano atual:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(35, 32, 141, 14);
		contentPane.add(lblNewLabel);
		
		JLabel txtAnoAtual = new JLabel(Integer.toString(Calendar.getInstance().get(Calendar.YEAR)));
		txtAnoAtual.setForeground(Color.BLUE);
		txtAnoAtual.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtAnoAtual.setBounds(186, 32, 62, 14);
		contentPane.add(txtAnoAtual);
		
		JLabel lblAnoDeNascimento = new JLabel("Ano de nascimento:");
		lblAnoDeNascimento.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblAnoDeNascimento.setBounds(35, 65, 142, 14);
		contentPane.add(lblAnoDeNascimento);
		
		JSpinner txtAnoNasc = new JSpinner();
		txtAnoNasc.setModel(new SpinnerNumberModel(1900, 1900, 2022, 1));
		txtAnoNasc.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtAnoNasc.setBounds(186, 64, 62, 20);
		contentPane.add(txtAnoNasc);
		
		JLabel lblNewLabel_2 = new JLabel("Sua idade no final desse ano ser\u00E1: ");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(35, 193, 229, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblResultado = new JLabel("0");
		lblResultado.setForeground(Color.BLUE);
		lblResultado.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblResultado.setBounds(274, 190, 46, 16);
		contentPane.add(lblResultado);
		
		JButton btnCalc = new JButton("Calcular idade");
		btnCalc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int idade = Integer.parseInt(txtAnoAtual.getText()) - Integer.parseInt(txtAnoNasc.getValue().toString());
				lblResultado.setText(Integer.toString(idade));
			}
		});
		btnCalc.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnCalc.setBounds(69, 120, 141, 23);
		contentPane.add(btnCalc);
	}
}
