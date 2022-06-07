package desafios;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JSlider;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class TelaTriangulo extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaTriangulo frame = new TelaTriangulo();
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
	public TelaTriangulo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 300);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Segmento A");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setBounds(25, 33, 85, 21);
		contentPane.add(lblNewLabel);
		
		
		
		JLabel lblA = new JLabel("0");
		lblA.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblA.setForeground(Color.GRAY);
		lblA.setBounds(272, 40, 46, 14);
		contentPane.add(lblA);
		
		JLabel lblSegmento = new JLabel("Segmento B");
		lblSegmento.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSegmento.setForeground(new Color(0, 0, 0));
		lblSegmento.setBounds(25, 65, 85, 21);
		contentPane.add(lblSegmento);
		
		JLabel lblB = new JLabel("0");
		lblB.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblB.setForeground(Color.GRAY);
		lblB.setBounds(272, 72, 46, 14);
		contentPane.add(lblB);
		
		JLabel lblSegmento_1 = new JLabel("Segmento C");
		lblSegmento_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSegmento_1.setForeground(new Color(0, 0, 0));
		lblSegmento_1.setBounds(25, 98, 85, 21);
		contentPane.add(lblSegmento_1);
		
		JLabel lblC = new JLabel("0");
		lblC.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblC.setForeground(Color.GRAY);
		lblC.setBounds(272, 105, 46, 14);
		contentPane.add(lblC);
		
		JPanel panelResp = new JPanel();
		panelResp.setBounds(164, 146, 310, 104);
		contentPane.add(panelResp);
		panelResp.setLayout(null);
		
		panelResp.setVisible(false);
		
		JLabel lblForma = new JLabel("Forma ou n\u00E3o?");
		lblForma.setHorizontalAlignment(SwingConstants.CENTER);
		lblForma.setForeground(new Color(153, 204, 255));
		lblForma.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblForma.setBounds(10, 24, 290, 14);
		panelResp.add(lblForma);
		
		JLabel lblTipoTriangulo = new JLabel("Tipo de tri\u00E2ngulo");
		lblTipoTriangulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTipoTriangulo.setForeground(new Color(255, 102, 51));
		lblTipoTriangulo.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblTipoTriangulo.setBounds(10, 65, 290, 14);
		panelResp.add(lblTipoTriangulo);
		
		JSlider sliderA = new JSlider();
		sliderA.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				lblA.setText(Integer.toString(sliderA.getValue()));
			}
		});
		sliderA.setValue(0);
		sliderA.setMaximum(20);
		sliderA.setBounds(142, 40, 107, 14);
		contentPane.add(sliderA);
		
		JSlider sliderB = new JSlider();
		sliderB.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				lblB.setText(Integer.toString(sliderB.getValue()));
			}
		});
		sliderB.setValue(0);
		sliderB.setMaximum(20);
		sliderB.setBounds(142, 72, 107, 14);
		contentPane.add(sliderB);
		
		JSlider sliderC = new JSlider();
		sliderC.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				lblC.setText(Integer.toString(sliderC.getValue()));
			}
		});
		sliderC.setValue(0);
		sliderC.setMaximum(20);
		sliderC.setBounds(142, 105, 107, 14);
		contentPane.add(sliderC);
		
		JButton btnVerificar = new JButton("Verificar");
		btnVerificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a = sliderA.getValue();
				int b = sliderB.getValue();
				int c = sliderC.getValue();
				
				if (a<b+c && b<a+c && c<a+b) {
					lblForma.setText("Formam um triângulo");
					if (a==b && b==c) {
						lblTipoTriangulo.setText("Equilátero");
					} else if (a!=b && b!=c && a!=c) {
						lblTipoTriangulo.setText("Escaleno		");
					} else {
						lblTipoTriangulo.setText("Isósceles");
					}
				} else {
					lblForma.setText("Não formam um triângulo");
					lblTipoTriangulo.setText("-----");
				}
				
				panelResp.setVisible(true);
			}
		});
		btnVerificar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnVerificar.setBounds(21, 146, 89, 32);
		contentPane.add(btnVerificar);
		
	}
}
