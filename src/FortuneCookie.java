import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FortuneCookie implements ActionListener{
	public static void main(String[] args) {
		FortuneCookie fc = new FortuneCookie();
		fc.showButton();
		
		
	}
	
public void showButton() {
	System.out.println("Button Clicked");
		JFrame frame = new JFrame();
		frame.setVisible(true);
		JButton button = new JButton();
		frame.add(button);
		button.addActionListener(this);
		
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	int rand = new Random().nextInt(5);
	if(rand == 1) {
		JOptionPane.showMessageDialog(null, "A beautiful, smart, and loving person will be coming into your life.");
	}
	else if (rand == 2) {
		JOptionPane.showMessageDialog(null, "A golden egg of opportunity falls into your lap this month.");
	}
	else if(rand == 3) {
		JOptionPane.showMessageDialog(null, "Good news will be brought to you by mail.");
	}
	else if(rand == 4) {
		JOptionPane.showMessageDialog(null, "Happiness will bring you good luck.");
	}
	else {
		JOptionPane.showMessageDialog(null, "Others can help you now.");
	}
	JOptionPane.showMessageDialog(null, "Woohoo");
}


}
