import javax.swing.*;
import java.awt.*;

public class menu2 {

	public static void buildingthepanel(Container frame){
			 
			JLabel lb1; // Alias to create labels
			JButton bt1, bt2, bt3, bt4, bt5, bt6; // Alias to create the buttons
			JMenuBar m1;
			JMenu mn1, mn2; // Alias to create a menu objects
			JMenuItem menuItem; // Alias to create the index on the menu objects
			GridBagConstraints gbc; // Alias to create the constraints
			
			
			
			frame.setLayout(new GridBagLayout());
			gbc = new GridBagConstraints();
			gbc.fill = GridBagConstraints.HORIZONTAL;
			gbc.ipady = 100; // default height
			gbc.ipadx = 100; // default width
			//gbc.weightx = 100;
			
			m1 = new JMenuBar();
			
			mn1 = new JMenu("Menu");
			mn2 = new JMenu("About");
			
			menuItem = new JMenuItem("New Game");
			mn1.add(menuItem);
			menuItem = new JMenuItem("Quit");
			mn1.add(menuItem);
			
			menuItem = new JMenuItem("About me");
			mn2.add(menuItem);
			
			m1.add(mn1);
			m1.add(mn2);
			
			gbc.fill = GridBagConstraints.HORIZONTAL;
			gbc.gridy = 0;
		    gbc.gridx = 0;
		    //gbc.gridwidth = 2;
		    frame.add(m1, gbc);
			
			
			
			
			bt1 = new JButton("Button 1");
			//gbc.weightx = 1.0;
		    gbc.fill = GridBagConstraints.HORIZONTAL;
		    gbc.gridy = 1;
		    gbc.gridx = 0;
		    frame.add(bt1, gbc);
		    
		    bt2 = new JButton("Button 2");
			//gbc.weightx = 0.0;
		    gbc.fill = GridBagConstraints.HORIZONTAL;
		    gbc.gridy = 1;
		    gbc.gridx = 1;
		    frame.add(bt2, gbc);
		    
		    bt3 = new JButton("Button 3");
			//gbc.weightx = 0.0;
		    gbc.fill = GridBagConstraints.HORIZONTAL;
		    gbc.gridy = 2;
		    gbc.gridx = 0;
		    frame.add(bt3, gbc);
		    
		    bt4 = new JButton("Button 4");
			//gbc.weightx = 0.0;
		    gbc.fill = GridBagConstraints.HORIZONTAL;
		    gbc.gridy = 2;
		    gbc.gridx = 1;
		    frame.add(bt4, gbc);
		    
		    bt5 = new JButton("Button 5");
			//gbc.weightx = 0.0;
		    gbc.fill = GridBagConstraints.HORIZONTAL;
		    gbc.gridy = 3;
		    gbc.gridx = 0;
		    frame.add(bt5, gbc);
		    
		    bt6 = new JButton("Button 6");
			//gbc.weightx = 0.0;
		    gbc.fill = GridBagConstraints.HORIZONTAL;
		    gbc.gridy = 3;
		    gbc.gridx = 1;
		    frame.add(bt6, gbc);
		    
		    lb1 = new JLabel("TIC TAC TOE");
		    //gbc.ipady = 200;
			//gbc.weightx = 100;
		    gbc.fill = GridBagConstraints.HORIZONTAL;
		    gbc.gridy = 4;
		    gbc.gridx = 0;
		    gbc.gridwidth = 2;
		    frame.add(lb1, gbc);
		    
			
		}
	
	public static void showGui() {
		
		//int[][] board = new int[3][3];
		
		JFrame frame = new JFrame("TIC TAC TOE");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //JPanel panel = new JPanel();
 
        //Set up the content pane.
        buildingthepanel(frame.getContentPane());
 
        //Display the window.
        //frame.setSize(400, 400);
        //frame.add(panel);
        frame.setLocation(450, 50);
        frame.pack(); // Fit the frame to all the objects
        frame.setResizable(false);
        frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		
		
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                showGui();
            }
        });
	}

}
