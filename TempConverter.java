package tempConverter;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TempConverter {

	private static JFrame frame;
	private static JLabel labelC;
	private static JTextField textC;
	private static JLabel labelF;
	private static JTextField textF;
	private static JButton btnCalcCtoF;
	private static JButton btnCalcFtoC;

	public static void main(String[] args) {

		// set up frame
		frame = new JFrame("Temp Converter");
		frame.setSize(150, 200);
		frame.setLayout(new FlowLayout());

		// create UI elements to add to the frame
		labelC = new JLabel("Celsius");
		textC = new JTextField(20);
		labelF = new JLabel("Fahrenheit");
		textF = new JTextField(20);
		btnCalcCtoF = new JButton("Convert C to F");
		btnCalcFtoC = new JButton("Convert F to C");

		// Add ActionListener for C to F
		btnCalcCtoF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// holds user input from celsius text box
				String cText = textC.getText();

				// changing input from a string to a double
				double c = Double.parseDouble(cText);

				// calculation for celsius to farenheit
				double f = (c * 9 / 5) + 32;

				// set text of textF box & converting value of
				// f and change it to a string
				textF.setText(String.valueOf(f));

			}

		});

		// ActionListener for F to C
		btnCalcFtoC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// holds user input from fahrenheit text box
				String fText = textF.getText();

				// changing input from a string to a double
				double f = Double.parseDouble(fText);

				// calculation fahrenheit to celsius
				double c = (f - 32) * 5 / 9;

				// set text of textC box & converting value of
				// c and change it to a string
				textC.setText(String.valueOf(c));

			}

		});

		// add elements to the frame
		frame.add(labelC);
		frame.add(textC);
		frame.add(labelF);
		frame.add(textF);
		frame.add(btnCalcCtoF);
		frame.add(btnCalcFtoC);

		// make frame visible
		frame.setVisible(true);

	}
}
