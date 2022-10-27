package UD20_Grupo1.UD20_ProyectoMaven;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Ex01 extends JFrame{

	private JPanel contentPane;
	
    public static void main( String[] args )
    {        
        Ex01 ventana = new Ex01();
    }
    
    
    public Ex01() {
    	
		setTitle("titulo");
		setBounds(400,200,250,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel etiqueta = new JLabel("Etiqueta");
		etiqueta.setBounds(60, 20, 100, 20);
		contentPane.add(etiqueta);
    
    }
    
}
