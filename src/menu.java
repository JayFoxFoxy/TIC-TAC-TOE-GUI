import javax.swing.*;
import java.awt.*;

public class menu {
	
	public menu(){
		
		JButton bt1, bt2, bt3, bt4, bt5, bt6;
		JLabel lb1;
		
		JFrame frame = new JFrame("TIC TAC TOE");
		JPanel panel = new JPanel();
		
		bt1 = new JButton("1"); 
		bt2 = new JButton("2"); 
		bt3 = new JButton("3"); 
		bt4 = new JButton("4"); 
		bt5 = new JButton("5"); 
		bt6 = new JButton("6"); 
		
		//lb1 = new JLabel();
		
		panel.setLayout(new GridLayout(3,4,2,2));
		panel.add(bt1);
		panel.add(bt2);
		panel.add(bt3);
		panel.add(bt4);
		panel.add(bt5);
		panel.add(bt6);
		//panel.add(lb1);
		
		frame.add(panel);
		
		frame.setSize(400, 400);
		//panel.setSize(800, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//frame.pack();
		frame.setVisible(true);
	}
	
	

	public static void main(String[] args) {

		
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				new menu();				
			}
			
		});
		
		
		
	}
}
