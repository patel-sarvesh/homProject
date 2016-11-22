package advanceJava;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingTest{
	
	public static void main(String[] args) {
		JFrame frame = new JFrame("My First Frame");
		frame.setSize(400, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.add(panel);
		
		placeComponent(panel);
		frame.setVisible(true);
	}
	
	public static void placeComponent(JPanel panel){
		panel.setLayout(null);
		
		JLabel uLabel = new JLabel("User Id");
		uLabel.setBounds(10, 20, 80, 25);
		panel.add(uLabel);
		
		JLabel pLabel = new JLabel("Password");
		pLabel.setBounds(10, 50, 80, 25);
		panel.add(pLabel);
		
		JTextField uText = new JTextField(25);
		uText.setBounds(100, 20, 150, 25);
		panel.add(uText);
		
		JPasswordField pText = new JPasswordField(25);
		pText.setBounds(100, 50, 150, 25);
		panel.add(pText);
		
		JButton button = new JButton("Login");
		button.setBounds(10, 100, 100, 25);
		panel.add(button);
		
		JButton cancel = new JButton("Cancel");
		cancel.setBounds(120, 100, 100, 25);
		panel.add(cancel);
		cancel.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
	}
}
