import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BinaryConverter implements ActionListener {
	JFrame frame = new JFrame();
	JTextField answer = new JTextField(20);
	JLabel label = new JLabel();
	JPanel panel = new JPanel();
	JButton button = new JButton("Convert");
	public static void main(String[] args) {
		BinaryConverter bc = new BinaryConverter();
		bc.setup();
	}

	void setup() {
		frame.setVisible(true);
		frame.add(panel);
		panel.add(answer);
		panel.add(button);
		panel.add(label);
button.addActionListener(this);
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	String convert(String input) {
        if(input.length() != 8){
             JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
             return "-";
        }
        String binary = "[0-1]+";    //must contain numbers in the given range
        if (!input.matches(binary)) {
             JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
             return "-";
        }
        try {
             int asciiValue = Integer.parseInt(input, 2);
             char theLetter = (char) asciiValue;
             return "" + theLetter;
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
             return "-";
        }
   }

	@Override
	public void actionPerformed(ActionEvent e) {
		String c = convert(answer.getText());
		label.setText(c);
	frame.pack();
	}
}
