package day48;

import java.awt.event.*;

import javax.swing.*;

class MenuActionListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(null,"팝업");
	}
	
}

public class MenuTest extends JFrame{
	MenuTest(){
		setTitle("Menu 만들기");
		createMenu();
		setSize(250, 200);
		setVisible(true);
	}
	public void createMenu() {
		JMenuBar mb=new JMenuBar();
		JMenu screenMenu=new JMenu("메뉴바1");
		
		screenMenu.add(new JMenuItem("Load"));
		screenMenu.addSeparator();
		screenMenu.add(new JMenuItem("Hide"));
		screenMenu.addSeparator();
		screenMenu.add(new JMenuItem("ReShow"));
		screenMenu.addSeparator();
		screenMenu.add(new JMenuItem("Exit"));

		JMenuItem item=new JMenuItem("팝업");
		item.addActionListener(new MenuActionListener());
		
		screenMenu.add(item);
		
		mb.add(screenMenu);
		mb.add(new JMenu("편집")); 
		mb.add(new JMenu("실행"));
		mb.add(new JMenu("도움말"));
		
		setJMenuBar(mb);
		
		
	}
	public static void main(String[] args) {
		new MenuTest();
	}

}
