package advanceJava;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyApplet extends Applet implements KeyListener{
	String str = "";
	
	public void init(){
		addKeyListener(this);
	}
	
	public void keyPressed(KeyEvent k){
		showStatus("KeyPressed");
	}
	
	public void keyReleased(KeyEvent k){
		showStatus("KeyReleased");
	}
	
	public void keyTyped(KeyEvent k){
		str = str+k.getKeyChar();
		repaint();
	}
	
	public void paint(Graphics g){
		g.drawString(str, 20, 20);
	}

}
