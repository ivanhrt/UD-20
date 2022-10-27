package UD20_Grupo1.UD20_ProyectoMaven;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class Ex2 extends JFrame{
	
	private JPanel contentPane;
	
    public static void main( String[] args )
    {
        
        Ex2 ex2 = new Ex2();
    }	
    
    public Ex2() {
    	
		setTitle("titulo");
		setBounds(400,200,450,150);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JButton boton1 = new JButton("Boton 1");
		boton1.setBounds(200,40,89,23);
		contentPane.add(boton1);
		
		JLabel etiqueta1 = new JLabel("");
		etiqueta1.setBounds(40, 40, 200, 20);
		contentPane.add(etiqueta1);	
		
		boton1.addActionListener(new ActionListener(){
			public void actionPerformed (ActionEvent e) {	
				
				etiqueta1.setText("Has pulsado boton 1");				
			}			
		});
		
		JButton boton2 = new JButton("Boton 2");
		boton2.setBounds(300,40,89,23);
		contentPane.add(boton2);	
		
		JLabel etiqueta2 = new JLabel("");
		etiqueta2.setBounds(40, 40, 200, 20);
		contentPane.add(etiqueta2);	
		
		boton2.addActionListener(new ActionListener(){
			public void actionPerformed (ActionEvent e) {	
				
				etiqueta2.setText("Has pulsado boton 2");	
			}
		});
		
		

    }
}
