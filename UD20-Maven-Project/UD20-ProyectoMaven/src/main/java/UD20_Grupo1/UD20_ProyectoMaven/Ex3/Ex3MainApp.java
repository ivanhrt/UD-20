package UD20_Grupo1.UD20_ProyectoMaven.Ex3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ex3MainApp {

	private JFrame frmVentanaConMs;
	
	int contBtn1=0,contBtn2=0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ex3MainApp window = new Ex3MainApp();
					window.frmVentanaConMs.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Ex3MainApp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmVentanaConMs = new JFrame();
		frmVentanaConMs.setTitle("Ventana con más interacción");
		frmVentanaConMs.setBounds(100, 100, 450, 300);
		frmVentanaConMs.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmVentanaConMs.getContentPane().setLayout(null);
		
		
		
		JLabel lblNewLabel = new JLabel("Botón 1: 0 veces");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(10, 11, 140, 28);
		frmVentanaConMs.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Botón 2: 0 veces");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(213, 11, 140, 28);
		frmVentanaConMs.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Boton 1");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contBtn1++;
				lblNewLabel.setText("Boton 1: "+contBtn1+" veces");
			}
		});
		btnNewButton.setBounds(30, 50, 89, 23);
		frmVentanaConMs.getContentPane().add(btnNewButton);
		
		JButton btnBoton = new JButton("Botón 2");
		btnBoton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contBtn2++;
				lblNewLabel_1.setText("Botón 2: "+contBtn2+" veces");
			}
		});
		btnBoton.setBounds(223, 50, 89, 23);
		frmVentanaConMs.getContentPane().add(btnBoton);
	}

}
