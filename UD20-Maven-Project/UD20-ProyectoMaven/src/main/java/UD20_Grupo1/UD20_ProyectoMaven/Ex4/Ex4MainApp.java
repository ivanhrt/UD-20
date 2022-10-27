package UD20_Grupo1.UD20_ProyectoMaven.Ex4;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowStateListener;

public class Ex4MainApp extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ex4MainApp frame = new Ex4MainApp();
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
	public Ex4MainApp() {
	
		setTitle("Ventana oyente");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setWrapStyleWord(true);
		textArea.setText("Texto inicial");
		textArea.setBounds(20, 11, 264, 173);
		contentPane.add(textArea);
		
		JLabel lblNewLabel = new JLabel("Eventos");
		lblNewLabel.setFont(new Font("Calibri", Font.BOLD, 14));
		lblNewLabel.setBounds(294, 14, 72, 23);
		contentPane.add(lblNewLabel);
		
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent e) {
				textArea.setText(textArea.getText()+"\nVentana abierta");
			}
			@Override
			public void windowActivated(WindowEvent e) {
				textArea.setText(textArea.getText()+"\nVentana activada");
			}
		});
		addWindowStateListener(new WindowStateListener() {
			public void windowStateChanged(WindowEvent e) {
				textArea.setText(textArea.getText()+"\nLa ventana ha cambiado");
			}
		});
		
	}
}
