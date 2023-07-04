package swing;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class window {
	public static JFrame frame = new JFrame("动物识别");
	public static JPanel container = new JPanel();
	public static JLabel label = new JLabel("");
	public static JTextField text = new JTextField(50);
	
	public static void init(){
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800,120);
		initcontainer();
		frame.setContentPane(container);
		frame.setVisible(true);
	}
	public static void initcontainer() {
		JButton button = new JButton("百科");
		ButtonActionListener b1 = new ButtonActionListener();
		button.addActionListener(b1);
		label.setBounds(40, 80, 720, 30);
		container.add(text);
		container.add(button);
		container.add(label);
	}
}
