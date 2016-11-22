package advanceJava;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AWT extends Frame{
	AWT(){
	Button b = new Button("close");
	
	b.setBounds(50,100,100,50);
	add(b);
	setTitle("new thing");
	setSize(250, 250);
	setLayout(new FlowLayout());
	setVisible(true);
	b.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			System.exit(0);
		}
	});
	}
	
	public static void main(String[] args) {
		AWT ob = new AWT();
	}

}
