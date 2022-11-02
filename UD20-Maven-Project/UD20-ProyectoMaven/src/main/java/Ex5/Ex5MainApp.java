package Ex5;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.ActionEvent;


public class Ex5MainApp extends JFrame implements MouseListener {

	private JPanel contentPane;
	static JTextPane textPane = new JTextPane();
	static String txt="";
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ex5MainApp frame = new Ex5MainApp();
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
	public Ex5MainApp() {
		//addMouseListener(this);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 542);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textPane.setBounds(33, 62, 393, 430);
		contentPane.add(textPane);
		textPane.addMouseListener(this);
		

		JButton btnNewButton = new JButton("Limpiar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txt="";
				textPane.setText(txt);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.setBounds(173, 22, 85, 21);
		contentPane.add(btnNewButton);
}

	@Override
	public void mouseClicked(MouseEvent e) {
		txt+="\n Mouse Clicked";
		textPane.setText(txt);		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		txt+="\n Mouse Entered";
		textPane.setText(txt);		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		txt+="\n Mouse Exited";
		textPane.setText(txt);		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		txt+="\n Mouse Pressed";
		textPane.setText(txt);		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		txt+="\n Mouse Released";
		textPane.setText(txt);		
	}
}