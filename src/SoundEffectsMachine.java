import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SoundEffectsMachine implements ActionListener{
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton();
	JButton button2 = new JButton();
	JButton button3 = new JButton();
	JButton button4 = new JButton();
	public static void main(String[] args) {
		SoundEffectsMachine sound = new SoundEffectsMachine();
		sound.showButton();
	}
		public void showButton() {
			System.out.println("Button Clicked");
				frame.setVisible(true);
				frame.add(panel);
				panel.add(button);
				panel.add(button2);
				panel.add(button3);
				panel.add(button4); 
				frame.pack();
				button.addActionListener(this);
				button2.addActionListener(this);
				button3.addActionListener(this);
				button4.addActionListener(this);
	}
		public void actionPerformed(ActionEvent arg0) {
			JButton buttonPressed = (JButton) arg0.getSource();
			if(buttonPressed.equals(button)) {
				playSound("drum.wav");
			}
			else if(buttonPressed.equals(button2)) {
				playSound("homer-woohoo.wav");
			}
			else if(buttonPressed.equals(button3)) {
				playSound("sawing-wood-daniel_simon.wav");
			}
			else {
				playSound("cymbal.wav");
			}
			}
		private void playSound(String fileName) {
		     AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName)); 
		     sound.play();
		}

}
