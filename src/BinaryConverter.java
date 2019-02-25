import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BinaryConverter implements ActionListener {
	public static void main(String[] args) {
		BinaryConverter bc = new BinaryConverter();
		bc.setup();
	}

	void setup() {
		JFrame frame = new JFrame();
		JTextField answer = new JTextField(20);
		JLabel label = new JLabel();
		JPanel panel = new JPanel();
		JButton button = new JButton();
		frame.setVisible(true);
		frame.add(panel);
		panel.add(answer);
		panel.add(label);
		panel.add(button);
button.addActionListener(this);
		frame.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
