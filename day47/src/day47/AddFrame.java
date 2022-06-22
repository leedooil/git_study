package day47;

import java.awt.FlowLayout;

import javax.swing.*;

public class AddFrame extends JFrame{
	public AddFrame() {
		setTitle("JFrame");
		setSize(300,300);
		
		JButton button = new JButton("button");
		JCheckBox box = new JCheckBox("checkbox");
		JSlider slide = new JSlider();
		JTextField tf = new JTextField("text ют╥б",20);
		this.setLayout(new FlowLayout());
		
		this.add(button);
		this.add(box);
		this.add(slide);
		this.add(tf);
		
		setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new AddFrame();
		
	}

}
