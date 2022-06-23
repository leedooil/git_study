package day48;

import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;

public class AddFrame2 extends JFrame {
	AddFrame2(){
			setTitle("JFrame");
			setSize(300,300);
			
			JButton button = new JButton("button");
			JCheckBox box = new JCheckBox("checkbox");
			JSlider slide = new JSlider();
			JTextField tf = new JTextField("text 입력",20);
			this.setLayout(new FlowLayout());
			
			this.add(button); 
			this.add(box);
			this.add(slide);
			this.add(tf);
			
			setVisible(true);
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			button.addActionListener(new Listener1());
		}

	public static void main(String[] args) {
		new AddFrame2();
		
	}

}
class Listener1 implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton button = (JButton)e.getSource();
		button.setText("버튼 클릭");
	}
	
}


