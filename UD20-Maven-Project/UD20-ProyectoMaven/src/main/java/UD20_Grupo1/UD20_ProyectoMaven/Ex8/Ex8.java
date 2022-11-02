package UD20_Grupo1.UD20_ProyectoMaven;

import java.awt.event.*;
import javax.swing.*;

public class Ex8 extends JFrame{
	
	private JPanel contentPane;
	
	double euro = 0;
	double pta = 0;
	boolean euroapta = true;
	String europta = "euro a pta";
	String ptaeuro = "pta a euro";
	JButton boton1;
	JButton boton2;
	JButton boton3;
	
	public static void main( String[] args )
	{        
	        Ex8 ex8 = new Ex8();		       
	}
			
	
	public Ex8(){		
		
		
		    setTitle("Calculadora de cambio de monedas");
			setBounds(400,200,550,200);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			setVisible(true);
			
			contentPane = new JPanel();
			contentPane.setLayout(null);
			setContentPane(contentPane);
			
			JLabel etiqueta1 = new JLabel("Cantidad a convertir");
			etiqueta1.setBounds(40, 20, 200, 20);
			contentPane.add(etiqueta1);
			
			JTextField textField = new JTextField();
			textField.setBounds(180,20,100,26);
			contentPane.add(textField);	
			
			JLabel etiqueta2 = new JLabel("Resultado");
			etiqueta2.setBounds(320, 20, 200, 20);
			contentPane.add(etiqueta2);
			contentPane.setVisible(true);
					
			JLabel etiqueta3 = new JLabel("");
			etiqueta3.setBounds(390, 20, 200, 20);
			contentPane.add(etiqueta3);		
			
			boton1 = new JButton(europta);
			boton1.setBounds(120,70,120,23);
			contentPane.add(boton1);				
								
			boton1.addActionListener(new ActionListener(){
				public void actionPerformed (ActionEvent e) {	
					
					etiqueta3.setText("    ");
									
					contentPane.add(etiqueta3);	
					
					try {
											
						if (euroapta == true) {
											
							euro = Double.parseDouble(textField.getText());	
							pta = euro * 166.386;					
							String text=Double.toString(pta);  
							etiqueta3.setText(text);
							System.out.println(pta);
								
						}else {
											
							pta = Double.parseDouble(textField.getText());
							euro = pta / 166.386;					
							String text2=Double.toString(euro);  
							etiqueta3.setText(text2);
							System.out.println(euro);										
						}
					
						}catch(Exception ex) {
							System.out.println("NumberFormatException => " + ex.getMessage());
							JOptionPane.showMessageDialog(null,"Introducir sólo números");
						}
											
				}			
			});
			
			boton2 = new JButton("Cambiar");
			boton2.setBounds(280,70,120,23);
			contentPane.add(boton2);
			
			boton2.addActionListener(new ActionListener(){
				public void actionPerformed (ActionEvent e) {	
					
					etiqueta3.setText("    ");
					
					if(euroapta == true) {	
						boton1.setText(ptaeuro);
						euroapta = false;
					}else {
						boton1.setText(europta);
						euroapta = true;
					}
				}			
			});
					  			  			  
			boton3 = new JButton("Limpiar");
			boton3.setBounds(200,110,120,23);
			contentPane.add(boton3);
			
			boton3.addActionListener(new ActionListener(){
				public void actionPerformed (ActionEvent e) {	
					
					textField.setText("");					
					etiqueta3.setText("");
				}			
			});
	
													
	}
		

}
