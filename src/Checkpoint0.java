import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class Checkpoint0 implements KeyListener{
	
public static void main(String[] args) {
	Checkpoint0 checkpoint = new Checkpoint0();
	checkpoint.keyListener();
}
private void keyListener() {
	JFrame frame = new JFrame();
	frame.setVisible(true);
	frame.addKeyListener(this);
	
}

static void speak(String words) {
    try {
         Runtime.getRuntime().exec("say " + words).waitFor();
    } catch (Exception e) {
         e.printStackTrace();
         }
    }
@Override
public void keyTyped(KeyEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void keyPressed(KeyEvent e) {
	// TODO Auto-generated method stub
	System.out.println("typed");
	speak("ouch");
}
@Override
public void keyReleased(KeyEvent e) {
	// TODO Auto-generated method stub
	
}
}