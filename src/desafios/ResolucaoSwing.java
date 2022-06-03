package desafios;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ResolucaoSwing extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ResolucaoSwing frame = new ResolucaoSwing();
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
	public ResolucaoSwing() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 159);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Resolu\u00E7\u00E3o atual:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(139, 11, 148, 25);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\deyvi.DESKTOP-9SSHJ43\\Downloads\\tela-de-computador.png"));
		lblNewLabel_1.setBounds(28, 11, 78, 98);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblResultado = new JLabel("");
		lblResultado.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblResultado.setBounds(149, 47, 138, 14);
		contentPane.add(lblResultado);
		
		JButton btnExecutar = new JButton("Mostrar resolu\u00E7\u00E3o");
		btnExecutar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				Dimension dimension = toolkit.getScreenSize();
				int width = dimension.width;
				int height = dimension.height;
				lblResultado.setText(width + " x " + height);
			}
		});
		btnExecutar.setBounds(139, 72, 148, 23);
		contentPane.add(btnExecutar);
	}
}
